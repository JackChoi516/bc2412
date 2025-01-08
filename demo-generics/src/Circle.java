import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
// Why do we need shape (Parent Class)?
public class Circle extends Shape {
  private double radius;

  // If you don't specify the constructor, implicitly you have an empty constructor  
  public Circle(){
    super();    
  }

  public Circle( double radius){
    // if you don't specify super() here, implicitly you are calling super()
    //super(color); // because you have "extends", you have to "super"
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  @Override 
  // Override the parent given method
  // compiler will help to check if the parent class has an area() method
  public double area(){
    return BigDecimal.valueOf(Math.pow(this.radius, 2)).multiply(BigDecimal.valueOf(Math.PI)).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }

  // @Override
  // public boolean equals(Object obj){
  //   if (this == obj){
  //     return true;
  //   }
  //   if (!(obj instanceof Circle)){
  //     return false;
  //   }
  //   Circle circle = (Circle) obj;
  //   return Objects.equals(circle.getColor(), super.getColor()) && Objects.equals(circle.getRadius(), this.radius);
  // } 

  // @Override
  // public int hashCode(){
  //   return Objects.hash(super.getColor(), this.radius);
  // }

  // @Override
  // public String toString(){
  //   return "Circle[" + super.getColor() + ", radius:" + this.radius + "]";
  // }

  
}
