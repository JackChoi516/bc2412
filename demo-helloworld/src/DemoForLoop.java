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
    int oddSum = 0;
    for (int i = 0; i <= 10; i++){
      if (i%2 == 1){
        oddSum += i; 
      }
    }
    System.out.println("oddSum is " + oddSum);//25

  }
  
}
