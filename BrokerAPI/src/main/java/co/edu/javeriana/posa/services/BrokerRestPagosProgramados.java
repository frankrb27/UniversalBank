package co.edu.javeriana.posa.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.tempuri.ArrayOfPagosProgramadosBE;
import org.tempuri.ConfirmacionTransaccionBE;
import org.tempuri.CuentasBE;
import org.tempuri.PagosProgramadosBE;
import org.tempuri.PrestamosBE;
import org.tempuri.RespuestaPagosProgramadosBE;
import org.tempuri.WsPagosProgramados;

import co.edu.javeriana.posa.objects.Cuenta;
import co.edu.javeriana.posa.objects.PagoProgramado;
import co.edu.javeriana.posa.objects.Prestamo;

public class BrokerRestPagosProgramados {

	//Logger
	private static final Logger logger = Logger.getLogger(BrokerRestPagosProgramados.class);
	private final String _CLASS = "[BrokerRestPagosProgramados]";
	
	public List<PagoProgramado> getPagosProgramado(PagoProgramado pagoProgramado){
		final String _METHOD = "[get]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+pagoProgramado.toString());
			List<PagoProgramado> listProv = getPagosProgramados(pagoProgramado);
			logger.info(_CLASS+"[FIN]"+_METHOD);
			return listProv;
		}
		catch(Exception e){
			logger.info(_CLASS+"[FIN]"+_METHOD,e);
			e.printStackTrace();
			return null;
		}
	}	
	
	public PagoProgramado register(PagoProgramado pagoProgramado){
		final String _METHOD = "[register]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+pagoProgramado.toString());
			pagoProgramado = persistPagoProgramado(pagoProgramado);
			logger.info(_CLASS+"[FIN]"+_METHOD);
			return pagoProgramado;
		}
		catch(Exception e){
			logger.info(_CLASS+"[FIN]"+_METHOD,e);
			e.printStackTrace();
			return null;
		}
	}	
	
	/**
	 * 
	 * @param pago
	 * @return
	 * @throws Exception
	 */
	private List<PagoProgramado> getPagosProgramados(PagoProgramado pago) throws Exception{
		final String _METHOD = "[getCuenta]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+pago.toString());
			PagosProgramadosBE reqPagoProg= new PagosProgramadosBE();
			if(pago.getDocumento()!=null){
				reqPagoProg.setDocumento(pago.getDocumento());
			}
			if(pago.getEmpresa()!=null){
				reqPagoProg.setEmpresa(pago.getEmpresa());
			}
			if(pago.getEstado()!=null){
				reqPagoProg.setEstado(pago.getEstado());
			}
			if(pago.getFechaProgramacion()!=null){
				reqPagoProg.setFechaProgramacion(pago.getFechaProgramacion());
			}
			if(pago.getIdPago()>0){
				reqPagoProg.setIdPago(pago.getIdPago());
			}
			if(pago.getNalInternal()>0){
				reqPagoProg.setNalInternal(pago.getNalInternal());
			}
			if(pago.getNumeroCuenta()!=null){
				reqPagoProg.setNumeroCuenta(pago.getNumeroCuenta());
			}
			if(pago.getNumeroFactura()!=null){
				reqPagoProg.setNumeroFactura(pago.getNumeroFactura());
			}
			if(pago.getTipoCuenta()>0){
				reqPagoProg.setTipoCuenta(pago.getTipoCuenta());
			}
			if(pago.getTipoDocumento()>0){
				reqPagoProg.setTipoDocumento(pago.getTipoDocumento());
			}
			if(pago.getTipoServicio()!=null){
				reqPagoProg.setTipoDocumento(pago.getTipoDocumento());
			}
			if(pago.getValorPago()!=null){
				reqPagoProg.setValorPago(pago.getValorPago());
			}
			WsPagosProgramados locator = new WsPagosProgramados();
			ArrayOfPagosProgramadosBE arrayProd = locator.getWsPagosProgramadosSoap().consultarPagosProgramados(reqPagoProg);
			List<PagoProgramado> listCuenta = new ArrayList<PagoProgramado>();
			for(PagosProgramadosBE pagoProgBE : arrayProd.getPagosProgramadosBE()){
				PagoProgramado arrPagoProg = new PagoProgramado();
				arrPagoProg.setDocumento(pagoProgBE.getDocumento());
				arrPagoProg.setEmpresa(pagoProgBE.getEmpresa());
				arrPagoProg.setEstado(pagoProgBE.getEstado());
				arrPagoProg.setFechaProgramacion(pagoProgBE.getFechaProgramacion());
				arrPagoProg.setIdPago(pagoProgBE.getIdPago());
				arrPagoProg.setNalInternal(pagoProgBE.getNalInternal());
				arrPagoProg.setNumeroCuenta(pagoProgBE.getNumeroCuenta());
				arrPagoProg.setNumeroFactura(pagoProgBE.getNumeroFactura());
				arrPagoProg.setTipoServicio(pagoProgBE.getTipoServicio());
				arrPagoProg.setValorPago(pagoProgBE.getValorPago());
				listCuenta.add(arrPagoProg);
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
	 * @param prestamo
	 * @return
	 * @throws Exception
	 */
	public String pagarPrestamos(Prestamo prestamo, Cuenta cuenta) throws Exception{
		final String _METHOD = "[pagarPrestamos]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+prestamo.toString());
			PrestamosBE reqPagoProg= new PrestamosBE();
			CuentasBE reqCuenta = new CuentasBE();
			
			reqPagoProg.setNumeroPrestamo(prestamo.getNumeroPrestamo());
			reqPagoProg.setValorPagado(prestamo.getValorPagado());
			reqCuenta.setNumeroCuenta(cuenta.getNumeroCuenta());
			
			WsPagosProgramados locator = new WsPagosProgramados();
			ConfirmacionTransaccionBE confirmacion = locator.getWsPagosProgramadosSoap().pagarPrestamos(reqPagoProg, reqCuenta);
			if(confirmacion.getRespuesta()!=1){
				throw new Exception(confirmacion.getDescripcionRta());
			}
			logger.info(_CLASS+"[FIN]");
			return confirmacion.getDescripcionRta();
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception(e);
		}
	}	
	
	/**
	 * 
	 * @param pagoProgramado
	 * @return
	 * @throws Exception
	 */
	private PagoProgramado persistPagoProgramado(PagoProgramado pagoProgramado) throws Exception{
		final String _METHOD = "[persistPagoProgramado]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+pagoProgramado.toString());
			PagosProgramadosBE reqPagoProg = new PagosProgramadosBE();
			reqPagoProg.setDocumento(pagoProgramado.getDocumento());
			reqPagoProg.setEmpresa(pagoProgramado.getEmpresa());
			reqPagoProg.setEstado(pagoProgramado.getEstado());
			reqPagoProg.setFechaProgramacion(pagoProgramado.getFechaProgramacion());
			reqPagoProg.setIdPago(pagoProgramado.getIdPago());
			reqPagoProg.setNalInternal(pagoProgramado.getNalInternal());
			reqPagoProg.setNumeroCuenta(pagoProgramado.getNumeroCuenta());
			reqPagoProg.setNumeroFactura(pagoProgramado.getNumeroFactura());
			reqPagoProg.setTipoServicio(pagoProgramado.getTipoServicio());
			reqPagoProg.setValorPago(pagoProgramado.getValorPago());

			WsPagosProgramados locator = new WsPagosProgramados();
			RespuestaPagosProgramadosBE respuestaBE = locator.getWsPagosProgramadosSoap().registrarPagoProgramado(reqPagoProg);
			logger.info(_CLASS+"[FIN]");
			if(respuestaBE.getRespuesta()==0){
				return pagoProgramado;
			}else{
				throw new Exception(respuestaBE.getDescripcionRta());
			}
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
		BrokerRestPagosProgramados res = new BrokerRestPagosProgramados();
		//Consultar
		PagoProgramado pagoProgramado = new PagoProgramado();
		pagoProgramado.setTipoDocumento(1);
		pagoProgramado.setDocumento("80073603");
		List<PagoProgramado> list = res.getPagosProgramado(pagoProgramado);
		System.out.println("list.size(): " +list.size());
		//Registrar
		pagoProgramado.setDocumento("80073603");
		pagoProgramado.setEmpresa("ETB");
		pagoProgramado.setEstado("Inscrita");
		pagoProgramado.setFechaProgramacion("2017-11-20");
		pagoProgramado.setIdPago(1);
		pagoProgramado.setNalInternal(0);
		pagoProgramado.setNumeroCuenta("2323322323");
		pagoProgramado.setNumeroFactura("21332323");
		pagoProgramado.setTipoServicio("acueducto2");
		pagoProgramado.setValorPago(new BigDecimal(230000));
		pagoProgramado = res.register(pagoProgramado);
		System.out.println("pagoId: "+pagoProgramado.getIdPago());
	}	
}
