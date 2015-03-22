/**
 * 
 */
package br.com.aroldo.testando.cliente.bean;

import java.util.Date;


/**
 * @author Aroldo
 *
 */
public class Cliente {

	
	private String nome;
	private String cpfCnpj;
	private String rg;
	private String telefone;
	private String endereco;
	private String cep;
	private String bairro;
	private String estado;
	private Date dataNascimento;
	private Integer CodCliente;
	
	
	
	
	/**
	 * 
	 */
	public Cliente() {
		// TODO Auto-generated constructor stub
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	




	public String getRg() {
		return rg;
	}




	public void setRg(String rg) {
		this.rg = rg;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	



	public String getCep() {
		return cep;
	}




	public void setCep(String cep) {
		this.cep = cep;
	}




	public String getBairro() {
		return bairro;
	}




	public void setBairro(String bairro) {
		this.bairro = bairro;
	}




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
		this.estado = estado;
	}




	




	

	public String getCpfCnpj() {
		return cpfCnpj;
	}




	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	







	/**
	 * @return the codCliente
	 */
	public Integer getCodCliente() {
		return CodCliente;
	}




	/**
	 * @param codCliente the codCliente to set
	 */
	public void setCodCliente(Integer codCliente) {
		CodCliente = codCliente;
	}




	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}




	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}




	


	




	

}
