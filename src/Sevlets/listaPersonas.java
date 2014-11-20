package Sevlets;

import java.util.ArrayList;

public class listaPersonas {
	
	
		
	ArrayList <Person> Personas = new ArrayList<Person>();
	public listaPersonas(){
		//Personas.add(nuevo);
	}
	public void madd(Person nuevo){
		Personas.add(nuevo);
	}
	public Person elegir(int posicion){
		return Personas.get(posicion);
	}

}
