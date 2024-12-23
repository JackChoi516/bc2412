public class Person { // blueprint - define a person
    // attributes
    private String name;
    private int age;
    private String email;
    private char gender; // F/M

    // constructor (Not Method)
    // constructoris to create object
  public Person(String x, int y, String z, char gender) {
    this.name = x;
    this.age = y;
    this.email = z;
    this.gender = gender;
    }
  // getter (instance = object)
  // instance Method is able to return self value
  public boolean isMale(){
    return this.gender == 'M'? true : false;
  }
  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public String getEmail(){
    return this.email;
  }

  public int getNameLength(){
    return this.name.length();
  }

  public boolean isElderly(){
    return this.age > 65;
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

  public static void main(String[] args) {
    Person p1 = new Person("Jimmy", 5, "Jimmy@gmail.com", 'M');
    System.out.println(p1.isMale()); // true
    System.out.println(p1.getName().length()); // 5
    System.out.println(p1.getNameLength()); // 5
    System.out.println(p1.isElderly()); // false
    p1.setAge(66);
    System.out.println(p1.isElderly()); // true
  }

}



 
