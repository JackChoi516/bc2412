public class DemoMethod{

  // ! sum(int x, int y) > input parameters
  // ! int > return type
  public static int sum(int x, int y){
    int result = x + y;
    return result;  // the return value should align the return type
  }
  public static double subtract(double x, double y){
    return x - y;
  }
  // source > "hello"
  // target 'l'
  // return 2
  public static int countCharacter(String source, char target){
    int result = 0;
    for (int i = 0; i < source.length(); i++){
      if (source.charAt(i) == target){result++;}
    }
    return result;
  }
  // toCharArray

  public static void main(String[] args) {
      
    int x = 3;
    int a = 10;
    int b = 11;
    int y = a + b;
    System.out.println(y); // 21
    a = 19;
    b = 21;
    y = a+ b;

    // call sum() method
    y = sum(10, 11);
    System.out.println(y); // 21
    y = sum(19, 21);
    System.out.println(y); // 40

    double z;
    z = subtract(10, 6);
    System.out.println(z); //4.0

    System.out.println(subtract(100, 98)); // 100.0 - 98.0 = 2.0

    
    System.out.println(countCharacter("hellllllo", 'l')); // 6
    System.out.println(countCharacter("abcd", 'l')); // 0
    System.out.println(countCharacter("", 'l')); // 0
    System.out.println(countCharacter("abcd", 'a')); // 1


    String str = "hello";
    System.out.println(str.charAt(1));
    

    String jewels = "aab";
    String stones = "aerty";
    int result = 0;
        for (int i = 0; i < stones.length(); i++){
            for (int j = 0; j < jewels.length(); j++){
                if (jewels.charAt(j) == stones.charAt(i)){
                    result++;
                }
              }
            }System.out.println(result);


  }
}
