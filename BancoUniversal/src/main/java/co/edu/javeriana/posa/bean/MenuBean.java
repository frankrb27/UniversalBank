package co.edu.javeriana.posa.bean;

import java.io.IOException;
import java.io.Serializable;
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
				PagoProgramado pago= new PagoProgramado();
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
	
	public void logOut() {

		try {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			FacesContext.getCurrentInstance().getExternalContext()
					.redirect("/BancoUniversal/inicio.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
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

	
	
	
}
