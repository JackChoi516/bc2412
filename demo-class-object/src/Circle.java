import java.math.BigDecimal;

public class Circle {
  private double radius;
  //private String color;

  // Contructor
  public Circle(double radius){
    this.radius = radius;
  }

  // getter
  public double getDiameter(){
    return this.radius * 2;
  }

  // setter
  public void setRadius(double radius){
    this.radius = radius;
  }

  // instance method
  public double calculateArea(){
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(this.radius)) //
    .multiply( BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }

  // static method: CANNOT call "this"
  // Design Definition: input > output
  public static double calculateArea2(double radius){
    return BigDecimal.valueOf(radius) //
    .multiply(BigDecimal.valueOf(radius)) //
    .multiply( BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }

  public static void main(String[]args){
    // area
    // BigDecimal
    Circle c1 = new Circle(3.0);
    // Presentation
    System.out.println(c1.calculateArea()); // 28.274333882308138

    // Formula
    System.out.println(Circle.calculateArea2(3.0));

  }

}

  
