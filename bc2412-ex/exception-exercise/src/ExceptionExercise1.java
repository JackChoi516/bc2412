import java.util.Scanner;

public class ExceptionExercise1 {
  // Question: Write a program that divides two numbers provided by the user. Handle the
  // ArithmeticException when dividing by zero and display an appropriate message.

  // 1. If exception is caught, print "Error: Cannot divide by zero.", otherwise print "Result: X"
  // 2. No matter if the exception is caught, finally print ""Division operation completed.""
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter numerator: ");
    int numerator = scanner.nextInt();
    System.out.print("Enter denominator: ");
    int denominator = scanner.nextInt();
    scanner.close();

    // code here ...
    try {
      divideCal(numerator, denominator);
    }catch (ArithmeticException e){
      System.out.println("Error: Cannot divided by zero.");
    }
    
  }

  public static void divideCal(int num, int denominator){
    if (denominator == 0){
      System.out.println("Division operation complete.");
      throw new ArithmeticException();
    }
    System.out.println("Division operation complete.");
    System.out.println("Result: " + (num / denominator));

  }
}
