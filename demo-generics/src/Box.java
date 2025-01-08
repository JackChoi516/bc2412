import java.math.BigDecimal;

// The T in "Class, instance variable, instance, instance method" are with the same definition
// But the T in static method is completely different thing. So, we have to redefine the T.
public class Box<T extends Shape> {
  private T[] shapes;

  public Box(){
    this.shapes = (T[]) new Shape[2];
  }

  // The T in instance method refers to the definition T of class
  public void addShape(int idx, T shape){
    this.shapes[idx] = shape;
  }

  public double totalArea(){
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Shape shape : this.shapes){
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }

  // The T in static method is not referring the T in Class
  public static <T extends Shape>double totalArea(T[] shapes){
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes){
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    Box<Circle> box1 = new Box<>();
    box1.addShape(0, new Circle(3.0));
    box1.addShape(1, new Circle(4.0));
    System.out.println(box1.totalArea()); // 78.54

    // Circle to shape[0];
    // Square to shape[0];
    Box<Shape> box2 = new Box<>();
    box2.addShape(0, new Circle(3.0));
    box2.addShape(1, new Square(10.0));
    System.out.println(box2.totalArea()); // 128.27

    Box.totalArea(null);

    // Team<Hero>?

  }
}
