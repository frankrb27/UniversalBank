package co.edu.javeriana.posa.objects;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cuenta implements Serializable{

    private int idCuenta;
    private String numeroCuenta;
    private String tipoCuenta;
    private int tipoDocumento;
    private String documento;
    private BigDecimal saldoCuenta;
	
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
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
	public BigDecimal getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(BigDecimal saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}	
}
