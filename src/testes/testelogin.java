package testes;

import database.CheckEmail;
import database.LoginUser;

public class testelogin {

	public static void main(String[] args) {
LoginUser login = new LoginUser();
		
		CheckEmail check = new CheckEmail();
		if(check.checkEmail("la@venus")) {
			
		if(login.login("la@venus", "senha")) {
			System.out.println("bem vindo");
		}else {
			System.out.println("senha esta errada !!");
		}
		
		}else {
			System.out.println("nao encontramos o email !! ");
		}
	}

	}

