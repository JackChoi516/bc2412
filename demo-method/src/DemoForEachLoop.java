public class DemoForEachLoop {

  public static void main(String[] args) {
    // for loop, while loop, for-each loop
    int[] arr = new int[] {3, 4, 5};

    // just get one value for each iteration
    for (int i = 0; i < arr.length; i++){ 
      System.out.println(arr[i]);
    }

    // 3 + 4
    // 4 + 5
    for (int i = 0; i < arr.length - 1; i++){ 
      System.out.println(arr[i] + arr[i + 1]);
    }

    int temp = -1;
    for (int i = 0; i < arr.length / 2; i++){
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }

    // for each
    for (int integer: arr){  // just get one value for each iteration
      // 10000 lines
      System.out.println(integer);
    }

    char[] arr2 = new char[]{'p', 't', 'e'};
    String str = "";
    // for-each loop > "pte"
    for (char c: arr2){
      str += c;
    }
    System.out.println(str);

    String[] arr3 = new String[]{"abc", "ijk", "def"};
    String target = "ijk";
    // true
    boolean found = false;
    for (String str2: arr3){
      if (str2 == target){
        found = true;
      }
    }
    System.out.println(found);

    
  }
}