package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.ListarDao;
import model.User;

/**
 * Servlet implementation class listarServlet
 */
@WebServlet("/listarServlet")
public class listarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	ListarDao lDao = new ListarDao();
    	  try {
    		  ArrayList<User> lista = lDao.listarAll();
				request.setAttribute("listaUser", lista);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/listar.jsp");
				requestDispatcher.forward(request, response);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
    	 
    	 }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
