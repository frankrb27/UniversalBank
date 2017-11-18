package co.edu.javeriana.posa.string;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * String Utils
 * @author FRANK RODRIGUEZ
 * @version 07/09/2016
 */

public class StringUtils {

	/**
	 * Método que valida si un string es nulo o vacio
	 * @param String string_ : Cadena string a validar
	 * @return boolean
	 */
	public static boolean isNullorisEmpty(String string_){
		boolean flag = false;
		if(string_ == null){
			flag = true;
		}else if(string_.trim().isEmpty()){
			flag = true;
		}
		return flag;
	}

	/**
	 * Método para convertir un objeto de entrada en un String
	 * @param Object object_ : Objeto a convertir
	 * @return
	 */
	public static String objectToString(Object object_){
		if(object_ == null){
			return null;
		}else{
			return object_.toString();	
		}		
	}

	/**
	 * Obtener mensajes
	 * @param String string_ : Mensajes
	 * @param String separator : Caracter que separa los mensajes
	 * @return String[]
	 */
	public static String[] getMessage(String string_, String separator){
		if(string_ != null){
			return string_.split(separator);
		}else{
			return null;
		}		
	}	

	/**
	 * Obtener mensajes
	 * @param String string_ : Mensajes
	 * @param String separator : Caracter que separa los mensajes
	 * @param int position : Posición del arreglo a obtener
	 * @return String
	 */
	public static String getMessage(String string_, String separator, int position, String class_, String method_){
		System.out.println("Clase : "+class_+" Método : "+method_);
		if(string_ != null){
			return string_.split(separator)[position];
		}else{
			return null;
		}		
	}		

	/**
	 * Método para completar un string con un caracter a la izquierda
	 * @param String cadena : Cadena a completar
	 * @param String caracter : Caracter de relleno
	 * @param int caracteres : Tamaño final de la cadena
	 * @return String
	 */
	public static String leftPadding(String cadena, String caracter, int caracteres){
		if(cadena != null && caracter != null && caracteres >0){
			for(int i=0; i<caracteres; i++){
				if(cadena.length() < caracteres){
					cadena = caracter + cadena;
				}
			}
			return cadena;
		}else{
			return null;
		}
	}

	/**
	 * Método para completar un string con un caracter a la derecha
	 * @param String cadena : Cadena a completar
	 * @param String caracter : Caracter de relleno
	 * @param int caracteres : Tamaño final de la cadena
	 * @return String
	 */
	public static String rightPadding(String cadena, String caracter, int caracteres){
		if(cadena != null && caracter != null && caracteres >0){
			for(int i=0; i<caracteres; i++){
				if(cadena.length() < caracteres){
					cadena = cadena + caracter;
				}
			}
			return cadena;
		}else{
			return null;
		}
	}

	/**
	 * Formatear un valor BigDecimal a formato moneda
	 * @param BigDecimal value : Valor a formatear
	 * @return String
	 */
	public static String numberFormat(BigDecimal value){
		if(value!=null){
			return NumberFormat.getCurrencyInstance(new Locale("es","CO")).format(value);
		}else{
			return "$0.0";
		}
	}	
}
