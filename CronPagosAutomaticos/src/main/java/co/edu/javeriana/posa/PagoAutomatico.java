package co.edu.javeriana.posa;

import java.util.Calendar;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import co.edu.javeriana.posa.objects.PagoProgramado;
import co.edu.javeriana.posa.services.BrokerRestPagosProgramados;

public class PagoAutomatico implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		pagoAutomatico();
	}

	public void pagoAutomatico(){
		try{
			System.out.println("*********************".concat("BANCO UNIVERSAL").concat("*********************"));
			System.out.println("******************".concat("INI PAGOS AUTOMÁTICOS").concat("******************"));
			Calendar c = Calendar.getInstance();
			System.out.println("Hora inicio: "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
			BrokerRestPagosProgramados rest = new BrokerRestPagosProgramados();
			List<PagoProgramado> listPago =rest.getPagosProgramado(new PagoProgramado());
			for(PagoProgramado pago : listPago){
				Thread.currentThread().sleep(2000);
				if(true){
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
					System.out.println("IdPago: "+pago.getIdPago());
					System.out.println("Documento: "+pago.getDocumento());
					System.out.println("TipoDocumento: "+pago.getTipoDocumento());
					System.out.println("NumeroCuenta: "+pago.getNumeroCuenta());
					System.out.println("FechaProgramacion: "+pago.getFechaProgramacion());
					System.out.println("TipoServicio"+pago.getTipoServicio());
					System.out.println("NumeroFactura: "+pago.getNumeroFactura());
					System.out.println("Realizando pago automático...");
					Thread.currentThread().sleep(500);
					System.out.println("Pago exitoso.");
					System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				}
			}
			c = Calendar.getInstance();
			System.out.println("Hora fin: "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
			System.out.println("******************".concat("FIN PAGOS AUTOMÁTICOS").concat("******************"));
		}catch(Exception e){
			Calendar c = Calendar.getInstance();
			System.out.println("Hora fin: "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));			
			System.out.println("******************".concat("ERROR PAGOS AUTOMÁTICOS").concat("******************"));
			e.printStackTrace();
		}
	}
}
