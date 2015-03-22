/**
 * 
 */
package br.com.aroldo.testando.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





/**
 * @author Aroldo
 *
 */
public class Conexao {
	
	
	public static void main(String[] args) {
				getConnection();
	}
	
	
	
		
			public static   Connection getConnection(){
			
				Connection con=null;
	
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_test","root","root" );
			System.out.println("Conectado com Sucesso! ");
			
		} catch (SQLException e) {
			
			System.out.println("Não pode conectar:" + e.getMessage());
		}
	
		return con;
	}
	
	
}
