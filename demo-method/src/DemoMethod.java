import javax.sql.rowset.spi.SyncResolver;

public class DemoMethod {

  // ! sum(int x, int y) > input parameters
  // ! int > return type
  // ! "sum(int x, int y)" > method signature
  public static int sum(int x, int y) {
    int result = x + y;
    return result; // the return value should align the return type
  }

  // ! Java doesn't allow "different type" for the same method signature
  // public static long sum(int x, int y){
  // }

  // ! Not Allowed: Same Method Signature
  // "sum(int a, int b)" = sum(int x, int y)
  // Same method name + Same Parameter List
  // public static int sum(int a, int b){return 1}
  public static double sum(int a, double b) {
    return a + b;
  }

  public static double sum(double x, double y) {
    return x - y;
  }

  public static double sum(int a, String b) {
    return a + Integer.valueOf(b); // int + int > int > double
  }

  public static double subtract(double x, double y) {
    return x - y;
  }

  // source > "hello"
  // target 'l'
  // return 2
  public static int countCharacter(String source, char target) {
    int result = 0;
    for (int i = 0; i < source.length(); i++) {
      if (source.charAt(i) == target) {
        result++;
      }
    }
    return result;
  }
  // toCharArray

  public static int totalMinutes(int day){
    int minutes = 0;
    for (int i = 0; i < day; i++){
      for (int j = 0; j < 24; j++){
        minutes +=60;
      }
    }
    return minutes;
  }

  public static int countEven(int[]arr){ // short[]
    int count = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i]%2 == 0){
        count++;
      }
    }return count;
  }

  public static int countEven(long[]arr){ // short[]
    int count = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i]%2 == 0){
        count++;
      }
    }return count;
  }

 
  public static void main(String[] args) {

    int x = 3;
    int a = 10;
    int b = 11;
    int y = a + b;
    System.out.println(y); // 21
    a = 19;
    b = 21;
    y = a + b;

    // call sum() method
    y = sum(10, 11);
    System.out.println(y); // 21
    y = sum(19, 21);
    System.out.println(y); // 40

    double z;
    z = subtract(10, 6);
    System.out.println(z); // 4.0

    System.out.println(subtract(100, 98)); // 100.0 - 98.0 = 2.0

    System.out.println(countCharacter("hellllllo", 'l')); // 6
    System.out.println(countCharacter("abcd", 'l')); // 0
    System.out.println(countCharacter("", 'l')); // 0
    System.out.println(countCharacter("abcd", 'a')); // 1

    // 771
    String jewels = "ab";
    String stones = "aaabberty";
    int result = 0;
    for (int i = 0; i < stones.length(); i++) {
      for (int j = 0; j < jewels.length(); j++) {
        if (jewels.charAt(j) == stones.charAt(i)) {
          result++;
        }
      }
    }
    System.out.println(result);

    System.out.println(countEven(new long[] {1L, 3L, 2L, 6L}));
    sum(1, 2.0); // sum(int x, double y)
    sum(1, 2); // sum(int x, int y)
    sum(2, "123");
    
  }
}
