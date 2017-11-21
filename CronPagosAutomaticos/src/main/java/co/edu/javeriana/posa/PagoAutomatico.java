package co.edu.javeriana.posa;

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
			BrokerRestPagosProgramados rest = new BrokerRestPagosProgramados();
			List<PagoProgramado> listPago =rest.getPagosProgramado(new PagoProgramado());
			for(PagoProgramado pago : listPago){
				if(true){
					System.out.println("IdPago: "+pago.getIdPago());
					System.out.println("Documento: "+pago.getDocumento());
					System.out.println("TipoDocumento: "+pago.getTipoDocumento());
					System.out.println("NumeroCuenta: "+pago.getNumeroCuenta());
					System.out.println("FechaProgramacion: "+pago.getFechaProgramacion());
					System.out.println("TipoServicio"+pago.getTipoServicio());
					System.out.println("NumeroFactura: "+pago.getNumeroFactura());
				}
			}
			System.out.println("******************".concat("FIN PAGOS AUTOMÁTICOS").concat("******************"));
		}catch(Exception e){
			System.out.println("******************".concat("ERROR PAGOS AUTOMÁTICOS").concat("******************"));
			e.printStackTrace();
		}
	}
}
