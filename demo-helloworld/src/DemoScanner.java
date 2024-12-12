import java.util.Scanner;

//JDK vs Java Project (load built-in tools, String, Primitives)
// Proactively import non-built-in tools (Scanner)
public class DemoScanner {
  public static void main(String[] args) {
    String s = "abc";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int num = scanner.nextInt();// scanner.next
    // num = num * 2;
    // System.out.println("num=" + num);//String + int >String

    // scanner.nextLine();

    // System.out.println("Please input a String.");
    // String str = scanner.nextLine();
    // System.out.println("str = " + str);

    // for (int i = 0; i < num; i++){
    //   System.out.println("hello");
    // }

    // num > numbers of days
    // for loop
    // System.out.println(total hours);
    int totalMinutes = 0;
    for (int i = 0; i < num; i++){
      totalMinutes += 24;

    }
    System.out.println("totalMinutes is " + totalMinutes);






  }
}
