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
  
}