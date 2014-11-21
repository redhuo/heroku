package Sevlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class homeSevlet
 */
@WebServlet("/Home")
public class homeSevlet extends HttpServlet {
	Graph grafo = new Graph();
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws IOException 
     * @throws ServletException 
     * @see HttpServlet#HttpServlet()
     */
    public homeSevlet() throws ServletException, IOException {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		serializeObj dato = new serializeObj();
		try{
			grafo = dato.deserialiize();
			
		}
		catch(Exception e){
			System.out.println("catch des");
		}
		
		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("email");
		System.out.println(user);
		
		String password = request.getParameter("password");
		

		String mensaje;
		System.out.println(password);
		System.out.println("GG1");
		grafo.getPeopleToString();

		
		if(grafo.login(user, password)== true){
			System.out.println("GG");
			mensaje="Bienvenido";
			//System.out.println(user);
			response.sendRedirect("perfil.jsp");
		}

		
		else{
			mensaje= "No ha agregado ningun usario";
			System.out.println("no sirve");
			request.setAttribute("mensaje",mensaje);
			
			response.sendRedirect("error.jsp");
		}
			
		
		
	}

	public static void main(String args[]){

}
}
