import java.util.ArrayList;

public class ArrayList1<T> {
  private T[] values;

  public ArrayList1(){
    this.values = (T[]) new Object[0];
  }

  public void clear(){
    this.values = (T[]) new Object[0];
  }

  public void add(T value){
    // for (int i = 0; i < this.values.length; i++){
    //   if (this.values[i].equals(value))
    //     return false;
    // }
    
    T[] newValues = (T[]) new Object[values.length +1];
    for (int i = 0; i < this.values.length; i++){
      newValues[i] = this.values[i];
    }
    newValues[newValues.length - 1] = value;
    this.values = newValues;
    // return true;
  }

  public int size(){
    return this.values.length;
  }

  // public static void main(String[] args) {
  //   ArrayList1<Book> books = new ArrayList1<>();
  //   books.add(new Book("ABC"));
  //   books.add(new Book("IJK"));
  //   System.out.println(books.size()); // 2
  // }
  public static void main(String[] args) {
    // Many String = String[]

    // Variable Length
    ArrayList<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size()); // 2
    System.out.println(strings.get(1)); // IJK
    // System.out.println(strings.get(2)); // java.lang.IndexOutOfBoundsException

    // Book[]
    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book("ASD"));
    books.add(new Book("IJK"));
    books.remove(0);
    System.out.println(books.size()); // 1
    books.add(new Book("XYZ"));
    books.remove(new Book("IJK")); // After @Override equals() in Book.class
    // ArrayList.remove(Object obj) > Book.equals()
    // Generics Design ensure the Type must contains equals()
    System.out.println(books.size()); // 1 

    // Requires @Override equals()
    System.out.println(books.contains(new Book("XYZ"))); // true    
    System.out.println(books.indexOf(new Book("XYZ"))); // 0
    books.clear(); // Create a new array with size 0
    System.out.println(books.add(new Book("ABCD"))); // true
  

    System.out.println(books.isEmpty()); // false

    // Search part of the title for book - for loop
    // for-each support ArrayList
    // boolean found = false;
    String bookName = "Not found.";
    for (Book book : books){
      if (book.getName().contains("BC"))
        bookName = book.getName();
        break;
    }
    System.out.println("Book " + bookName + " is available.");




  }
}
