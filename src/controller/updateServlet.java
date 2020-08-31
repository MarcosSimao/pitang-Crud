package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CheckEmail;
import database.InserirDao;
import database.UpdateDao;
import model.Phones;
import model.User;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int id =Integer.parseInt(request.getParameter("id"));
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
		UpdateDao update = new UpdateDao();
		Phones residencial = new Phones(ddd, fixo, fixoTel);

		Phones movel = new Phones(ddd, celular, celularTel);

		phones.add(residencial);
		phones.add(movel);

		User use = new User(nome, email, senha, phones);
		if (!check.checkEmail(use.getEmail())) {
			update.updateTel(id, use);
			}else {
				if(check.checkEmailID(id,use.getEmail())) {
					update.updateTel(id, use);
					out.println(VarGlobais.imprimir);
				}else {
					out.println("email  ja existe !!");
				}
			
			}
		
	}

}
