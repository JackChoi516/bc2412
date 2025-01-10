import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHashMAp {

  public static class Book{
    private int id;
    private String name;

    public Book(int id, String name){
      this.id = id;
      this.name = name;
    }

    public int getId(){
      return this.id;
    }

    public String getName(){
      return this.name;
    }

    @Override
    public boolean equals(Object obj){
      if (this == obj){
        return true;
      }
      if (!(obj instanceof Book)){
        return false;
      }
      Book book = (Book) obj;
      return Objects.equals(book.getId(), this.id) && Objects.equals(book.getName(), this.name);
    }

    @Override
    public int hashCode(){
      return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString(){
      return "Book[id: " + this.id + ", name: " + this.name + "]"; 
    }
  }

  public static void main(String[] args) {
    // key and value
    HashMap<String, Integer> fruitMap = new HashMap<>();
    // Put an entry to Map
    fruitMap.put("Apple", 1);
    fruitMap.put("Apple", 3);
    // If the key is same, the entry will be replaced.
    System.out.println(fruitMap); // {Apple=3}
    System.out.println(fruitMap.size()); // 1, entry

    fruitMap.put("APPLE", 3);
    System.out.println(fruitMap); // {Apple=3, APPLE=3}
    System.out.println(fruitMap.size()); // 2

    // According to String.class equals(), "Apple" and "APPLE" are not equals

    for (Map.Entry<String, Integer> entry : fruitMap.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    for (String key : fruitMap.keySet()){
      System.out.println(key);
    }

    for (Integer value : fruitMap.values()){
      System.out.println(value);
    }

    // get value by key
    System.out.println(fruitMap.get("APPLE")); // 3
    System.out.println(fruitMap.get("Apple")); // 3

    // contains()
    System.out.println(fruitMap.containsKey("APPLE")); // true

    // Find the entry of "Apple", and then + 1 to the integer.
    String target = "Apple";
    
      if (fruitMap.containsKey(target)){
        fruitMap.put(target, fruitMap.get(target) + 1);
      }

      Integer value = fruitMap.get(target);
      if (value != null){
        fruitMap.put(target, value + 1);
      }
    System.out.println(fruitMap);

    // Can we put null value to the entry?
    fruitMap.put("ABC", null);
    System.out.println(fruitMap); // {Apple=5, ABC=null, APPLE=3}

    // Can we put null value to the entry?
    fruitMap.put(null, 999);
    fruitMap.put(null, 1000);
    System.out.println(fruitMap.size()); // 4
    System.out.println(fruitMap); // {null=1000, Apple=5, ABC=null, APPLE=3}

    System.out.println(fruitMap.containsValue(1000)); // true

    System.out.println(fruitMap.isEmpty()); // false
    System.out.println(fruitMap.getOrDefault("Orange", 0)); // 0
    System.out.println(fruitMap.getOrDefault("Apple", 0)); // 5
    Integer removedEntryValue = fruitMap.remove("APPLE");
    System.out.println(removedEntryValue); // 3
    System.out.println(fruitMap); // {null=1000, Apple=5, ABC=null}

    fruitMap.put("Cherry", fruitMap.getOrDefault("Cherry", 0) + 1);

    fruitMap.clear();
    System.out.println(fruitMap.size()); // 0
    System.out.println(fruitMap.isEmpty()); // true

    //
    Book b1 = new Book(1, "ABC");
    Book b2 = new Book(2, "IJK");
    Book b3 = new Book(3, "DEF");

    HashMap<Book, Integer> bookMap = new HashMap<>();
    // Create books and put some book in map.
    // 1 ABC
    // 2 IJK
    // 3 DEF
    // print Map size
    bookMap.put(b1, b1.getId());
    bookMap.put(b2, b2.getId());
    bookMap.put(b3, b3.getId());
    // Store the book count
    HashMap<Book, Integer> bookMap2 = new HashMap<>();
    Book b4 = new Book(3, "DEF");
    // put some books in map
    // 1 ABC
    // 2 IJK
    // 3 DEF
    // 3 DEF
    bookMap2.put(b1, bookMap2.getOrDefault(b1, 0) + 1);
    bookMap2.put(b2, bookMap2.getOrDefault(b2, 0) + 1);
    bookMap2.put(b3, bookMap2.getOrDefault(b3, 0) + 1);
    bookMap2.put(b3, bookMap2.getOrDefault(b3, 0) + 1);
    bookMap2.put(b4, bookMap2.getOrDefault(b4, 0) + 1);
    System.out.println("size " + bookMap2.size()); // 3
    System.out.println(bookMap2);

  }
}
