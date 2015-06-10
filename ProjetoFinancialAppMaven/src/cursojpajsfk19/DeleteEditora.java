package cursojpajsfk19;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class DeleteEditora {

	public static void main(String[] args) throws ClassNotFoundException{
		
		try {
			Connection conexao = ConnectionFactory.createConnection();
			
			String sqlRemoveEditora = "DELETE FROM editora WHERE id = ?";
			PreparedStatement comando = conexao.prepareStatement(sqlRemoveEditora);
			System.err.println("Deletando...");

			comando.setInt(1, 2);
			comando.execute();
			
			System.out.println("Deletado com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
				
		
		
	}
}
