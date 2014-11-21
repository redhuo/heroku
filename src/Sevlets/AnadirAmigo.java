package Sevlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnadirAmigo
 */
@WebServlet("/buscar")
public class AnadirAmigo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnadirAmigo() {
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
		
		
		Nodo nodito = grafo.buscarNodo(nombrePer);
		
		/// Camino mas corto
		ArrayList<Nodo> lista = grafo.dijkstra(nodito,personaBus);
		String caminoCorto = grafo.shortPath(lista);
		request.setAttribute("camino",caminoCorto);
		
		String nombreAmigo = grafo.searchHuman(name).getPerson().getName();
		String emailAmigo = grafo.searchHuman(name).getPerson().getEmail();
		String edadAmigo = grafo.searchHuman(name).getPerson().getAge();
		String carreraAmigo = grafo.searchHuman(name).getPerson().getCarear();
		String Anos = grafo.searchHuman(name).getPerson().getAgeCarear();
		String direccion = grafo.searchHuman(name).getPerson().getAddress();
		String telefono = grafo.searchHuman(name).getPerson().getNumberPhone();
		request.setAttribute("nombre",nombreAmigo);
		request.setAttribute("email", emailAmigo);
		request.setAttribute("edad", edadAmigo);
		request.setAttribute("carrera",carreraAmigo );
		request.setAttribute("aCarreas", Anos);
		request.setAttribute("direccion", direccion);
		request.setAttribute("telefono",telefono);
		
		
		

		
		/// Agrega relacion//agregar un boton te
		
		
		
		
		RequestDispatcher requestDispatcher; 
		requestDispatcher = request.getRequestDispatcher("perfilBuscar.jsp");
		requestDispatcher.forward(request, response);
		
		
	
		
		//personaLog.addFriend(personaBus);
		
		
		
		
	/*	String nombre2 = amigos.getName();
		String correo2 = amigos.getEmail();
		request.setAttribute("name",nombre2);
		request.setAttribute("correo",correo2);*/
		
		//String email = request.getParameter("correo2");
}
		
	}

