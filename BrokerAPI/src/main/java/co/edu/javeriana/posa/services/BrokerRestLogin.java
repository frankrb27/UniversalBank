package co.edu.javeriana.posa.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.tempuri.WsAutenticacion;

import co.edu.javeriana.posa.objects.Cliente;
import co.edu.javeriana.posa.objects.Cuenta;

public class BrokerRestLogin {

	//Logger
	private static final Logger logger = Logger.getLogger(BrokerRestLogin.class);
	private final String _CLASS = "[BrokerRestLogin]";
	
	public Cliente login(Cliente cliente){
		final String _METHOD = "[login]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+cliente.toString());
			cliente = getLogin(cliente);
			logger.info(_CLASS+"[FIN]"+_METHOD);
			return cliente;
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
	private Cliente getLogin(Cliente cliente) throws Exception{
		final String _METHOD = "[getLogin]";
		try{
			logger.info(_CLASS+"[INI]"+_METHOD+cliente.toString());
			org.tempuri.AutenticacionBE autenticacion = new org.tempuri.AutenticacionBE();
			WsAutenticacion locator = new WsAutenticacion();
			autenticacion.setUsuario(cliente.getUsuario());
			autenticacion.setPassword(cliente.getPassword());
			org.tempuri.UsuarioAutenticadoBE usuarioAutenticadoBE = locator.getWsAutenticacionSoap().autenticarUsuario(autenticacion);
			System.out.println(usuarioAutenticadoBE);
			//Asignar valores del servicio
			cliente.setCorreo(usuarioAutenticadoBE.getCliente().getCorreo());
			cliente.setDireccion(usuarioAutenticadoBE.getCliente().getDireccion());
			cliente.setIdArea(usuarioAutenticadoBE.getCliente().getIdArea());
			cliente.setDescripcionArea(usuarioAutenticadoBE.getCliente().getDescripcionArea());
			cliente.setIdCliente(usuarioAutenticadoBE.getCliente().getIdCliente());
			cliente.setNumeroDocumento(usuarioAutenticadoBE.getCliente().getDocumento());
			cliente.setPrimerApellido(usuarioAutenticadoBE.getCliente().getPrimerApellido());
			cliente.setPrimerNombre(usuarioAutenticadoBE.getCliente().getPrimerNombre());
			cliente.setSegundoApellido(usuarioAutenticadoBE.getCliente().getSegundoApellido());
			cliente.setSegundoNombre(usuarioAutenticadoBE.getCliente().getSegundoNombre());
			cliente.setTelefono(usuarioAutenticadoBE.getCliente().getTelefono());
			cliente.setIdTipoDoc(usuarioAutenticadoBE.getCliente().getTipoDocumento());
			cliente.setCodigoDoc(usuarioAutenticadoBE.getCliente().getCodigoTipoDocumento());
			cliente.setDescripcionDoc(usuarioAutenticadoBE.getCliente().getDescripcionTipoDocumento());
			logger.info(_CLASS+"[FIN]");
			return cliente;
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
		BrokerRestLogin res = new BrokerRestLogin();
		Cliente cliente = new Cliente();
		cliente.setUsuario("frodriguez");
		cliente.setPassword("frodriguez1");
		cliente = res.getLogin(cliente);
		System.out.println("cliente.getPrimerNombre(): " +cliente.getPrimerNombre());
	}
}

