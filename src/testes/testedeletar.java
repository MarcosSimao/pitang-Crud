package testes;

import database.DeleteDao;

public class testedeletar {

	public static void main(String[] args) {
		
		DeleteDao delete = new DeleteDao();

		if (delete.deletePhones(29)) {
			System.out.println("deletado com sucesso");
		} else {
			System.out.println("erro ao deletar");
		}


	}

}
