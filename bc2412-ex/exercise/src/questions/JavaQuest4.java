public class JavaQuest4{
  /**
* Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
* and divisible by 2 (Search it from 1)
* 
* Expected Output: 6 12 18 24 30 36 42 48 54 60
*/
public static void main(String[] args) {
 // Print first ten numbers, which fulfill the followings criteria:
 // 1. Even numbers
 // 2. Divisible by 3
 // 3. > 0
  int row = 10;
 
  for (int j = 1; j < 100; j++) {
   if (j%2 == 0 && j%3 == 0 && j > 0){row -=1 ;if (row >= 0){System.out.print(j + " ");}}}





}
}

  
