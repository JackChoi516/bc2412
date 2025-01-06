import java.math.BigDecimal;
import java.util.Objects;

public class Triangle extends Shape {
  private double bottom;
  private double height;

  public Triangle(){

  }

  public Triangle(String color, double bottom, double height){
    super(color);
    this.bottom = bottom;
    this.height = height;
  }

  public double getBottom(){
    return this.bottom;
  }

  public double getHeight(){
    return this.height;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.bottom).multiply(BigDecimal.valueOf(this.height)).divide(BigDecimal.valueOf(2)).doubleValue();
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    }
    if (!(obj instanceof Triangle)){
      return false;
    }
    Triangle triangle = (Triangle) obj;
    return Objects.equals(triangle.getColor(), super.getColor()) //
        && Objects.equals(triangle.getBottom(), this.bottom) //
        && Objects.equals(triangle.getHeight(), this.height);
  }

  @Override
  public int hashCode(){
    return Objects.hash(super.getColor(), this.bottom, this.height);
  }

  @Override
  public String toString(){
    return "Triangle[" + super.getColor() + ", Bottom:" + this.bottom + ", Height:" + this.height + "]";
  }

  public static void main(String[] args) {
    Triangle t1 = new Triangle("Red", 2.0, 2.0);
    Triangle t2 = new Triangle("Red", 2.0, 2.0);

    System.out.println(t1.equals(t2)); // true
    System.out.println(t1.hashCode()); // 78863504
    System.out.println(t2.hashCode()); // 78863504
    System.out.println(t1); // Triangle[Red, Bottom:2.0, Height:2.0]
  }
}
