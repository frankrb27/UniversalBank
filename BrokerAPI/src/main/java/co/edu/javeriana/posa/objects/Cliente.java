package co.edu.javeriana.posa.objects;

import java.io.Serializable;

public class Cliente implements Serializable{

	Integer idCliente;
	Integer idTipoDoc;
	private String codigoDoc;
	private String descripcionDoc;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String numeroDocumento;
	private String correo;
	private String direccion;
	private String telefono;	
	String idArea;
	private String descripcionArea;
	private String usuario;	
	private String password;
	/**
	 * @return the idCliente
	 */
	public Integer getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return the idTipoDoc
	 */
	public Integer getIdTipoDoc() {
		return idTipoDoc;
	}
	/**
	 * @param idTipoDoc the idTipoDoc to set
	 */
	public void setIdTipoDoc(Integer idTipoDoc) {
		this.idTipoDoc = idTipoDoc;
	}
	/**
	 * @return the codigoDoc
	 */
	public String getCodigoDoc() {
		return codigoDoc;
	}
	/**
	 * @param codigoDoc the codigoDoc to set
	 */
	public void setCodigoDoc(String codigoDoc) {
		this.codigoDoc = codigoDoc;
	}
	/**
	 * @return the descripcionDoc
	 */
	public String getDescripcionDoc() {
		return descripcionDoc;
	}
	/**
	 * @param descripcionDoc the descripcionDoc to set
	 */
	public void setDescripcionDoc(String descripcionDoc) {
		this.descripcionDoc = descripcionDoc;
	}
	/**
	 * @return the primerNombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}
	/**
	 * @param primerNombre the primerNombre to set
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	/**
	 * @return the segundoNombre
	 */
	public String getSegundoNombre() {
		return segundoNombre;
	}
	/**
	 * @param segundoNombre the segundoNombre to set
	 */
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}
	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}
	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the idArea
	 */
	public String getIdArea() {
		return idArea;
	}
	/**
	 * @param idArea the idArea to set
	 */
	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}
	/**
	 * @return the descripcionArea
	 */
	public String getDescripcionArea() {
		return descripcionArea;
	}
	/**
	 * @param descripcionArea the descripcionArea to set
	 */
	public void setDescripcionArea(String descripcionArea) {
		this.descripcionArea = descripcionArea;
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString(){
		String string_ = "CLI[";
		string_ = string_+"idCliente:"+idCliente+","
				+"idTipoDoc:"+idTipoDoc+","
				+"codigoDoc:"+codigoDoc+","
				+"descripcionDoc:"+descripcionDoc+","
				+"primerNombre:"+primerNombre+","
				+"segundoNombre:"+segundoNombre+","
				+"primerApellido:"+primerApellido+","
				+"segundoApellido:"+segundoApellido+","
				+"numeroDocumento:"+numeroDocumento+","
				+"correo:"+correo+","
				+"direccion:"+direccion+","
				+"telefono:"+telefono+","
				+"idArea:"+idArea+","
				+"descripcionArea:"+descripcionArea+","
				+"usuario:"+usuario
				+"]CLI";
		return string_;
	}
}
