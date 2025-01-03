public abstract class Shape { // Parent Class: color
  // Square.class, Triangle.class
  // abstract class vs class
  // 1. CANNOT create object for abstract class
  // 2. They are both with common attribute for child class
  // 3. abstract class's constructor is for child class to "super"
  private String color;

  public Shape(){
    
  }

  public Shape(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  // implicitly public for abstract method
  // Implication: If the child class cannot provide area implementation, then it is not a shape.
  // the child class must provide the implication of abstract method
  abstract double area();

  // area() return double
  
  public static void main(String[] args) {
    // new Shape('R'); // compile error, abstract class
  }
  
}
