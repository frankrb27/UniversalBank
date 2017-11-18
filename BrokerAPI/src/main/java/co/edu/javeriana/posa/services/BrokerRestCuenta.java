package co.edu.javeriana.posa.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.tempuri.ArrayOfCuentasBE;
import org.tempuri.CuentasBE;
import org.tempuri.WsCuentas;

import co.edu.javeriana.posa.objects.Cuenta;

public class BrokerRestCuenta {

	//Logger
	private static final Logger logger = Logger.getLogger(BrokerRestCuenta.class);
	private final String _CLASS = "[BrokerRestCuenta]";
	
	public BrokerRestCuenta(){}
	
	public List<Cuenta> getCuenta(Cuenta cuenta){
		final String _METHOD = "[get]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+cuenta.toString());
			List<Cuenta> listCuenta = getCuentas(cuenta);
			logger.info(_CLASS+"[FIN]"+_METHOD);
			return listCuenta;
		}
		catch(Exception e){
			logger.info(_CLASS+"[FIN]"+_METHOD,e);
			e.printStackTrace();
			return null;
		}
	}	
	
	/**
	 * 
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	private List<Cuenta> getCuentas(Cuenta cuenta) throws Exception{
		final String _METHOD = "[getCuenta]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+cuenta.toString());
			CuentasBE reqCuenta = new CuentasBE();
			if(cuenta.getIdCuenta()>0){
				reqCuenta.setIdCuenta(cuenta.getIdCuenta());
			}
			if(cuenta.getDocumento()!=null && !cuenta.getDocumento().equals("null")){
				reqCuenta.setDocumento(cuenta.getDocumento());
			}
			if(cuenta.getNumeroCuenta()!=null && !cuenta.getNumeroCuenta().equals("null")){
				reqCuenta.setNumeroCuenta(cuenta.getNumeroCuenta());
			}
			if(cuenta.getTipoCuenta()!=null && !cuenta.getTipoCuenta().equals("null")){
				reqCuenta.setTipoCuenta(cuenta.getTipoCuenta());
			}
			if(cuenta.getTipoDocumento()>0){
				reqCuenta.setTipoDocumento(cuenta.getTipoDocumento());
			}
			WsCuentas locator = new WsCuentas();
			ArrayOfCuentasBE arrayProd = locator.getWsCuentasSoap().consultarCuentas(reqCuenta);
			List<Cuenta> listCuenta = new ArrayList<Cuenta>();
			for(CuentasBE ctaBE : arrayProd.getCuentasBE()){
				Cuenta arrCuenta = new Cuenta();
				arrCuenta.setIdCuenta(ctaBE.getIdCuenta());
				arrCuenta.setDocumento(ctaBE.getDocumento());
				arrCuenta.setNumeroCuenta(ctaBE.getNumeroCuenta());
				arrCuenta.setSaldoCuenta(ctaBE.getSaldoCuenta());
				arrCuenta.setTipoCuenta(ctaBE.getTipoCuenta());
				arrCuenta.setTipoDocumento(ctaBE.getTipoDocumento());
				listCuenta.add(arrCuenta);
			}
			logger.info(_CLASS+"[FIN]");
			return listCuenta;
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception(e);
		}
	}	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) throws Exception{
		BrokerRestCuenta res = new BrokerRestCuenta();
		Cuenta cuenta = new Cuenta();
		cuenta.setTipoDocumento(1);
		cuenta.setDocumento("80073603");
		List<Cuenta> list = res.getCuentas(cuenta);
		System.out.println("list.size(): " +list.size());
	}
}
