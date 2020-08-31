package testes;

import database.CheckEmail;

public class testeemail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckEmail check = new CheckEmail();
		if(check.checkEmail("la@marcos")) {
			System.out.println("email existe ");
		}else {
			System.out.println("email nao existe");
		}
		
			
		}
		

	}
