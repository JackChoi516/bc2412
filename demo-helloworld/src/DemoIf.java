public class DemoIf {
  public static void main(String[]args){

    // if > check event > event result
    int x = 3;
    if (x > 2){//"x>2" is an event > true/false
      System.out.println("x is > 2.");
    }

    String s = "hello";
    // Check if length > 3
    if (s.length()>3){
      System.out.println("length > 3.");
    }

    // equals(), charAt()
   if ("hello". equals(s)){
    System.out.println("s is equals to hello");
   }
   if (s. charAt(1) == 'e'){
    System.out.println("the 2nd character is e");
   }
  
   //if ("l". equals(s. charAt(3))){
    //System.out.println("the 4th character is l");
  //}


    if (x > 5){
      System.out.println("x > 5");
    }else {// x <= 5
      System.out.println("x <= 5.");  
    }

    int y = 10;
    // Check if y is an even number
    if (y % 2 ==0){
      System.out.println("it is a even number");
    }// else {System.out.println""}
    //
    if (y % 2 != 0){
      System.out.println("it is an odd number");
    }
    // Check if y > 3 and y is an even number
    if (y > 3 && y % 2 == 0){
      System.out.println("y > 3 and is an even number");
    }

    char k = 'k';
    if (k == k){
      System.out.println("it is k.");
    }

    int age = 17;
    boolean isAdult = age >= 18;
    if (isAdult == false){

    }
    if (!isAdult){
      System.out.println("is not an adult");
    }

    int score = 79;
    char gender = 'M';
    // score >= 90, grade A
    //!score between 85 and 89 for female, grade T
    //!score between 87 and 89 for male, grade T
    //!score between 80 and 84 for female, grade B
    //!score between 80 and 86 for male, grade B
    // score between 70 and 79, grade C
    //under 70, grade F
    char grade = ' ';
    if (score >= 90){
      grade = 'A';
    }else if (score >= 87 && score <= 89 && gender == 'M' 
    || score >=85 && score <= 89 && gender == 'F'){
      grade = 'T';
    }else if (score >=80 && score <= 86 && gender == 'M'){
      grade = 'B';
    }else if (score >=80 && score <= 84 && gender == 'F'){
      grade = 'B';
    }else if (score >=70){
      grade = 'C';
    }else if (score <70){
      grade = 'F';
    }
    System.out.println("the grade is " + grade);//

    // Test cases
    // 1. M 90 >A
    // 2. F 90 >A
    // 3. M 89 >T
    // 4. F 89 >T
    // 5. M 86 >B
    // 6. F 86 >T
    // 7. M 79 >C
    // 8. F 79 >C
    // 9. M 69 >F
    // 10.F 69 >F
    // if (gender == 'F'){
    //if (score >= 90)
    //}

     


  }
  
}
