package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckEmail {
	private Connection conner;
	private PreparedStatement command;

	public CheckEmail() {
		try {
			this.conner = Conection.net();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public boolean checkEmail(String email) {

		String sql = "SELECT email FROM user where email = ?";
		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setString(1, email);
			ResultSet answer = this.command.executeQuery();
			if (answer.next()) {

				return true;

			} else {
				return false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("nao encontramos o email ");

			return false;
		}

	}
	public boolean checkEmailID(int id,String email) {
   
		
		String sql = "SELECT id,email FROM user where id = ? AND email = ?";
		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setInt(1,id);
			this.command.setString(2, email);
			
			ResultSet answer = this.command.executeQuery();
			if (answer.next()) {

				return true;

			} else {
				return false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("nao encontramos o email ");

			return false;
		}


	}

}
