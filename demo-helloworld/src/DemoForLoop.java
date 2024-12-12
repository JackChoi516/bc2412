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
    for(int i = 0; i < 3; i++){
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

    

  }
  
}
