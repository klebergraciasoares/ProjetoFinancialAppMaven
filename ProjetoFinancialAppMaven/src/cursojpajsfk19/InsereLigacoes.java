package cursojpajsfk19;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;



public class InsereLigacoes {

	public static void main(String[] args) throws ClassNotFoundException{
//		Class.forName("com.mysql.jdbc.Driver"); 
//		String urlConexao = "jdbc:mysql://localhost:3306/cursojpajsfk19";
//		String usuario 	= "root";
//		String senha 	= "root";

		Connection conexao = ConnectionFactory.createConnection();
		
//		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("Abrindo Conexao\n");
			
			//Connection conexao = DriverManager.getConnection(urlConexao, usuario, senha);
			
//			System.out.println("Digite o nome da Editora.");
//			String nomeEditora = entrada.nextLine();
//			
//			System.out.println("Digite o email da Editora.");
//			String emailEditora = entrada.nextLine();
			
			String sqlInsert = "INSERT INTO Ligacoes (duration, cellular_id) values ( ?, ? )";
			PreparedStatement comando = conexao.prepareStatement(sqlInsert);
			comando.setInt(1, 10);
			comando.setInt(2, 1);
			
			System.out.println("Execuntando comando");
			comando.execute();
			
			
			System.out.println("Fechando conexao");
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
