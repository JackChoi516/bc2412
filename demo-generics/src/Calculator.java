public class Calculator<T extends Number> { // Byte, Short, Integer, Long, Float, Double
  private T x;
  private T y;

  public Calculator(T x, T y){
    this.x = x;
    this.y = y;
  }

  public Number sum(){
    if (this.x instanceof Byte && this.y instanceof Byte){
      return (byte) this.x + (byte) this.y; // byte + byte > int > Integer
    }else if (this.x instanceof Short && this.y instanceof Short){

    }else if (this.x instanceof Integer && this.y instanceof Integer){

    }else if (this.x instanceof Long && this.y instanceof Long){

    }else if (this.x instanceof Float && this.y instanceof Float){

    }else if (this.x instanceof Double && this.y instanceof Double){

    }
  }

  public static void main(String[] args) {
    Calculator<Byte> calculator = 
      new Calculator<>(Byte.valueOf("10"), Byte.valueOf("20"));

    Calculator<Number> calculator2 = 
      new Calculator<>(Byte.valueOf("10"), Short.valueOf("20"));
      // private Number x;
      // private Number y;

      Double a = new Double("10");
      Double b = new Double("10");
      double c = a + b;
      System.out.println(c);
  }
}
