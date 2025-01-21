import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTypeInference {
  // private var x; // 3. var Cannot be defined as attribute type.
  public static void main(String[] args) {
    // Java 10
    // Once you assign the value to var variable, the variable type will be defined as usal.
    // var can be defined as local variable
    var x = 3; // x is a int variable
    
    // x = 3.3;

    var y = 3.3; // y is a double type
    y = 3; // upcast
    System.out.println(y); // 3.0

    List<List<String>> stringLists = new ArrayList<>();
    stringLists.add(Arrays.asList("abc", "def"));
    stringLists.add(Arrays.asList("vincent", "lucas"));

    // List<List<String>
    // [["abc", "def"], ["vincent", "lucas"]]
    for (List<String> List : stringLists){
      for (String str : List){
        System.out.println(str);
      }
    }

    // Same as above
    // var can be defined as reference type for a certain DS
    for (var List : stringLists){
      for (var str : stringLists){
        System.out.println(str);
      }
    }

    // u has to be initialized at declaration
    // var u = null;
    // u = 3;

    var arr = new int[]{1, 2, 3}; // normally, var supports array

    //var arr2 = {1, 2, 3}; // NOT OK, {1, 2, 3} can be a double array
    int[] arr2 = {1, 2, 3};

    // Stream flatmap
    // List<List<String>>
    List<String> result = stringLists.stream() //
      .flatMap(e -> e.stream()) //
      .collect(Collectors.toList());

    System.out.println(result);

    //List<Customer> customers = Arrays.asList(new Customer("vincent", "vlau"), new Customer("lucas", "ll"));
    // map()
    // List<String> userNames = customers.stream().map(e -> e.getUserName()).collect(Collectors.toList());
    // System.out.println(userNames); // [vlau, ll]

    // Find all nickNames of my Customers
    List<String> nickNames1 = Arrays.asList("vlau", "lauv");
    List<String> nickNames2 = Arrays.asList("lll", "llcas"); 

    List<Customer> customers2 = //
    Arrays.asList(new Customer("vincent", "vlau", nickNames1), //
        new Customer("lucas", "ll", nickNames2), //
        new Customer("steven", "swong", Arrays.asList("sdfff", "DSFDFFffff")));

    List<String> nickNames = //
      customers2.stream() //
        .filter(e -> e.getName().length() > 5) //
        .flatMap(e -> e.getNickNames().stream()) //
        .filter(e -> e.length() > 3) //
        .collect(Collectors.toList());
    System.out.println(nickNames);

  }

  // 1. Java doesn't allow defining var as variable type.
  // because Java is String Type (type has to be determined during compile time)
  // public static int sum(var x, var y){
  //   return x + y;
  // }

  // 2. return type cannot be defined as var type
  // because the caller does't know the return sum2() method during compile time.
  // public static var sum2(int x, int y){
  //   String a = "a";
  //   if (a.equals("a"))
  //     return (long) x + (long) y;
  //   else
  //     return x + y;
  // }

  public static class Customer{
    private String name;
    private String userName;
    private List<String> nickNames;

    public Customer(String name, String userName, List<String> nickNames){
      this.name = name;
      this.userName = userName;
      this.nickNames = nickNames;
    }

    public String getName(){
      return this.name;
    }

    public String getUserName(){
      return this.userName;
    }

    public List<String> getNickNames(){
      return this.nickNames;
    }

  }
}
