package model;

import java.util.List;

public class User  extends Person{
    
	
	
	public User() {
		
	}

	public User(String nome, String email, String senha, List<Phones> phones) {
		super(nome, email, senha, phones);
		
	}
	
}
