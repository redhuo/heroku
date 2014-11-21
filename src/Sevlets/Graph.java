package Sevlets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Red Social
 * @author Kenneth
 */
public class Graph implements Serializable{

    private static ArrayList<Nodo> people = new ArrayList<Nodo>();

    /**
     * Agrega una persona al grafo
     * @param newPerson
     */
    public void addPerson(Nodo newPerson){
      people.add(newPerson);
    }

    /**
     * Imprime las personas del grafo
     */
    public void getPeopleToString(){
      for(Nodo temp : people){
        System.out.println(temp.getPerson().getName());
      }
    }
    
    public Nodo buscarNodo(String name){
    	for(Nodo nodo : people){
    		if(nodo.getPerson().getName() == name){
    			return nodo;
    		}
    	}
    	return null;
    }

    /**
     * Elimina una persona del grafo y de las amistades
     * @param nodoPerson
     */
    public void removePerson(Nodo nodoPerson){
      this.people.remove(nodoPerson);

      for(Nodo nodo : people){
        for(Relation relation : nodo.getPerson().getRelations()){
          if(relation.getDestination() == nodoPerson.getPerson()){
            nodo.getPerson().removeRelation(relation);
            break;
          }
        }
      }

    }
    public int getSize(){
    	return people.size();
    }
    public Person getPerson(int i){
    	return people.get(i).getPerson();
    }

    /**
    * Busca a una persona por su email
    * @param email Email de la persona
    * @return Person Persona que se buscaba
    */
    public Person searchPerson(String email){
      for(Nodo nodo : people){
        if(nodo.getPerson().getEmail().equals(email)){
        	System.out.println("exito");
          return nodo.getPerson();
        }
      }
      return null;
    }
    public Nodo searchHuman(String name){
        for(Nodo nodo : people){
          if(nodo.getPerson().getName().equals(name)){
          	System.out.println("exito");
            return nodo;
          }
        }
        return null;
      }

    /**
    * Verifica el login
    * @param name Nombre de la persona
    * @return boolean Existe o no en el registro
    */
    public boolean login(String email, String password){
      for(Nodo nodo : people){
    	  System.out.println("people");
    	  System.out.println(nodo.getPerson().getName());
    	  System.out.println("people");
    	  System.out.println("Estoy en el for");
    	  String temp = nodo.getPerson().getEmail();
    	  System.out.println("temp");
    	  System.out.println(temp);
        if(temp.equals(email)){
        	System.out.println("Estoy dentro del EMAIL");
        	temp = nodo.getPerson().getPassword();
        	if(temp.equals(password)){
        		System.out.println("Estoy dentro del pass");
        		return true;
        	}
        
          }
        }
      
      return false;
    }


    /**
     * Busca un nodo en un array
     * Es utilizado para buscar los nodos visitados
     * @param array Lista en donde desea buscar el nodo
     * @param person Persona dentro del nodo que desea buscar
     * @return Nodo de la lista
     */
    public Nodo searchNodo(ArrayList<Nodo> array, Person person){

      for(Nodo newNodo : array){
        if(newNodo.getPerson() == person){
          return newNodo;
        }
      }
      return null;
    }

    /**
     * Imprime el camino mas corto
     * @param list Lista del camino mas corto
     * @return String del camino
     */
    public String shortPath(ArrayList<Nodo> list){
      String shortPath = "";
      for(Nodo nodo : list){
        shortPath = shortPath + "-->" + nodo.getPerson().getName();
      }
      return shortPath;
    }




    /**
     * Algoritmo que determina el camino mas corto utilizando dijkstra
     * @param source Nodo fuente
     * @param destino Nodo destino
     * @return Recorrido mas corto
     */
    public ArrayList<Nodo> dijkstra(Nodo source, Nodo destino){

      // Se le establece al nodo fuente la distancia como 0
      // Se implementa un cola
      source.setDistance(0);
      Queue nodoQueue = new Queue();
      nodoQueue.add(source);
      Nodo tDestino = null;
      Nodo nodoDestino = null;

      // Contador para comparar visitados
      int cont = source.getPerson().getRelations().size() + 1;

      // Lista con la gente visitada
      ArrayList<Nodo> peopleVisit = this.people;

      // Iteracion hasta que la cola quede vacia
      while (!nodoQueue.isEmpty()){

        int cont2 = 0;
        Nodo nodoTemp;

        // Bucle para asignar los visitados y comparacion
        for(Nodo nodoSeth : peopleVisit){
          if(nodoSeth.getVisitado() == true){
            cont2 ++;
          }
        }
        if(cont2 == cont){
          return null;
        }

        nodoTemp = nodoQueue.poll();

        // Lista para cada relacion entre amigos
        ArrayList<Relation> lista = nodoTemp.getFriends();

        // Analiza cada nodo con su peso y los pesos de la lista de adyacencia
        // Ademas suma o actualiza si es necesario
        for (Relation relations : lista){

          nodoDestino = new Nodo(relations.getDestination());
          double distT = nodoTemp.getDistance() + relations.getWeight();


          if (distT < nodoDestino.getDistance()){

            // Actualiza el nodo que sigue
            // Y se establece el antecesor
            nodoQueue.remove(nodoDestino);
            nodoDestino.setDistance(distT);
            nodoDestino.setPrevious(nodoTemp);
            nodoQueue.add(nodoDestino);
            }
          }

          // Comparacion que identifica si es el nodo que se busca
          if(destino.getPerson().getName() == nodoDestino.getPerson().getName()){
            tDestino = nodoDestino;
            break;
        }

        // Marca como visitado el nodo
        Nodo nodoVisit = searchNodo(peopleVisit,nodoTemp.getPerson());
        nodoVisit.setVisitado();

      }

      return getShortPath(tDestino);
    }

    /**
    * Algoritmo que determina el camino mas corto utilizando dijkstra
    * @param target Nodo buscado
    * @return Lista del camino
    */
    private ArrayList<Nodo> getShortPath(Nodo target){

        ArrayList<Nodo> path = new ArrayList<Nodo>();
        // Itera los nodos antecesores hasta llegar a nulo, encontrando el camino corto
        for (Nodo vertex = target; vertex != null; vertex = vertex.getPrevious()){
            path.add(vertex);
        }


        // Se le da vuelta para mostrar el camino correcto
        Collections.reverse(path);
        return path;
    }


  //   public static void main(String[] args) {
  //     Person personita1 = new Person("Jimmy",19,"ATI",1,9090,"Santa AnA","jimmy@gmail.com","jimmyphono","password");
  //     Person personita2 = new Person("Seth",19,"ATI",1,9090,"Santa AnA","jimmy@gmail.com","jimmyphono","password");
  //     Person personita3 = new Person("lol",19,"ATI",1,9090,"Santa AnA","jimmy@gmail.com","jimmyphono","password");
  //     Person personita4 = new Person("shiri",19,"ATI",1,9090,"Santa AnA","jimmy@gmail.com","jimmyphono","password");
  //
  //     Nodo nodoPersona1 = new Nodo(personita1);
  //     Nodo nodoPersona2 = new Nodo(personita2);
  //     Nodo nodoPersona3 = new Nodo(personita3);
  //     Nodo nodoPersona4 = new Nodo(personita4);
  //
  //     Graph grafo = new Graph();
  //
  //     grafo.addPerson(nodoPersona1);
  //     grafo.addPerson(nodoPersona2);
  //     grafo.addPerson(nodoPersona3);
  //     grafo.addPerson(nodoPersona4);
  //
  //     System.out.println("Gente del grafo");
  //     grafo.getPeopleToString();
  //
  //
  //     Relation relacion = new Relation(personita2);
  //     personita1.addFriend(relacion);
  //     personita3.addFriend(relacion);
  //
  //     System.out.println("Amigos de Jimmy");
  //
  //     personita1.getFriendsToString();
  //
  //     System.out.println("Amigos de Seth");
  //
  //     personita2.getFriendsToString();
  //
  //     System.out.println("Amigos de lol");
  //
  //     personita3.getFriendsToString();
  //
  //     System.out.println("Camino mas corto");
  //
  //
  //     grafo.removePerson(nodoPersona3);
  //
  //
  //     if (grafo.dijkstra(nodoPersona1, nodoPersona2)== null){
  //       System.out.println("No tiene amigos");
  //     }
  //     else{
  //       System.out.println(grafo.shortPath(grafo.dijkstra(nodoPersona1, nodoPersona2)));
  //     }
  // }
}
