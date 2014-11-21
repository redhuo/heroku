package Sevlets;

import java.util.LinkedList;
import java.io.Serializable;

/**
 * Cola
 * @author Kenneth
 */
public class Queue implements Serializable{

  private LinkedList<Nodo> queue = new LinkedList<Nodo>();

    /**
     *
     * @param nodo
     */
    public void add(Nodo nodo){
    this.queue.addFirst(nodo);
  }

    /**
     *
     * @return
     */
    public Nodo dequeue(){
    return queue.removeLast();
  }

    /**
     *
     * @return
     */
    public boolean isEmpty(){
    if(queue.isEmpty()){
      return true;
    }
    else{
      return false;
    }
  }

    /**
     *
     * @param nodo
     */
    public void remove(Nodo nodo){
    queue.remove(nodo);
  }

    /**
     *
     * @return
     */
    public Nodo poll(){
    return queue.pollLast();
  }
}
