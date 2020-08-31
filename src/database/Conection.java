package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
private static final String URL = "jdbc:mysql://localhost/pitang?useSSL=false&amp";
private static final String USUARIO="root";
private static final String PASSWORD="";


public static Connection net() throws SQLException {
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection connection = DriverManager.getConnection(URL,USUARIO,PASSWORD);
	
	return connection;
	
}
public static void main(String[] args) {
	try {
		Connection connection = Conection.net();
		System.out.println("sucesso ao conectar "+connection);
	}catch(SQLException ex) {
		System.out.println("acesso negado "+ex);
	}
}
}
