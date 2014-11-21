package Sevlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Aceptar
 */
@WebServlet("/agregar")
public class Aceptar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aceptar() {
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
		String email = request.getParameter("correo2");
		String name = request.getParameter("bpersonas");
		serializeObj serial = new serializeObj();
		
		Graph grafo = serial.deserialiize();
	
		
		/// Name quiero buscar a jimmy
		/// personaBus es el nodo de jimmy
		/// personaLog es la PERSONA del perfil
		/// nombrePer es el nombre de la persona del perfil
		/// nodito es el NODO de la persona del perfil
	
		Nodo personaBus = grafo.searchHuman(name);
	
		Person personaLog = grafo.searchPerson(email);
		String nombrePer = personaLog.getName();
		Relation relacion = new Relation(personaBus.getPerson());
		
		
		/// Hasta que el otro mae acepte 
		String nombreAmigo = grafo.searchPerson(email).getName();
		String correo = grafo.searchPerson(email).getEmail();
		String edad = grafo.searchPerson(email).getAge();
		String carrera= grafo.searchPerson(email).getCarear();
		String Anos = grafo.searchPerson(email).getAgeCarear();
		String direccion = grafo.searchPerson(email).getAddress();
		String tel = grafo.searchPerson(email).getNumberPhone();
		request.setAttribute("name",name);
		request.setAttribute("correo",correo);
		request.setAttribute("edad",edad);
		request.setAttribute("carrera",carrera);
		request.setAttribute("direccion",direccion);
		request.setAttribute("tel",tel);
		//request.setAttribute("carreraA",carreraA);
		RequestDispatcher requestDispatcher; 
		requestDispatcher = request.getRequestDispatcher("perfilMain.jsp");
		requestDispatcher.forward(request, response);
		
		
	}

}
