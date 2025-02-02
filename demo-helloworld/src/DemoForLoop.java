public class DemoForLoop {
  public static void main(String[]args){

    // 2^100
    int x = 2;
    x = x * 2;
    x *= 2;
    System.out.println(x);

    //For Loop
    // ! for ( ; ; ){
    //}
    
    // "i < 3" > continue criteria
    // "i++" > modifier
    // ! You have to let the modifier work with "continue criteria", 
    //so that continue criteria at the end become false
    for(int i = 0; i < 3; i++){ //3-0,  0, 1, 2, > "<3" so 3 times !start from 0
      System.out.println("hello");
    }    
    // Step 1: int i = 0
    // Step 2: i < 3 (question)
    // Step 3: if true, enter into code block
    // Step 4: i++, i become 1 
    // Step 5: i < 3 (question) >true
    // Step 6: if true, print hello
    // Step 7: i++, i become 2
    // Step 8: i < 3 (question) >true
    // Step 9: if true, print hello
    // Step 10: i++, i become 3 
    // Step 11: i <3 (question) >false
    // Step 12: exit for loop

    for (int i = 0; i < 5; i++){
      System.out.println(i);
    }

    // print even number
    for (int i = 0; i <10; i++){
      if (i%2 == 0 && i > 0){ //even number definition
        System.out.println(i);
      }
    }

    // print 0 - 100, can be divided by 3 and 4
    for (int i = 0; i <=100; i++){
      if (i % 3 == 0 && i % 4 == 0){
        System.out.println(i);
      }
    }

    // sum up 0 - 20: 0 + 1 + 2.. + 20
    int sum = 0;
    for (int i = 0; i <= 20; i++){
        sum = sum + i; // this will run 21 times
    }
    System.out.println(sum);//210
    //System.out.println(i); //! i is declared within the "for loop"

    //sum up all odd numbers between 0 - 10
    //sum up all even numbers between 0 - 10
    //! Find the difference between evenSum and oddSum > positive number
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i <= 10; i++){
      if (i%2 == 1){
        oddSum += i; 
      }else { evenSum += i;
      }
    }    
   
    if (evenSum > oddSum){
      System.out.println(evenSum - oddSum);
    }else {System.out.println(oddSum - evenSum);      
    }//5

    int diff = -1;
    if (oddSum > evenSum){
      diff = oddSum - evenSum;
    }else {diff = evenSum - oddSum;}
    System.out.println(diff);//5

    int diff2 = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
    System.out.println(diff2);//5






    // Searching
    String str = "abcdefijk";
    boolean found = false;
    for (int i = 0; i < str.length(); i++){
      if(str.charAt(i) == 'd'){
        found = true;
        break; // break the nearest loop
      }
    }System.out.println(found);

    // Test case:
    // 1. "abcdefijk"
    // 2. "abcefijk"
    // 3. ""
    // 4. "abcdedijkd"

    // 2. check if the string value contains given sub-string
    String str2 = "hello";
    String substr = "ll";
    //hel vs loq
    //ell vs loq
    //llo vs loq
    // for loop + substring
    boolean isSubstringExist = false;
    for (int i = 0; i < str2.length() - substr.length()+1; i++){
      if (str2. substring(i, i+substr. length()).equals (substr)){
      isSubstringExist = true;
      break;
    }
  }

    System.out.println(isSubstringExist);//true


    // 1. Check if "d" exists in the String.
    // for loop + if + charAt
    //System.out.println(isCharExist);

    // Counting
    String s = "helllloo";
    String substr2 = "l";
    int numOfL = 0;
    
    // Count the number of 'l'
    // for = if

    for (int i = 0; i < s.length(); i++){
      if (s. substring(i, i+1).equals(substr2)){
        numOfL = numOfL + 1;
      }
    }System.out.println(numOfL);
//
    int count = 0;
      for( int i = 0; i < s.length(); i++){// loop all values + filtering
      if (s.charAt(i) == 'l') {
        count++;
      }
    }System.out.println(count);

    // continue - skip the rest, go to next iteration
    count = 0;
    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) != 'l'){
        continue;// skip count++ go to i++
      }count++;
    }System.out.println(count);

    String s2 = "goodbye";
    int count2 = 0;
    for (int i = 0; i < s2.length(); i++){
      if (s2. charAt(i) != 'o'){
        continue;
      }count2 +=1;
    }System.out.println(count2);

    // 1 - 100, print all number, which can be divided by 3 and 4
    //
    for (int i = 0; i <= 100; i++){
      if ( i%3 != 0 ){ continue;}
      else if (i%4 != 0){continue;}
      System.out.println(i);
      }

    for (int i = 0; i <= 100; i++){
      if (i%3 == 0 && i%4 != 0 // event 1 
      || i%4 == 0 && i%3 != 0 // event 2
      || i%3 != 0 && i%4 != 0 // event 3
      ){
        continue;
      }
      System.out.println(i);
    }

    // Nested loop
    for (int i = 0; i < 3; i++){ // outer loop
      // i = 1
      for (int j = 0; j < 4; j++){ // inner loop
        System.out.println("*"); // print and next line
      } // go to i++
    }
    // !Step 1: i = 0, j = 0, print *
    // Step 2: i = 0, j = 1, print *
    // Step 3: i = 0, j = 2, print *
    // Step 4: i = 0, j = 3, print *
    // !Step 5: i = 1, j = 0, print *
    // Step 6: i = 1, j = 1, print *
    // Step 7: i = 1, j = 2, print *
    // Step 8: i = 1, j = 3, print *
    // !Step 9: i = 2, j = 0, print *
    // Step 10: i = 2, j = 1, print *
    // Step 11: i = 2, j = 2, print *
    // Step 12: i = 2, j = 3, print *

    // * 
    // **
    // ***
    // ****
    for (int i = 0; i < 4; i++){
      for (int j = 0; j < i + 1; j++){
        System.out.print(".");}
        System.out.println();
        }
    
    
    int row = 5;
    for (int i = 0; i < row; i++){
      for (int j = row; j > i; j--){
        System.out.print("*");
      }System.out.println();
    }

    //    *
    //   ***
    //  *****
    // *******
    



  }     

}

    


  
  

