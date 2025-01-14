import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
  public static void main(String[] args) {
    // bubble sort (Nest Loop)


    List<Integer> integers = Arrays.asList(1, 3, 10, -4, 2);
    // integers = Collections.sort(integers);
    Collections.sort(integers); // pass by reference
    System.out.println(integers); // [-4, 1, 2, 3, 10]

    int[] arr = new int[]{10, 2, 9};
    allZero(arr);
    System.out.println(arr);

    // In Java, array & all custom type are always pass by reference.
    // primitive, wrapper class & String are alawys pass by value(a copy of value)

    // Custom type
    Book book = new Book("Sun");
    changeBookName(book); // pass by Book reference
    System.out.println(book); // Book[name=hello]

    // Primitive or Wrapper Class
    int a = 3;
    int b = 4;
    System.out.println(sum(a, b)); // 300, passing copy of values to the method
    System.out.println(a); // 3, but not 100, because we pass by value for primmitives
    System.out.println(b); // 4, but not 200, because we pass by value for primmitives

    // Sort String bu Collectios.sort();
    List<String> str = Arrays.asList("ASD", "QWE", "ZCX");
    Collections.sort(str);
    System.out.println(str); // [ASD, QWE, ZCX]

    BigDecimal bd1 = new BigDecimal(10);
    BigDecimal bd2 = new BigDecimal(3);
    System.out.println(addBigDecimal(bd1, bd2).doubleValue()); // 13.0
    System.out.println(bd1); // 10
    System.out.println(bd2); // 3
  }

  public static int sum(int a, int b){
    // 10000 lines
    a = 100;
    b = 200;
    return a + b;
  }

  public static String concat(String x, String y){
    return x.concat(y);
  }

  // overflow > int * int > int
  // long * long > long > Long
  public static Long multiply(int x, int y){
    return (long) x * (long) y; // avoid overflow
  }

  public static void allZero(int[] arr){
  // public static int[] allZero(int[] arr){ // pass by object reference
    for (int i = 0; i < arr.length; i++){
      arr[i] = 0;
    }
  }

  public static void changeBookName(Book book){
    book.setName("hello");
  }

  // public static Book changeBookName(Book book){
  //   return new Book("hello"); // similar to BigDecimal
  // }

  // BigDemcimal> pass by value OR pass by reference
  // similar to String
  public static BigDecimal addBigDecimal(BigDecimal original, BigDecimal delta){
    // Can you revise the value inside a BigDecimal
    return original.add(delta); // Always return a new BigDecimal Object
  }
  
}
