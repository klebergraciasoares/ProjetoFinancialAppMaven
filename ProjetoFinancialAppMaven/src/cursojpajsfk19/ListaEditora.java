package cursojpajsfk19;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;

public class ListaEditora {

	
	public static void main(String[] args) throws ClassNotFoundException{
		
//		Class.forName("com.mysql.jdbc.Driver"); 
//		String urlConexao 	= "jdbc:mysql://localhost:3306/cursojpajsfk19";
//		String usuario		= "root";
//		String senha		= "root";
		
		Connection conexao = ConnectionFactory.createConnection();
		
		
		try {
			//Connection conexao = DriverManager.getConnection(urlConexao, usuario, senha);
			
			String sqlListaEditoras = "SELECT * FROM Editora";
			
			PreparedStatement comando = conexao.prepareStatement(sqlListaEditoras);
			ResultSet resultado = comando.executeQuery();
			
			while (resultado.next()) {
				System.out.println("Nome editora: " +resultado.getString("nome")+ " | Email: " +resultado.getString("email") );
			}
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
