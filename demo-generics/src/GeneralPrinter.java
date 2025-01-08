// Generics Design > Reduce number of Class
public class GeneralPrinter<T> { // <T> present the scope of "T" inside the class
  private T value;

  public GeneralPrinter(T value){
    this.value = value;
  }

  public T getValue(){
    return this.value;
  }

  public String print(){
    return "this is " + this.value.toString();
  }
  
  public static void main(String[] args) {
    GeneralPrinter<Integer> printer = new GeneralPrinter<>(Integer.valueOf(3));
    GeneralPrinter<Object> p2 = new GeneralPrinter<>(new Book("ASD"));

    

    Object obj = 3;
    if (obj instanceof Integer){
      Integer integer = (Integer) obj; // safety concern
      System.out.println(integer.compareTo(2)); // true
    }
    
  }
}