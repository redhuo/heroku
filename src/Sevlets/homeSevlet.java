package Sevlets;

import java.io.IOException;

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
		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("usuario");
		String no = request.getParameter("password");
		String mensaje;
		System.out.println(user);
		if (user.equals("hola")){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		if (user.equals("")){
			mensaje= "No ha agregado ningun usario";
			System.out.println("no sirve");
			request.setAttribute("mensaje",mensaje);
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
				
		}
		else{
			if(user.equals("hola") && no.equals("no")){
				mensaje="Bienvenido";
				System.out.println(user);
				RequestDispatcher dispatcher = request.getRequestDispatcher("perfil.jsp");
				dispatcher.forward(request, response);
				
					
			}
			else{
			mensaje="No hay Usuario Registrado";
			request.setAttribute("mensaje",mensaje);
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
				
		}}
		
			
		
		
	}

	

}
