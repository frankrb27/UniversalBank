package co.edu.javeriana.posa.objects;

import java.io.Serializable;

public class ObjetoGenerico implements Serializable {

	private String mensaje;

	public ObjetoGenerico(String mensaje){
		this.mensaje = mensaje;
	}
	
	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
