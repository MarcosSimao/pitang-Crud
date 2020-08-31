package testes;

import java.util.ArrayList;
import java.util.List;

import database.CheckEmail;
import database.UpdateDao;
import model.Phones;
import model.User;

public class TesteUpdate {

	public static void main(String[] args) {
		List<Phones> phones = new ArrayList();
		UpdateDao update = new UpdateDao();
		CheckEmail check = new CheckEmail();
		Phones residencial = new Phones(81, "4444444", "residencial");

		Phones celular = new Phones(81, "9999999", "celular");

		phones.add(residencial);
		phones.add(celular);

		User use = new User("luana", "la@laiane", "senha", phones);
		if (!check.checkEmail(use.getEmail())) {
		update.updateTel(30, use);
		}else {
			if(check.checkEmailID(30,use.getEmail())) {
				update.updateTel(30, use);
			}else {
				System.out.println("email  ja existe !!");
			}
		
		}
	}

}
