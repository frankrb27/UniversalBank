package co.edu.javeriana.posa.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.tempuri.ArrayOfPrestamosBE;
import org.tempuri.PrestamosBE;
import org.tempuri.WsPrestamos;

import co.edu.javeriana.posa.objects.Prestamo;

public class BrokerRestPrestamo {

	//Logger
	private static final Logger logger = Logger.getLogger(BrokerRestPrestamo.class);
	private final String _CLASS = "[BrokerRestPrestamo]";
	
	public List<Prestamo> getPrestamo(Prestamo prestamo){
		final String _METHOD = "[get]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+prestamo.toString());
			List<Prestamo> listProv = getPrestamos(prestamo);
			logger.info(_CLASS+"[FIN]"+_METHOD);
			return listProv;
		}
		catch(Exception e){
			logger.info(_CLASS+"[FIN]"+_METHOD,e);
			return null;
		}
	}	
	
	/**
	 * 
	 * @param cliente
	 * @return
	 * @throws Exception
	 */
	private List<Prestamo> getPrestamos(Prestamo prestamo) throws Exception{
		final String _METHOD = "[getPrestamos]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+prestamo.toString());
			PrestamosBE reqPrestamo = new PrestamosBE();
			if(prestamo.getDeudaPrestamo()!=null){
				reqPrestamo.setDeudaPrestamo(prestamo.getDeudaPrestamo());
			}
			if(prestamo.getDocumento()!=null){
				reqPrestamo.setDocumento(prestamo.getDocumento());
			}
			if(prestamo.getIdPrestamo()>0){
				reqPrestamo.setIdPrestamo(prestamo.getIdPrestamo());
			}
			if(prestamo.getNumeroPrestamo()!=null){
				reqPrestamo.setNumeroPrestamo(prestamo.getNumeroPrestamo());
			}
			if(prestamo.getTipoDocumento()>0){
				reqPrestamo.setTipoDocumento(prestamo.getTipoDocumento());
			}
			WsPrestamos locator = new WsPrestamos();
			ArrayOfPrestamosBE arrayProd = locator.getWsPrestamosSoap().consultarPrestamos(reqPrestamo);
			List<Prestamo> listPrestamo = new ArrayList<Prestamo>();
			for(PrestamosBE prestamoBE : arrayProd.getPrestamosBE()){
				Prestamo arrPrestamo = new Prestamo();
				arrPrestamo.setDeudaPrestamo(prestamoBE.getDeudaPrestamo());
				arrPrestamo.setDocumento(prestamoBE.getDocumento());
				arrPrestamo.setIdPrestamo(prestamoBE.getIdPrestamo());
				arrPrestamo.setNumeroPrestamo(prestamoBE.getNumeroPrestamo());
				arrPrestamo.setTipoDocumento(prestamoBE.getTipoDocumento());
				listPrestamo.add(arrPrestamo);
			}
			logger.info(_CLASS+"[FIN]");
			return listPrestamo;
		}catch(Exception e){
			throw new Exception(e);
		}
	}	
}
