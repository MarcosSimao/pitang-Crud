package controller;

import java.util.ArrayList;

import database.ListarDao;
import model.User;

public class testeListarAll {

	public static void main(String[] args) {
		ListarDao lDao = new ListarDao();

		ArrayList<User> lista = lDao.listarAll();
		for (User u : lista) {
			System.out.println("Resultado " + u.getPhones().get(0).getDdd());
		}

	}

}
