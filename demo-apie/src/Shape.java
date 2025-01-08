public abstract class Shape { // Parent Class: color
  // Square.class, Triangle.class
  // abstract class vs class
  // 1. CANNOT create object for abstract class
  // 2. They are both with common attribute for child class
  // 3. abstract class's constructor is for child class to "super"
  private Color color;

  public Shape(){
    
  }

  public Shape(Color color){
    this.color = color;
  }

  public Color getColor(){
    return this.color;
  }

  // implicitly public for abstract method
  // Implication: If the child class cannot provide area implementation, then it is not a shape.
  // the child class must provide the implication of abstract method
  abstract double area();

  // area() return double

  public static Shape create(char ref,double length){ // S > Square, C > Circle
    switch(ref){
      case 'S':
        return new Square(length);
      case 'C':
        return new Circle(length);
      default:
        return null;
    }
  }

  public static Circle createCircle(double radius){
    return new Circle(radius);
  }
  
  public static void main(String[] args) {
    // new Shape('R'); // compile error, abstract class
    //Shape s = Shape.create('C',Color.YELLOW, 3.0);
    //System.out.println(s.area());
    

    
    

    ///Circle c2 = Shape.createCircle(Color.RED, 3.0);
    // Hero.createArcher();

  }
}
