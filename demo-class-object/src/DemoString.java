public class DemoString {
  public static void main(String[] args) {
    String s = "hello"; // Literal Pool
    String s2 = "hello"; // Literal Pool
    String s3 = s; // s3 and s pointing to same object
    String s4 = "hello!";
    String s5 = new String("hello");
    String s6 = String.valueOf("hello"); // Leverage Literal Pool
    String s7 = new String("hello");

    // identityHashCode > Object reference (address)
    System.out.println(System.identityHashCode(s)); // 1159190947
    System.out.println(System.identityHashCode(s3)); //1159190947
    System.out.println(System.identityHashCode(s2)); // 1159190947
    System.out.println(System.identityHashCode(s4)); // 925858445
    System.out.println(System.identityHashCode(s5)); // 798154996
    System.out.println(System.identityHashCode(s6)); // 1159190947
    System.out.println(System.identityHashCode(s7)); // 681842940

    // equals(), ==
    // If you use "==" for non-primitive, you are checking the object reference
    // Besides, s.equals() is checking the String value itself
    System.out.println(s == s2); // true
    System.out.println(s.equals(s2)); // true

    System.out.println(s == s5); // false
    System.out.println(s.equals(s5)); // true

    System.out.println(s5 == s7); // false
    System.out.println(s.equals(s5)); //true

    // String is immutable (Purpose: Reduce Risk)

    // Question: after appending "?", is "s" still the same object? No.
    s = s + "?";
    System.out.println(System.identityHashCode(s)); // 1670782018

    
    


    
  }
}
