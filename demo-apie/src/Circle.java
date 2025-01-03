import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
  private double radius;
  
  public Circle(){
    super();
  }

  public Circle(String color, double radius){
    super(color);
    this.radius = radius;
  }

  public double getArea(){
    return BigDecimal.valueOf(Math.pow(this.radius, 2)).multiply(BigDecimal.valueOf(Math.PI)).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }

  public static void main(String[] args) {
    Circle c1 = new Circle("Red", 2.0);
    System.out.println(c1.getArea());
  }
}
