import java.util.function.Function;

// Function (Java Built-in interface)
public class StringLengthFunction implements Function<String, Integer> {
  @Override
  public Integer apply(String s){
    return s.length();
  }

  public static void main(String[] args) {
    StringLengthFunction slf = new StringLengthFunction();
    System.out.println(slf.apply("hello"));

    // Lambda Expression (runtime define formula)
    Function<String, Integer> stringlength = s -> s.length();
    System.out.println(stringlength.apply("hello")); // 5
    
  }
}
