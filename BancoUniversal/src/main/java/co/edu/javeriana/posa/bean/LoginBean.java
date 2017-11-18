/**
 * 
 */
package co.edu.javeriana.posa.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

import co.edu.javeriana.posa.objects.Cliente;
import co.edu.javeriana.posa.services.BrokerRestLogin;
import co.edu.javeriana.posa.string.StringUtils;

/**
 * @author frank
 *
 */
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String rol;
	private Cliente cliente;
	private boolean estaLogeado;
	private String tipoDoc;
	private String numDoc;
	private String razonSocial;
	private String tipoDocal;
	private String pNombre;
	private String sNombre;
	private String pApellido;
	private String sApellido;
	private String telefono;
	private String direccion;
	private String ciudad;
	private String depto;

	public LoginBean() {
	}

	public void login(ActionEvent actionEvent) {
		FacesMessage msg = null;
		BrokerRestLogin autenticacion = new BrokerRestLogin();
		Cliente cliente_ = new Cliente();
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

		try {

			if (StringUtils.isNullorisEmpty(userName)) {
				msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario es requerido", "");
			} else if (StringUtils.isNullorisEmpty(password)) {
				msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña es requerida", "");
			} else if (StringUtils.isNullorisEmpty(rol)) {
				msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Seleccione un Rol", "");
			} else {
				cliente_.setUsuario(userName);
				cliente_.setPassword(password);
				cliente_ = autenticacion.login(cliente_);
				if (cliente_ != null && null != cliente_.getIdCliente() && cliente_.getIdCliente() > 0) {
					msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido", "");
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("Cliente", cliente_);
					if (rol.equals("1")) {
						RequestContext.getCurrentInstance().addCallbackParam("view", "pages/cliente/MenuCliente.xhtml");
					} else if (rol.equals("2")) {
						RequestContext.getCurrentInstance().addCallbackParam("view",
								"pages/proveedor/MenuProveedor.xhtml");
					}

					estaLogeado = true;
				} else {
					msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Alerta", "Datos ingresados incorrectamente");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERROR", "Error al iniciar sesión");
		}

		FacesContext.getCurrentInstance().addMessage(null, msg);
		RequestContext.getCurrentInstance().addCallbackParam("estaLogeado", estaLogeado);
	}
	
	public void logout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.invalidate();
		estaLogeado = false;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the usuario
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the usuario to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the estaLogeado
	 */
	public boolean isEstaLogeado() {
		return estaLogeado;
	}

	/**
	 * @param estaLogeado
	 *            the estaLogeado to set
	 */
	public void setEstaLogeado(boolean estaLogeado) {
		this.estaLogeado = estaLogeado;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getTipoDocal() {
		return tipoDocal;
	}

	public void setTipoDocal(String tipoDocal) {
		this.tipoDocal = tipoDocal;
	}

	public String getpNombre() {
		return pNombre;
	}

	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getpApellido() {
		return pApellido;
	}

	public void setpApellido(String pApellido) {
		this.pApellido = pApellido;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

}
