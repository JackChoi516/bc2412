public class Person { // blueprint - define a person
    // attributes
    private String name;
    private int age;
    private String email;

    // constructor (Not Method)
    // constructoris to create object
  public Person(String x, int y, String z) {
    this.name = x;
    this.age = y;
    this.email = z;
    }
  // getter (instance = object)
  // instance Method is able to return self value
  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public String getEmail(){
    return this.email;
  }

  // setter
  // void > return type (return nothing)
  public void setName(String name){
    this.name = name;
  }

  public void setAge(int x){
    this.age = x;
  }

  public void setEmail(String email){
    this.email = email;
  }

}



 
