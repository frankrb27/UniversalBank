package co.edu.javeriana.posa.objects;

import java.math.BigDecimal;

public class Prestamo {

    private int idPrestamo;
    private String numeroPrestamo;
    private int tipoDocumento;
    private String documento;
    private BigDecimal deudaPrestamo;
    private String tipoPrestamo;
	
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public String getNumeroPrestamo() {
		return numeroPrestamo;
	}
	public void setNumeroPrestamo(String numeroPrestamo) {
		this.numeroPrestamo = numeroPrestamo;
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
	public BigDecimal getDeudaPrestamo() {
		return deudaPrestamo;
	}
	public void setDeudaPrestamo(BigDecimal deudaPrestamo) {
		this.deudaPrestamo = deudaPrestamo;
	}
	public String getTipoPrestamo() {
		return tipoPrestamo;
	}
	public void setTipoPrestamo(String tipoPrestamo) {
		this.tipoPrestamo = tipoPrestamo;
	}
	
}
