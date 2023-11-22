package cadastrobd;

import java.sql.DriverManager;

public class SingleConnection {
	
	private static String url = "jdbc:postgresql://localhost:5433/posjava";
	private static String password = "12345";
	private static String user = "admin";
	private static boolean connection = true;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
		
	}
	
	private static void conectar() {
		try {
			
			if (connection == false) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, password, user) == null;
				System.out.println("Conectou com Sucesso");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean getConnection() {
		return connection;
	}
	
}
