package testes;

import java.util.ArrayList;

import database.ListarDao;
import model.User;

public class testeListarId {

	public static void main(String[] args) {
		ListarDao lDao = new ListarDao();

		ArrayList<User> lista = lDao.listarid(31);
		for (User u : lista) {
			System.out.println("Resultado " + u);
		}

	}

}
