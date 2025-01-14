import java.util.Scanner;

public class ExceptionExercise3 {
  // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
  // enters an age less than 18.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. Pass the age number into a static method checkAge(). 
  // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print "Age X is accepted".
  // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please input again later."

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter age: ");
    String age = scanner.nextLine();
    // code here for the caller...

    try {
      checkAge(age);
    } catch (InvalidAgeException e) {
      System.out.println("Age is invalid. Please input again later.");
    }

  }

  // code here for the method
  public static boolean checkAge(String age){
    try {
      int x = Integer.parseInt(age);
    } catch (NumberFormatException e){
      throw new InvalidAgeException();
    }
    int x = Integer.parseInt(age);
    if (x > 18){
      System.out.println("Age " + x + " is accepted.");
    }else {
      throw new InvalidAgeException();
    }
    return false;

    
    
  }
}
