public class Cat extends Animal{ 
  // Animal.class is a Parent Class
  // Cat.class is a Child Class
  // Inherit all attributes from Parent Class

  //private String name;
  private int age;

  // constructor
  public Cat (String name, int age){
    // this.name = name;
    super(name); // Calling Parent Constructor
    // must be the first line to call super()
    this.age = age;
}

//   Inherit PParent all instance methods
//   public String getName(){
//     return this.name;
//   }

  // walk()
  public void walk(){
    System.out.println("Cat is walking...");
  }

  public static void main(String[] args) {
    
    Cat cat = new Cat("Tom", 7);
    cat.walk();
    System.out.println(cat.getName());


  }
}
