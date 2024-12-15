public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    for (int i = 0; i < 15; i++){
      if (first < second){System.out.print(first + " "); first += second;}
      else if ( second <= first){System.out.print(second + " "); second += first;}
    }

  }
}