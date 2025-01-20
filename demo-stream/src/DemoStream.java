import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    // traditional
    int[] arr = new int[]{1, 2 ,3};
    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }

    for (int integer : arr){
        System.out.println(integer);
    }

    // int[], Integer[], ArrayList<Integer>
    // Java 8 (2014): Stream style: List -> Stream -> List
    // before Java 8: for loop (list)
    List<Integer> integers = Arrays.asList(1, 2, 3, 4);
    List<Integer> newIntegers = integers.stream() // Stream<Integer>
    .filter(e -> e % 2 == 0) // "e -> e % 2 == 0" -> Predicate
    .collect(Collectors.toList()); // always return new ArrayList

    System.out.println(integers);
    System.out.println(newIntegers);

    // Declare String array with some elements
    // filter string length > 5 and contain 'a'
    List<String> strings = Arrays.asList("aSDDD", "QWER", "QER", "DaFFFF");
    // for loop + if
    List<String> newStrings = strings.stream().filter(e -> e.length() > 5 && e.indexOf("a") != -1)//
    .collect(Collectors.toList());
    System.out.println(newStrings);

    // Define a book list
    // filter book name conrain "Herry" case incensitive
    List<Book> books = Arrays.asList(new Book("abc Herry"), new Book("Abc herry"), new Book("Abc jerry"));
    List<Book> newBooks = books.stream()//
    // .filter(e -> "Herry".equalsIgnoreCase(e.getName()))//
    .filter(e -> e.getName().toUpperCase().contains("Herry".toUpperCase()))//
    .collect(Collectors.toList());
    System.out.println(newBooks);

    // map(): Change the object type, but the quantity of element won't change
    List<String> bookNames = //
    books.stream() //
    .map(e -> e.getName())//
    .collect(Collectors.toList());
    System.out.println(bookNames);

    // filter + map
    // for loop + if + re-structure
    List<String> newBookNames = books.stream() //
    .filter(e -> e.getName().toUpperCase().contains("Herry".toUpperCase()))//
    .map(e -> e.getName())//
    .collect(Collectors.toList());
    System.out.println(newBookNames);

    // for loop + if + procedures
    books.stream() //
    .filter(e -> e.getName().startsWith("A")) //
    .forEach(e -> { //
        System.out.println(e.getName());
    });

    // Convert 3 book names to 3 books
    List<String> bookNames2 = List.of("abc", "herry", "def");
    List<Book> booklist = bookNames2.stream()//
        .map(e -> new Book(e))//
        .collect(Collectors.toList());
    System.out.println(booklist);

    // stream.sorted() + Comparator
    // Collection.sort() + Comparator
    // Arrays.sort() + Comparator

    // Integer[] vs int[], int vs Integer
    Comparator<Integer> descending = (i1, i2) -> i1 > i2 ? -1 : 1;
    Integer[] arr2 = new Integer[]{2, 4, -1, 1, -3};
    Arrays.sort(arr2, (i1, i2) -> i1 > i2 ? -1 : 1); // Lambda expression of Comparator
    System.out.println(Arrays.toString(arr2));

    // Integer[] -> Stream<Integer>
    List<Integer> sortedIntegers = Arrays.stream(arr2) //
        .sorted((i1, i2) -> i1 > 12 ? -1 : 1) //
        .collect(Collectors.toList());
    System.out.println(sortedIntegers);

    // Fruit
    List<String> fruits = Arrays.asList("orange", "apple", "orange", "lemon");
    Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
    System.out.println(newFruits);

    List<String> newFruits2 = //
        fruits.stream().distinct().collect(Collectors.toList());
    System.out.println(newFruits2);

    // distinct() -> remove duplicates
    // What if List<Book> by distinct()
    List<String> newFruits22 = //
        fruits.stream().distinct().collect(Collectors.toList());
    System.out.println(newFruits22);

    Stream.of("aabc", "def");
    Stream<Book> books2 = Stream.of(new Book("abc"), new Book("def"));

    List<Book> books3 = books2.filter(e -> e.getName().contains("a")).collect(Collectors.toList());

    LocalDate date1 = LocalDate.of(2014, 10, 31);
    String str = String.valueOf(123);

    Stream<String> ss = Stream.empty();
    System.out.println(ss.count()); // 0


    Optional<Book> targetBookBox =Stream.of(new Book("abc"), new Book("def")).filter(e -> "abc".equals(e.getName())).findFirst(); // find the first one


    // Optional (Java 8)
    // 1. targetBook never be null
    // 2. targetBook is an Optional object, so it can Optional method only
    // 3. You have to check the content of Optional Object before using it
    // 4. isPresen() & ifPresent() are the ways to resolve Optional in safe mode.
    // 5. Never to resolve the Optional object by get() only. (unsafe).
    int x = 10;
    if (targetBookBox.isPresent()){ // something like peek
        Book book = targetBookBox.get();
        System.out.println(book.getName()); // abc
        System.out.println(x); // 10
        // x = 100;
    }

    // similar to for-each
    
    targetBookBox.ifPresent(e -> {
        System.out.println(e.getName());
        System.out.println(x); // 10
        // x = 100;
    });

    // stream for-each
    String name = "Oscar";
    Stream.of(100, 120, 300).forEach(e -> {
        System.out.println(e);
        System.out.println(name); // read the name
        // but cannot write the name variable
        // name = "abc";
    });

    String name2 = "ok";
    for (Integer integer : Stream.of(100, 120, 300).collect(Collectors.toList())){
        name2 = "ijk";
    }

    // Some other way to resolve the Optional
    Book targetBook2 = targetBookBox.orElse(new Book("default"));
    Book targetBook3 = targetBookBox.orElseThrow(() -> new RuntimeException("Book is not found."));

    Book targetBook4 = targetBookBox.orElseGet(() -> new Book("default")); // similar to orElse
    
    // of(), ofNullable()
    String name3 = "ABC";
    // Optional<String> os1 = Optional.of(null); null pointer exception
    Optional<String> os1 = Optional.of(name3);
    String name4 = null;
    Optional<String> os2 = Optional.ofNullable(name4);

    Optional<String> os3 = Optional.empty();
    if (os3.isPresent()){
        System.out.println(os3.get());
    } else {
        System.out.println("The String is Null.");
    }

    // 1. Stream intermediate operation won't execute itself, until terminal operation
    // 2. Once the terminal operation executed, the stream object can no longer be used again
    Stream<Integer> integersLargerThan10 = Stream.of(10, 100, -1).filter(e -> e > 10);
    System.out.println(integersLargerThan10.count()); // 1

    // integersLargerThan10.collect(Collectors.toList());
    // IllegalStateException: stream has already been operated upon or closed

    // Intermediate operation: filter, map, distinct
    // Terminal operation: collect, count, sorted

    Stream<Integer> plusOne = Stream.of(1, 2, 3).map(e -> {
        System.out.println(e);
        return e + 1;
    });
    //List<Integer> plusOneList = plusOne.collect(Collectors.toList()); // 2 3 4

    long count = plusOne.count(); // 3
    // Because Java thinks map() doesn't change the resukt of count()
    // so it won't execute map(), when the terminal operation is count().
    System.out.println(count);


  }

  // Convert from a List of Object A (more fields) to List of Object B (less fields)
  public static List<Book> getBookListForSearch(List<Book2> books){
    return books.stream() //
    .map(e -> new Book(e.getName())) //
    .collect(Collectors.toList());
  }

  public static class Book2{
    private String name;
    private double price;
    public Book2(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    @Override
    public String toString(){
        return "name: " + this.name + " price: " + this.price;
    }
  }

  public static class Book{
    private String name;
    public Book(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "name: " + this.name;
    }
  }
}
