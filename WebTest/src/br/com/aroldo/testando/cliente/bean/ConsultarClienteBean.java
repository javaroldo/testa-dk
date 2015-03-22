/**
 * 
 */
package br.com.aroldo.testando.cliente.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

import br.com.aroldo.testando.jdbc.ClienteDao;

/**
 * @author aroldo.santos
 *
 */
@ManagedBean
public class ConsultarClienteBean {

	private Cliente cliente = null;
	private ClienteDao clienteDao = new ClienteDao();

	/**
	 * 
	 */
	public ConsultarClienteBean() {
		cliente = new Cliente();
		

	}

	public void buscarPorCodigo(ActionEvent ac) {

		clienteDao = new ClienteDao();
		
		
		setCliente(getClienteDao().buscarUm(cliente));
		
		System.out.println(getCliente().getNome());
		System.out.println("sucesso");

	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the clienteDao
	 */
	public ClienteDao getClienteDao() {
		return clienteDao;
	}

	/**
	 * @param clienteDao the clienteDao to set
	 */
	public void setClienteDao(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

}