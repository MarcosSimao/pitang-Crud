package testes;

import java.util.ArrayList;
import java.util.List;

import database.CheckEmail;
import database.InserirDao;
import model.Phones;
import model.User;

public class testeCadastro {

	public static void main(String[] args) {
		List<Phones> phones = new ArrayList();
		CheckEmail check = new CheckEmail();
		Phones residencial = new Phones(72, "35257845", "residencial");

		Phones celular = new Phones(72, "9834533", "celular");

		phones.add(residencial);
		phones.add(celular);

		User use = new User("laiane", "la@laiane", "senha", phones);
		if (!check.checkEmail(use.getEmail())) {
			
			InserirDao usedao = new InserirDao();
			usedao.linInsertTel(usedao.insertUser(use));
		} else {
			System.out.println("email ja existe");
		}
	}

}
