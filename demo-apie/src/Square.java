import java.math.BigDecimal;

public class Square extends Shape{
    private double length;
  
  public Square(String color, double length){
    super(color);
    this.length = length;
  }

  public Square(){

  }

  public double getLength(){
    return this.length;
  }

  public void setLength(double length){
    this.length = length;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).doubleValue();
  }
}
