package model;
import java.util.ArrayList;
import java.util.List;
public class Person {
	private int id;
	
	private String nome,email,senha;
	private List <Phones> phones = new ArrayList();
	public Person() {
		
	}
	public Person(String nome, String email, String senha, List<Phones> phones) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.phones.addAll(phones);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Phones> getPhones() {
		return phones;
	}
	public void setPhones(List<Phones> phones) {
		this.phones.addAll(phones);
	}
	@Override
	public String toString() {
		return "Person [nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefones=" +phones + "]";
	}
	

}
