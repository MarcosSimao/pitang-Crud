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

public class InserirDao {
	private Connection conner;
	private PreparedStatement command;
	private StringBuilder sql;

	public InserirDao() {
		try {
			this.conner = Conection.net();
			this.sql = new StringBuilder();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	/*
	 * Aqui cadastra o usuario e retorna a um metodo que recupera o iddo usuario
	 * para cadastrar a lista de delefones com a chave estrangeira ,que e o id do
	 * mesmo
	 * 
	 */
	public User insertUser(User use) {

		this.sql.append("INSERT INTO user");
		this.sql.append("(nome,email,senha)");
		this.sql.append("VALUES(?,?,?)");
		try {
			this.command = this.conner.prepareStatement(this.sql.toString());
			this.command.setString(1, use.getNome());
			this.command.setString(2, use.getEmail());
			this.command.setString(3, use.getSenha());
			this.command.executeUpdate();

			return use;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	/*
	 * Metodo que recupera o id do Usuario e envia para o metodo que vai tratar o
	 * envio da lista
	 */
	public void linInsertTel(User use) {
		if (!use.equals(null)) {
			String sql = "SELECT id FROM user where email = ?";
			try {
				this.command = this.conner.prepareStatement(sql);
				this.command.setString(1, use.getEmail());
				ResultSet answer = this.command.executeQuery();
				if (answer.next()) {
					int id = answer.getInt("id");

					if (inserirListTel(id, use)) {
					VarGlobais.imprimir="cadastrado com sucesso !! ";
					}

				} else {
					
					VarGlobais.imprimir="resposta vazia ";
					
				}
			} catch (SQLException e) {

				e.printStackTrace();
				
				VarGlobais.imprimir="nao encontramos o email ";
			
			}

		} else {
			VarGlobais.imprimir="erro no cadastro!! ";
			
		}
	}

	/*
	 * 
	 * nesse metodo pega o id do usuario e trata o list do telefone para encaixar na
	 * chave estrangeira ...
	 * 
	 */

	public boolean inserirListTel(int id, User use) {
		int c = 1;

		for (int i = 0; i <= use.getPhones().size()-1; i++) {

			c++;

			inserirPhone(id, new Phones(use.getPhones().get(i).getDdd(), use.getPhones().get(i).getNumero(),
					use.getPhones().get(i).getTipo()));

		}

		if (c <= 1) {
			return false;
		} else {
			return true;
		}

	}

	public void inserirPhone(int id, Phones phone) {

		String sql = "INSERT INTO phones (user_id,ddd,numero,tipo) VALUES (?,?,?,?)";

		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setInt(1, id);
			this.command.setInt(2, phone.getDdd());
			this.command.setString(3, phone.getNumero());
			this.command.setString(4, phone.getTipo());
			this.command.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erro no cadastrodo telefone");
		}

	}

}
