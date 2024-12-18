import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println(i); // 0, 1, 2
    }

    // ! While loop vs For loop

    int j = 0; // ! 1. Declare the counter outside the loop
    while (j < 3) { // continue criteria
      System.out.println(j); // 0
      j++; // ! 2. flexible to control the j
      j++;
      j++;
    }

    String s = "hello";
    char target = 'e';
    int count = 0;
    boolean found = false;
    int i2 = 0;
    while (i2 < s.length()) {
      if (target == s.charAt(i2)) {
        found = true;
      }
      i2++;
    }
    System.out.println(found);

    int i = 0;
    while (i < s.length()) {
      if (target == s.charAt(i)) {
        count++;
      }
      i++;
    }
    System.out.println(count);

    // Random
    // int number = new Random().nextInt(3); // 0-2
    // System.out.println(number);

    // 1-49
    int markSix = new Random().nextInt(49) + 1; // (0 - 48) + 1
    System.out.println(markSix);

    int[] marksixArr = new int[6];
    int count2 = 0;
    int value = 0;
    while (count2 < 6) {
      value = new Random().nextInt(49) + 1;
      if (!isDuplicated(marksixArr, value)) {
        marksixArr[count2] = value;
        count2++;
      }
    }
    System.out.println(Arrays.toString(marksixArr)); // [8, 36, 30, 12, 10, 31]

    // 1 - 100
    // bomb: 47
    // ! Game Starts:
    // Pick a number between 1 - 100
    // User: 4,
    // Please pick a number between 5 - 100
    // User: 67,
    // Please pick a number between 5 - 66
    // user: 47
    // Bomb!
    // while, scanner

    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100) + 1;
    int input = -1;
    Scanner scanner = new Scanner(System.in);
    while (bomb != input) {
      System.out.println("Please input a number between " + min + "-" + max);
      input = scanner.nextInt();
      if (input < min || input > max)
        continue;
      if (input < bomb) {
        min = input + 1;
      } else {
        max = input - 1;
      }      
    }System.out.println("bomb!");
    scanner.close();

  }

  // check if duplicated exists
  public static boolean isDuplicated(int[] arr, int newValue) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == newValue)
        return true;
    }
    return false;
  }
}
