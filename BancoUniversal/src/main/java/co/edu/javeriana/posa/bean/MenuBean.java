package co.edu.javeriana.posa.bean;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
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

	public MenuBean() {

		try {
			cliente = (Cliente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("Cliente");
			if (cliente != null) {
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

	public void changeCuenta() {
		System.out.println("Cambiando a: " + cuentaPay);
	}

	public void pagarP() {

		if (cuentaPay.equals("")) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Debe seleccionar una cuenta", "");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} else {
			String[] cuentaReq = cuentaPay.split(",");
			Cuenta cuentaDebitar = consultarCuenta(cuentaReq[0], cuentaReq[1]);
			BigDecimal pagoADebitar = new BigDecimal(pagoDebita);

			if (cuentaDebitar.getSaldoCuenta().compareTo(pagoADebitar) < 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fondos Insuficientes", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} else if (selectedPresta.getDeudaPrestamo().compareTo(pagoADebitar) < 0) {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
						"El valor a pagar no puede ser superior a la deuda", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			} else {
				FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Pago Exitoso", "");
				FacesContext.getCurrentInstance().addMessage(null, msg);
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

}
