package br.com.aroldo.testando.cliente.bean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import sun.applet.Main;
import br.com.aroldo.testando.cliente.viewhelper.IncluirClienteViewHelper;
import br.com.aroldo.testando.jdbc.ClienteDao;

@ManagedBean
public class IncluirClienteBean {

	private Cliente cliente = null;
	private Cliente novo = null;
	private String message = null;
	private static IncluirClienteViewHelper viewHelper = null;
		
	

	public IncluirClienteBean() {
		novo = new Cliente();
		

	}

	

		
	
	
@PostConstruct	

public void iniciarPagina(){
viewHelper.carregarEstados();
	
}
	

		
	
	
	

	public void gravar() {

		FacesContext context = FacesContext.getCurrentInstance();
		message = "Cliente: " + getCliente().getNome() + " , Cadastrado!";
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.cadastrar(cliente);
		context.addMessage(null, new FacesMessage(
				"Operação Realizada com Sucesso!", message));

	}

	public void limpar() {

		cliente = null;

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getNovo() {
		return novo;
	}

	public void setNovo(Cliente novo) {
		this.novo = novo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	/**
	 * @return the viewHelper
	 */
	public IncluirClienteViewHelper getViewHelper() {
		return viewHelper;
	}



	/**
	 * @param viewHelper the viewHelper to set
	 */
	public void setViewHelper(IncluirClienteViewHelper viewHelper) {
		this.viewHelper = viewHelper;
	}

}
