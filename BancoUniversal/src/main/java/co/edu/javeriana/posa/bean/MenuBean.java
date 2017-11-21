package co.edu.javeriana.posa.bean;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import co.edu.javeriana.posa.objects.Cliente;
import co.edu.javeriana.posa.objects.Cuenta;
import co.edu.javeriana.posa.objects.PagoProgramado;
import co.edu.javeriana.posa.objects.Prestamo;
import co.edu.javeriana.posa.services.BrokerRestCuenta;
import co.edu.javeriana.posa.services.BrokerRestPagosProgramados;
import co.edu.javeriana.posa.services.BrokerRestPrestamo;

public class MenuBean implements Serializable {

	private Cliente cliente;
	private List<Cuenta> cuentascliente;
	private List<Prestamo> prestamosCliente;
	private List<PagoProgramado> pagosProgramados;
	private Cuenta selectedCuenta;
	private Prestamo selectedPresta;
	private PagoProgramado selectedPagoProgramado;
	private String cuentaPay;
	private double pagoDebita;
	private List<String> empresas;
	private String tipoServicio;
	private String empresa;
	private String numeroFactura;
	private String cuentaPay2;
	private Date fecha;
	private double valorPagp;

	public MenuBean() {

		try {
			empresas = new ArrayList<String>();
			empresas.add("Tigo");
			empresas.add("Claro");
			empresas.add("Movistar");
			cliente = (Cliente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("Cliente");
			if (cliente != null) {
				consultarListas();
			} else {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
						"El usuario no se ha autenticado");
				FacesContext.getCurrentInstance().addMessage(null, msg);
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect(FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath()
								+ "/inicio.xhtml");
			}
		} catch (Exception ex) {
			System.out.println("Error " + ex.getMessage());
		}

	}

	private void consultarListas() {

		BrokerRestCuenta cuentas = new BrokerRestCuenta();
		Cuenta cuentaCl = new Cuenta();
		cuentaCl.setTipoDocumento(cliente.getIdTipoDoc());
		cuentaCl.setDocumento(cliente.getNumeroDocumento());
		cuentascliente = cuentas.getCuenta(cuentaCl);

		BrokerRestPrestamo prestamos = new BrokerRestPrestamo();
		Prestamo prestamosCl = new Prestamo();
		prestamosCl.setTipoDocumento(cliente.getIdTipoDoc());
		prestamosCl.setDocumento(cliente.getNumeroDocumento());
		prestamosCliente = prestamos.getPrestamo(prestamosCl);

		BrokerRestPagosProgramados pagos = new BrokerRestPagosProgramados();
		PagoProgramado pago = new PagoProgramado();
		pago.setTipoDocumento(cliente.getIdTipoDoc());
		pago.setDocumento(cliente.getNumeroDocumento());
		pagosProgramados = pagos.getPagosProgramado(pago);
	}

	public void changeCuenta() {
		System.out.println("Cambiando a: " + cuentaPay);
	}

	public void changeCuenta2() {
		System.out.println("Cambiando a: " + cuentaPay2);
	}

	public void changeTipo() {
		System.out.println("Cambiando a: " + tipoServicio);
		if (tipoServicio.equals("3")) {
			empresas = new ArrayList<String>();
			empresas.add("Gas Natural");
			empresas.add("Energy Service");
			empresas.add("Gas Propano Bogotá");
		} else if (tipoServicio.equals("2")) {
			empresas = new ArrayList<String>();
			empresas.add("Codensa");
			empresas.add("EEB");
		} else if (tipoServicio.equals("1")) {
			empresas = new ArrayList<String>();
			empresas.add("Tigo");
			empresas.add("Claro");
			empresas.add("Movistar");
		} else {
			empresas = new ArrayList<String>();
		}
	}

	public void changeEmpresa() {
		System.out.println("Cambiando a: " + empresa);
	}

	public void pagarP() {

		if (cuentaPay.equals("")) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Debe seleccionar una cuenta", "");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
			String[] cuentaReq = cuentaPay.split(",");
			Cuenta cuentaDebitar = consultarCuenta(cuentaReq[0], cuentaReq[1]);
			BigDecimal pagoADebitar = new BigDecimal(pagoDebita);

			if (pagoDebita <= 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "El pago debe ser Mayor a 0", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} else if (cuentaDebitar.getSaldoCuenta().compareTo(pagoADebitar) < 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fondos Insuficientes", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} else if (selectedPresta.getDeudaPrestamo().compareTo(pagoADebitar) < 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"El valor a pagar no puede ser superior a la deuda", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} else {
				try {
					selectedPresta.setValorPagado(pagoADebitar);
					BrokerRestPagosProgramados pagos = new BrokerRestPagosProgramados();
					pagos.pagarPrestamos(selectedPresta, cuentaDebitar);
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Pago Exitoso", "");
					FacesContext.getCurrentInstance().addMessage(null, msg);
					consultarListas();
					pagoDebita = 0;
					cuentaPay = "";
					RequestContext.getCurrentInstance().execute("PF('prestaDialog').hide();");
				} catch (Exception e) {
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Se ha presentado un error", "");
					FacesContext.getCurrentInstance().addMessage(null, msg);
				}
			}
		}
	}

	public void logOut() {

		try {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			FacesContext.getCurrentInstance().getExternalContext().redirect("/BancoUniversal/inicio.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Cuenta consultarCuenta(String tipo, String numero) {

		Cuenta c = new Cuenta();
		c.setTipoCuenta(tipo);
		c.setNumeroCuenta(numero);
		BrokerRestCuenta cuentas = new BrokerRestCuenta();
		List<Cuenta> cuentasL = cuentas.getCuenta(c);
		if (cuentasL != null) {
			c = cuentasL.get(0);
		}
		return c;
	}

	public void programarPago() {

		if (cuentaPay2.equals("")) {

		} else {
			try {
				if (numeroFactura.equals("")) {
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Digite el número de factura", "");
					FacesContext.getCurrentInstance().addMessage(null, msg);
				} else if (valorPagp <= 0) {
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "El valor del pago debe ser mayor a 0", "");
					FacesContext.getCurrentInstance().addMessage(null, msg);
				} else {

					BrokerRestPagosProgramados prog = new BrokerRestPagosProgramados();
					String[] cuentaReq = cuentaPay2.split(",");
					Cuenta cuenta = consultarCuenta(cuentaReq[0], cuentaReq[1]);

					PagoProgramado pago = new PagoProgramado();
					pago.setTipoServicio(
							tipoServicio.equals("1") ? "Telefonia" : tipoServicio.equals("2") ? "Luz" : "Gas");
					pago.setEmpresa(empresa);
					pago.setNumeroFactura(numeroFactura);
					String FORMATER = "yyyy-MM-dd";
					DateFormat format = new SimpleDateFormat(FORMATER);	
					Date date = Calendar.getInstance().getTime();
					pago.setFechaProgramacion(format.format(date));
					pago.setTipoCuenta(Integer.parseInt(cuenta.getTipoCuenta()));
					pago.setNumeroCuenta(cuenta.getNumeroCuenta());
					pago.setTipoDocumento(cliente.getIdTipoDoc());
					pago.setDocumento(cliente.getNumeroDocumento());
					pago.setNalInternal(1);
					pago.setEstado("Pendiente");
					pago.setValorPago(new BigDecimal(valorPagp));
					prog.register(pago);
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Pago Programado", "");
					FacesContext.getCurrentInstance().addMessage(null, msg);
					consultarListas();
				}
			} catch (Exception ex) {
				System.out.println("Error " + ex.getMessage());
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Se ha presentado un Error", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		}

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cuenta> getCuentascliente() {
		return cuentascliente;
	}

	public void setCuentascliente(List<Cuenta> cuentascliente) {
		this.cuentascliente = cuentascliente;
	}

	public List<Prestamo> getPrestamosCliente() {
		return prestamosCliente;
	}

	public void setPrestamosCliente(List<Prestamo> prestamosCliente) {
		this.prestamosCliente = prestamosCliente;
	}

	public Cuenta getSelectedCuenta() {
		return selectedCuenta;
	}

	public void setSelectedCuenta(Cuenta selectedCuenta) {
		this.selectedCuenta = selectedCuenta;
	}

	public Prestamo getSelectedPresta() {
		return selectedPresta;
	}

	public void setSelectedPresta(Prestamo selectedPresta) {
		this.selectedPresta = selectedPresta;
	}

	public List<PagoProgramado> getPagosProgramados() {
		return pagosProgramados;
	}

	public void setPagosProgramados(List<PagoProgramado> pagosProgramados) {
		this.pagosProgramados = pagosProgramados;
	}

	public PagoProgramado getSelectedPagoProgramado() {
		return selectedPagoProgramado;
	}

	public void setSelectedPagoProgramado(PagoProgramado selectedPagoProgramado) {
		this.selectedPagoProgramado = selectedPagoProgramado;
	}

	public String getCuentaPay() {
		return cuentaPay;
	}

	public void setCuentaPay(String cuentaPay) {
		this.cuentaPay = cuentaPay;
	}

	public double getPagoDebita() {
		return pagoDebita;
	}

	public void setPagoDebita(double pagoDebita) {
		this.pagoDebita = pagoDebita;
	}

	public List<String> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<String> empresas) {
		this.empresas = empresas;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public String getCuentaPay2() {
		return cuentaPay2;
	}

	public void setCuentaPay2(String cuentaPay2) {
		this.cuentaPay2 = cuentaPay2;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getValorPagp() {
		return valorPagp;
	}

	public void setValorPagp(double valorPagp) {
		this.valorPagp = valorPagp;
	}

}
