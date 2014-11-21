package Sevlets;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Nodo interfaz de la persona
 * @author Kenneth
 */
public class Nodo implements Serializable{

  Person person;
  double distance = Double.POSITIVE_INFINITY;
  Nodo previous;
  boolean visitado = false;

    /**
     *
     * @param person
     */
    public Nodo(Person person){
    this.person = person;
  }

    /**
     *
     * @return
     */
    public Person getPerson(){
    return this.person;
  }

    /**
     *
     * @return
     */
    public ArrayList<Relation> getFriends(){
    return person.getRelations();
  }

    /**
     *
     * @param pos
     * @return
     */
    public Person getFriend(int pos){
    return person.getFriend(pos);
  }

    /**
     *
     * @param distance
     */
    public void setDistance(double distance){
    this.distance = distance;
  }

    /**
     *
     * @return
     */
    public double getDistance(){
    return this.distance;
  }

    /**
     *
     * @param previous
     */
    public void setPrevious(Nodo previous){
    this.previous = previous;
  }

    /**
     *
     * @return
     */
    public Nodo getPrevious(){
    return this.previous;
  }

    /**
     *
     */
    public void setVisitado(){
    this.visitado = true;
  }

    /**
     *
     * @return
     */
    public boolean getVisitado(){
    return this.visitado;
  }



}
