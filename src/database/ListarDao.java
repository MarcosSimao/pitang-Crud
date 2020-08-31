package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Phones;
import model.User;

public class ListarDao {
	private String sql;
	private Connection conner;
	private PreparedStatement command;

	public ListarDao() {
		try {
			this.conner = Conection.net();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public ArrayList<User> listarAll() {
		this.sql = "select * from user order by id asc";
		try {
			this.command = this.conner.prepareStatement(sql);
			ResultSet answer = this.command.executeQuery();
			ArrayList<User> listar = new ArrayList();
			while (answer.next()) {
				User use = new User();
				use.setId(answer.getInt("id"));
				use.setNome(answer.getNString("nome"));
				use.setEmail(answer.getNString("email"));
				use.setSenha(answer.getNString("senha"));
				use.setPhones(lisarPhone(answer.getInt("id")));
				listar.add(use);

			}
			return listar;
		} catch (SQLException e) {

			e.printStackTrace();
			
			return null;
		}

	}

	public List<Phones> lisarPhone(int id) {
		String sql = "SELECT id FROM phones where user_id = ?";
		List<Integer> ids = new ArrayList();
		List<Phones> list = new ArrayList();
		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setInt(1, id);
			ResultSet answer = this.command.executeQuery();
			while (answer.next()) {

				ids.add(answer.getInt("id"));

			}
			if (ids.size() == 2) {
				for (int i : ids) {
					String asql = "SELECT ddd,numero,tipo FROM phones where id = ?";
					try {
						this.command = this.conner.prepareStatement(asql);
						this.command.setInt(1, i);
						ResultSet novo = this.command.executeQuery();
						while (novo.next()) {
							Phones phone = new Phones();
							phone.setDdd(novo.getInt("ddd"));
							phone.setNumero(novo.getNString("numero"));
							phone.setTipo(novo.getString("tipo"));
							list.add(phone);

						}

					} catch (SQLException e) {

						e.printStackTrace();
						System.out.println("nao encontramos o telefone2");
					}

				}
				return list;
			}
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("nao encontramos o telefone");
		}

		return null;

	}
	
	/*
	 * 
	 * Listar por ids para update
	 * 
	 */
	public ArrayList<User> listarid(int id) {
		this.sql = "SELECT id,nome,email,senha FROM user where id = ?";
		 
		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setInt(1, id);
			ResultSet answer = this.command.executeQuery();
			ArrayList<User> listar = new ArrayList();
			while (answer.next()) {
				User use = new User();
				use.setId(answer.getInt("id"));
				use.setNome(answer.getNString("nome"));
				use.setEmail(answer.getNString("email"));
				use.setSenha(answer.getNString("senha"));
				use.setPhones(lisarPhone(answer.getInt("id")));
				listar.add(use);

			}
			return listar;
		} catch (SQLException e) {

			e.printStackTrace();
			
			return null;
		}

		
		
		
	}
	public List<Phones> lisarPhoneid(int id) {
		String sql = "SELECT id FROM phones where user_id = ?";
		List<Integer> ids = new ArrayList();
		List<Phones> list = new ArrayList();
		try {
			this.command = this.conner.prepareStatement(sql);
			this.command.setInt(1, id);
			ResultSet answer = this.command.executeQuery();
			while (answer.next()) {

				ids.add(answer.getInt("id"));

			}
			if (ids.size() == 2) {
				for (int i : ids) {
					String asql = "SELECT ddd,numero,tipo FROM phones where id = ?";
					try {
						this.command = this.conner.prepareStatement(asql);
						this.command.setInt(1, i);
						ResultSet novo = this.command.executeQuery();
						while (novo.next()) {
							Phones phone = new Phones();
							phone.setDdd(novo.getInt("ddd"));
							phone.setNumero(novo.getNString("numero"));
							phone.setTipo(novo.getString("tipo"));
							list.add(phone);

						}

					} catch (SQLException e) {

						e.printStackTrace();
						System.out.println("nao encontramos o telefone2");
					}

				}
				return list;
			}
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("nao encontramos o telefone");
		}

		return null;
		
	}
	
	

	

}
