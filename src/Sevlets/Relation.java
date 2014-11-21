package Sevlets;
import java.io.Serializable;

/**
 * Relacion entre personas
 * @author Kenneth
 */
public class Relation implements Serializable{

  private final int weight = 1;
  private Person destination;

    /**
     *
     * @param destination
     */
    public Relation(Person destination){
    this.destination = destination;
  }

    /**
     *
     * @return
     */
    public int getWeight(){
    return this.weight;
  }

    /**
     *
     * @return
     */
    public Person getDestination(){
    return this.destination;
  }
}
