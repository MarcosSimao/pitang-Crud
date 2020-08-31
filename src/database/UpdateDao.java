package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controller.VarGlobais;
import model.Phones;
import model.User;

public class UpdateDao {
	private Connection conner;
	private PreparedStatement command;
	private String sql;

	public UpdateDao() {
		try {
			this.conner = Conection.net();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void updateTel(int id, User use) {
		if (id != 0) {
			this.sql = " UPDATE user SET nome = ?, email = ?, senha = ? WHERE id = ? ";

			try {
				this.command = this.conner.prepareStatement(this.sql);
				this.command.setString(1, use.getNome());
				this.command.setString(2, use.getEmail());
				this.command.setString(3, use.getSenha());
				this.command.setInt(4, id);
				if (this.command.executeUpdate() > 0) {
					updateLinkPhones(id, use);
				} else {
					System.out.println("erro ");
				}

				// if (updatelinkTel(id, use)) {
				// System.out.println("alterado com sucesso");
				// } else {
				//// System.out.println("erro ao alterar o registro");
				// }

			} catch (SQLException e) {
				e.printStackTrace();
				VarGlobais.imprimir="erro ao alterar registro!! ";
			}

		} else {
			VarGlobais.imprimir="nao aceitamos numeros nulos !! ";

		}

	}

	public void updateLinkPhones(int id, User use) {
		String sql = "SELECT id FROM phones where user_id = ?";
		List<Integer> ids = new ArrayList();
		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setInt(1, id);
			ResultSet answer = this.command.executeQuery();
			while (answer.next()) {

				ids.add(answer.getInt("id"));

			}
			updateListTel(ids, use);

		} catch (SQLException e) {

			e.printStackTrace();
			VarGlobais.imprimir="nao encontramos o email !! ";
		}

	}

	public void updateListTel(List<Integer> ids, User use) {

		for (int i = 0; i <= use.getPhones().size() - 1; i++) {

			updatePhones(ids.get(i), new Phones(use.getPhones().get(i).getDdd(), use.getPhones().get(i).getNumero(),
					use.getPhones().get(i).getTipo()));
		}
		VarGlobais.imprimir="alterado com sucesso !! ";

	}

	public void updatePhones(int id, Phones phone) {
		this.sql = " UPDATE phones SET ddd = ?, numero= ?, tipo = ? WHERE id = ? ";

		try {
			this.command = this.conner.prepareStatement(this.sql);
			this.command.setInt(1, phone.getDdd());
			this.command.setString(2, phone.getNumero());
			this.command.setString(3, phone.getTipo());
			this.command.setInt(4, id);
			this.command.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			VarGlobais.imprimir="erro no cadastro do telefone!! ";
		}

	}

	
}
