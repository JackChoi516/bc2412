import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    // new ArrayList<>();
    // List.of()
    // Arrays.asList()

    // 1.new ArrayList<>();
    // Able to add/remove/modify
    List<String> strings1 = new ArrayList<>();
    strings1.add("abc");
    strings1.add("def");
    List<String> strings2 = new ArrayList<>(Arrays.asList("abc", "def"));

    // 2. Arrays.asList
    // Cannot add and remove. Able to modify elements ONLY
    List<String> strings3 = Arrays.asList("ABC", "DEF", "IJK");
    // strings3.add("XYZ"); // java.lang.UnsupportedOperationException
    // strings3.remove("IJK"); // java.lang.UnsupportedOperationException
    strings3.set(0, "OPQ");

    // 3. List.of()
    // Able to read ONLY
    List<String> strings4 = List.of("ABC", "DEF", "IJK");
    // strings4.add("XYZ");
    // strings4.remove("ABC");
    // strings4.set(0, "LLL");
    System.out.println(strings4.get(2)); // "IJK"


  }
}
