public class Dog extends Animal{
  // private String name;


  // constructor (Class CANNOT inherit Parent Constructor)
  public Dog(String name){
    super(name);
}

  // walk()
  public void walk(){
    System.out.println("Dog is walking...");
  }

  public static void main(String[] args) {
    
    Dog dog = new Dog("Ken");
    dog.walk();
    System.out.println(dog.getName());



  }
}
