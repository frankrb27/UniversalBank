package co.edu.javeriana.posa.objects;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.xml.datatype.XMLGregorianCalendar;

public class PagoProgramado {

    private int idPago;
    private String tipoServicio;
    private String empresa;
    private String numeroFactura;
    private XMLGregorianCalendar fechaProgramacion;
    private int tipoCuenta;
    private String numeroCuenta;
    private int tipoDocumento;
    private String documento;
    private int nalInternal;
    private String estado;
    private BigDecimal valorPago;

    public int getIdPago() {
		return idPago;
	}
	public void setIdPago(int idPago) {
		this.idPago = idPago;
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
	public XMLGregorianCalendar getFechaProgramacion() {
		return fechaProgramacion;
	}
	public void setFechaProgramacion(XMLGregorianCalendar fechaProgramacion) {
		this.fechaProgramacion = fechaProgramacion;
	}
	public int getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(int tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public int getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public int getNalInternal() {
		return nalInternal;
	}
	public void setNalInternal(int nalInternal) {
		this.nalInternal = nalInternal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public BigDecimal getValorPago() {
		return valorPago;
	}
	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}
}
