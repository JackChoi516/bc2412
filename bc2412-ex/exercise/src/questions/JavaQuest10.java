import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] myArray = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    

    //System.out.println("Original Array : " + Arrays.toString(myArray));

    // code here ...
    int[] newArray = new int[myArray.length];
    while (myArray != newArray){
      System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    if (indexPosition >= myArray.length - 1){
      System.out.println("Original Array : " + Arrays.toString(myArray)); break;
    }else if (indexPosition >= 0){

      for (int i = myArray.length - 1; i > indexPosition; i--){
        
        if (i >= indexPosition){
          myArray[i] = myArray[i - 1];
        }
      }
      myArray[indexPosition] = newValue;
    }
    newArray = myArray; 
    System.out.println("New Array: " + Arrays.toString(newArray));
    }

    //myArray = newArr;
    
  }
}