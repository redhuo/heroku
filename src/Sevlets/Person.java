package Sevlets;



import java.util.ArrayList;


public class Person implements java.io.Serializable{

  private String name;
  private String age;
  private String carear;
  private String ageCarear;
  private String numberPhone;
  private String address;
  private String email;

  private ArrayList <Person> friends = new ArrayList<Person>();
  private String profilePic;


  public Person (String name, String age, String carear,
   String ageCarear,String numberPhone, String address, String email){

    this.name = name;
    this.age = age;
    this.carear = carear;
    this.ageCarear = ageCarear;
    this.numberPhone = numberPhone;
    this.address = address;
    this.email = email;

  }


  public String getName(){
    return this.name;
  }
  public String getAge(){
    return this.age;
  }

  public String getCarear(){
    return this.carear;
    
  }

  public String getAgeCarear(){
    return this.ageCarear;
  }

  public String getNumberPhone(){
    return this.numberPhone;
  }

  public String getAddress(){
    return this.address;
  }

  public String getEmail(){
    return this.email;
  }

  public String getProfilePic(){
    return this.profilePic;
  }

  public void setProfilePic(String profilePic){
    this.profilePic = profilePic;
  }

  public void addFriend(Person persona){
    friends.add(persona);
  }


}
