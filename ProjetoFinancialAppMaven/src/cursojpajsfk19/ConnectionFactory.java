package cursojpajsfk19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
public class ConnectionFactory {

	public static Connection createConnection() throws ClassNotFoundException{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		String urlConexao 	= "jdbc:mysql://localhost:3306/cursojpajsfk19";
		String usuario		= "root";
		String senha		= "root";
		
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(urlConexao, usuario, senha);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
