package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUser {
	private Connection conner;
	private PreparedStatement command;

	public LoginUser() {
		try {
			this.conner = Conection.net();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public boolean login(String email, String password) {

		String sql = "SELECT email,senha FROM user where email = ? AND senha = ?";
		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setString(1, email);
			this.command.setString(2, password);
			ResultSet answer = this.command.executeQuery();
			if (answer.next()) {
				 
				return true;

			} else {
				return false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("nao encontramos a senha ");

			return false;
		}

	}
}
