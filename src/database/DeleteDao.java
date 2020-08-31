package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteDao {
	private Connection conner;
	private PreparedStatement command;

	public DeleteDao() {
		try {
			this.conner = Conection.net();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean deletePhones(int id) {
		if (id != 0) {
			String sql = "DELETE FROM phones WHERE user_id = ?";
			try {
				this.command = this.conner.prepareStatement(sql);
				this.command.setInt(1, id);
				if (this.command.executeUpdate() > 0) {
					if (deleteUser(id)) {

						return true;
					}

				} else {
					return false;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("erro no deletar");
				return false;
			}
		} else {
			System.out.println("nao aceitamos numeros nullos");
			return false;
		}
		return false;

	}

	public boolean deleteUser(int id) {
		String sql = "DELETE FROM user WHERE id = ?";
		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setInt(1, id);
			if (this.command.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("erro no deletar");
			return false;
		}

	}

	
}
