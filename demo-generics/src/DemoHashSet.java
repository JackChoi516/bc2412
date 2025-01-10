import java.util.ArrayList;
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

    strings.remove(new String("XYZ"));
    System.out.println(strings.size()); // 2

    // HashSet cannot be ordering naturally.
    // because its underlying data structure is not an array.
    // so, HashSet did not provide remove by index method
    // int targetRemoveIndex = 1;
    // String targetRemoveString = null;
    // int index = 0;
    // for (String s : strings){
    //   if (targetRemoveIndex == index){
    //     targetRemoveString = s;
    //     break;
    //   }
    //   index++;
    // }
    // strings.remove(targetRemoveString);


    ///////////
    ArrayList<String> some = new ArrayList<>();
    some.add("ABC");
    some.add("ABC");
    System.out.println(some.size()); // 2

    ArrayList<Book> someBooks = new ArrayList<>();
    someBooks.add(new Book("ASD"));
    someBooks.add(new Book("ASD"));
    System.out.println(someBooks.size()); // 2

    HashSet<Book> someBooks2 = new HashSet<>();
    someBooks2.add(new Book("ASD"));
    someBooks2.add(new Book("ASD")); // false, cuz @override equals() in Book.class
    System.out.println(someBooks2.size()); // 1
  }
}
