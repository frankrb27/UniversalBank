package co.edu.javeriana.posa.objects;

import java.io.Serializable;

public class Mensaje implements Serializable{

	String code;
	String message;
	
	/**
	 * Constructor por defecto
	 */
	public Mensaje(){}
	
	/**
	 * Constructor con parámetros
	 */
	public Mensaje(String message){
		this.message = message;
	}
	
	/**
	 * Constructor con parámetros
	 */
	public Mensaje(String code, String message){
		this.code = code;
		this.message = message;
	}	

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString(){
		return "[mensaje:{"
				+ "code:"+code+","
				+ "message:"+message
				+"}]";
	}
}
