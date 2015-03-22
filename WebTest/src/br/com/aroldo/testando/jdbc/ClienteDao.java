package br.com.aroldo.testando.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.aroldo.testando.cliente.bean.Cliente;

public class ClienteDao {

	
	private static Connection con = Conexao.getConnection();


	public void cadastrar(Cliente c) {
		String sql = "INSERT INTO CLIENTE (nome, cpf_cnpj, data_nascimento, telefone,"
				+ " endereco, cep, bairro, estado) values (?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, c.getNome());
			preparador.setString(2, c.getCpfCnpj());
			// preparador.setString(3, cliente.getRg());
			preparador.setDate(3, new Date(1));
			preparador.setString(4, c.getTelefone());
			preparador.setString(5, c.getEndereco());
			preparador.setString(6, c.getCep());
			preparador.setString(7, c.getBairro());
			preparador.setString(8, c.getEstado());

			preparador.execute();
			preparador.close();

			System.out.println("Cadastrado com Sucesso");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}



	public void alterar(Cliente c) {
		String sql = "UPDATE USUARIO SET nome=?, cpf_cnpj=?, data_nascimento=?, telefone=?,"
				+ " endereco=?, cep=?, bairro=?, estado=? WHERE cod_cliente=?";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, c.getNome());
			preparador.setString(2, c.getCpfCnpj());
			// preparador.setString(3, cliente.getRg());
			preparador.setDate(3, new Date(1));
			preparador.setString(4, c.getTelefone());
			preparador.setString(5, c.getEndereco());
			preparador.setString(6, c.getCep());
			preparador.setString(7, c.getBairro());
			preparador.setString(8, c.getEstado());

			preparador.execute();
			preparador.close();

			System.out.println("Alterado com Sucesso");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void excluir(Cliente c) {

		// Monta Sql
		String sql = "DELETE FROM CLIENTE WHERE id=?";

		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			preparador.setInt(1, c.getCodCliente());

			preparador.execute();
			preparador.close();

			System.out.println("Excluido com Sucesso! Se ferrou!");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	

	public Cliente buscarUm(Cliente c) {

		String sql = " select * from cliente where codigo = "
				+ c.getCodCliente();

		Cliente cliente = new Cliente();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			ResultSet resultado = preparador.executeQuery();

			if (resultado.first()) {

				cliente.setNome((resultado.getString("nome")));
				cliente.setCpfCnpj((resultado.getString("cpf_cnpj")));
				cliente.setRg((resultado.getString("rg")));
				cliente.setDataNascimento((resultado.getDate("data_nascimento")));
				cliente.setTelefone((resultado.getString("telefone")));
				cliente.setEndereco((resultado.getString("endereco")));
				cliente.setCep((resultado.getString("cep")));
				cliente.setBairro((resultado.getString("bairro")));
				cliente.setEstado((resultado.getString("estado")));
				cliente.setCodCliente(resultado.getInt("codigo"));

				preparador.execute();
				preparador.close();
				System.out.println(cliente.getCodCliente());
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return cliente;
	}
	
	

	public List<Cliente> buscarTodos() {
		// Monta Sql

		String sql = "SELECT * FROM USUARIO";

		List<Cliente> lista = new ArrayList<Cliente>();

		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			ResultSet resultado = preparador.executeQuery();

			while (resultado.next()) {

				Cliente c = new Cliente();

				c.setNome((resultado.getString("nome")));
				c.setCpfCnpj((resultado.getString("cpf_cnpj")));
				c.setRg((resultado.getString("rg")));
				c.setDataNascimento((resultado.getDate("data_nascimento")));
				c.setTelefone((resultado.getString("telefone")));
				c.setEndereco((resultado.getString("endereco")));
				c.setCep((resultado.getString("cep")));
				c.setBairro((resultado.getString("bairro")));
				c.setEstado((resultado.getString("estado")));
				c.setNome((resultado.getString("nome")));
				c.setNome((resultado.getString("nome")));

				lista.add(c);

			}

			preparador.execute();
			preparador.close();

			System.out.println("Consulta ok");

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return lista;

	}

}