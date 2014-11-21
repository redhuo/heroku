package Sevlets;

import java.util.ArrayList;
import java.io.Serializable;

/**
*Clase persona, para el registro de los usuarios de la red
*@author Kenneth
*/

public class Person implements Serializable{

  // Atributos generales de la persona
  private String name;
  private String age;
  private String carear;
  private String ageCarear;
  private String numberPhone;
  private String address;
  private String email;
  private String password;


  // Listas para almacenar los amigos junto las relaciones
  private ArrayList<Relation> relations = new ArrayList<Relation>();

  // Direccion de la fototografia
  private String profilePic;

  /**
  * Constructor de la clase persona
     * @param name
     * @param numberPhone
     * @param age
     * @param address
     * @param carear
     * @param ageCarear
     * @param email
     * @param profilePic
     * @param password
  */
  /*public Person (String name, int age, String carear,
   int ageCarear,int numberPhone, String address, String email, String profilePic, String password){

    this.name = name;
    this.age = age;
    this.carear = carear;
    this.ageCarear = ageCarear;
    this.numberPhone = numberPhone;
    this.address = address;
    this.email = email;
    this.profilePic = profilePic;
    this.password = password;
  }*/



  /**
    * Constructor de la clase sin fotografia
    * @param name
    * @param age
    * @param carear
    * @param ageCarear
    * @param numberPhone
    * @param address
    * @param email
    * @param password
  */
    public Person (String name, String age, String carear,
   String ageCarear,String numberPhone, String address, String email, String password){

      this.name = name;
      this.age = age;
      this.carear = carear;
      this.ageCarear = ageCarear;
      this.numberPhone = numberPhone;
      this.address = address;
      this.email = email;
      this.password = password;

  }

    /**
     *
     * @return
     */
    public String getName(){
        return this.name;
  }

    /**
     *
     * @return
     */
    public String getAge(){
    return this.age;
  }

    /**
     *
     * @return
     */
    public String getCarear(){
    return this.carear;
  }

    /**
     *
     * @return
     */
    public String getAgeCarear(){
    return this.ageCarear;
  }

    /**
     *
     * @return
     */
    public String getNumberPhone(){
    return this.numberPhone;
  }

    /**
     *
     * @return
     */
    public String getAddress(){
    return this.address;
  }

    /**
     *
     * @return
     */
    public String getEmail(){
    return this.email;
  }

    /**
     *
     * @return
     */
    public String getProfilePic(){
    return this.profilePic;
  }

    /**
     *
     * @param pos
     * @return
     */
    public Relation getRelation(int pos){
    return relations.get(pos);
  }

    /**
     *
     * @param name
     * @return
     */
    public int getPositionRelation(String name){
    for(int i = 0; i < relations.size(); i++){
      if(name == relations.get(i).getDestination().getName()){
        return i;
      }
    }
    return -1;
  }

    /**
     *
     * @param pos
     * @return
     */
    public Person getFriend(int pos){
    return relations.get(pos).getDestination();
  }

    /**
     * Obtiene el array de relaciones con los amigos
     * @return
     */
    public ArrayList<Relation> getRelations(){
    return relations;
  }

  public String getPassword(){
    return this.password;
  }

  // Sets de alguno de los datos

    /**
     *
     * @param profilePic
     */
      public void setProfilePic(String profilePic){
    this.profilePic = profilePic;
  }

    /**
     *
     * @param number
     */
   /* public void setNumberPhone(int number){
    this.numberPhone = number;
  }*/

    /**
     *
     * @param email
     */
    public void setEmail(String email){
    this.email = email;
  }

    /**
     *
     * @param relation
     */
    public void setRelation(Relation relation){
    relations.add(relation);
  }




    /**
     * Agrega amigo, junto su relacion
     * @param relation
     */
      public void addFriend(Relation relation){
    relations.add(relation);
    Relation reRelation = new Relation(this);
    relation.getDestination().setRelation(reRelation);
  }

    /**
     * Imprime los amigos
     */
    public void getFriendsToString(){
    for(Relation temp : this.relations){
        System.out.println(temp.getDestination().getName());
    }
  }

    /**
     * Remueve relacion
     * @param relation
     */
    public void removeRelation(Relation relation){
    relations.remove(relation);
  }
}
