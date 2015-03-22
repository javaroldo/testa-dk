/**
 * 
 */
package br.com.aroldo.testando.controller;

import java.util.Date;

/**
 * @author aroldo.santos
 *
 */
public class Funcionario extends Pessoa {
	
	
	
	private String tipo;
	private Date dataAdmissao;
	private Integer salario;
	private String cargo;
	
	
	
	
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the dataAdmissao
	 */
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	/**
	 * @param dataAdmissao the dataAdmissao to set
	 */
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	/**
	 * @return the salario
	 */
	public Integer getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}
	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	

}
