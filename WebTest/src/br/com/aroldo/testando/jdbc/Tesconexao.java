package br.com.aroldo.testando.jdbc;

import br.com.aroldo.testando.cliente.bean.Cliente;


public class Tesconexao {

	public Tesconexao() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Cliente cliente = new Cliente();
	cliente.setCodCliente(1);
	ClienteDao clienteDao = new ClienteDao();
	clienteDao.buscarUm(cliente);
	
	
	//	Conexao.getConnection();
		// TODO Auto-generated method stub

	}

}
