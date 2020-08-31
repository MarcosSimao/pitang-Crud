package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CheckEmail;
import database.InserirDao;
import model.Phones;
import model.User;

/**
 * Servlet implementation class cadastroServlet
 */
@WebServlet("/cadastroServlet")
public class cadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		int ddd = Integer.parseInt(request.getParameter("ddd"));
		String fixo = request.getParameter("fixo");
		String fixoTel="Residencial";
		String celular= request.getParameter("celular");
		String celularTel="Celular";
		
		
		
		List<Phones> phones = new ArrayList();
		CheckEmail check = new CheckEmail();
		Phones residencial = new Phones(ddd, fixo, fixoTel);

		Phones movel = new Phones(ddd, celular, celularTel);

		phones.add(residencial);
		phones.add(movel);

		User use = new User(nome, email, senha, phones);
		if (!check.checkEmail(use.getEmail())) {
			
			InserirDao usedao = new InserirDao();
			usedao.linInsertTel(usedao.insertUser(use));
			out.println(VarGlobais.imprimir);
		} else {
			out.println("email ja existe");
		}
	
	}

}
