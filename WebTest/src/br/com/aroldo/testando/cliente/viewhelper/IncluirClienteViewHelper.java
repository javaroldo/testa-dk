package br.com.aroldo.testando.cliente.viewhelper;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.aroldo.testando.cliente.bean.Cliente;

public class IncluirClienteViewHelper {
	
	private Cliente cliente = null;

	
	private List<SelectItem> estados;
	
		/**
	 * CONSTRUTOR
	 */
	public IncluirClienteViewHelper() {
		setCliente(new Cliente());
	}

	
	
	
	
	
	
	

	
	
	public void carregarEstados(){
		
		
		SelectItem item = new SelectItem();
		
		item.setDescription("São Paulo");
		estados.add(item);
		
		
		SelectItem item2 = new SelectItem();
		item2.setDescription("Minas Gerais");
		estados.add(item2);
		
		SelectItem item3 = new SelectItem();
		
		item3.setDescription("Rio de Janeiro");
		estados.add(item3);
		
		SelectItem item4 = new SelectItem();
		item4.setDescription("Paraná");
		estados.add(item4);
				
	}
	
	
	
	
	
	
	
	
	
	
	// GETTERS AND SETTERS
	
	
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




















	/**
	 * @return the estados
	 */
	public List<SelectItem> getEstados() {
		return estados;
	}




















	/**
	 * @param estados the estados to set
	 */
	public void setEstados(List<SelectItem> estados) {
		this.estados = estados;
	}
	
	
	
	
	
	
	
	
	
	
	

}
