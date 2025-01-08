import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size()); // 2

    // Difference between HashSet and ArrayList
    System.out.println(strings.add("ABC")); // false
    System.out.println(strings.size()); // 2, HashSet avoid duplicate item

    System.out.println(strings.add("XYZ")); // true
    System.out.println(strings.size()); // 3
  }
}
