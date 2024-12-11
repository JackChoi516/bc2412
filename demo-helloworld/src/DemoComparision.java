public class DemoComparision {
  public static void main(String[]args){

    // >, <, >=, <=, !=, == (true or false)
    //"==" check if they are equals
    //"=" assignment

    int age = 20;
    boolean isAdult = age >= 18;
    System.out.println(isAdult);//true

    double pi = 3.14159;
    boolean isCorrect = (pi == 3.14159);
    System.out.println(isCorrect);//true

    char gender = 'F';//case, question
    boolean isMale = gender =='M';//definition
    System.out.println(isMale);//false//anwser

    float price = 10.2f;
    System.out.println(price != 10.2f);//false
    System.out.println(price != 10.2);//true,during comparision, convert price to double before comparision

    // ! < operation (Not)
    boolean resultAdult = !isAdult;
    System.out.println(resultAdult);//false

    if (age >= 18){
      // do something...
    }

    if (!(age >= 18)) {
    // do something...
    }

    // && And
    int age2 = 30;
    char gender2 = 'F';
    boolean result2 = age2 >= 30 && gender2 == 'M';
    // event 1: age2 >= 30 > true
    // event 2: gender2 == 'M' > false
    System.out.println(result2);// false
    
    // || OR (true || false)
    boolean result3 = age2 >= 30 || gender2 == 'M';
    // event 1: age2 >= 30 > true
    // event 2: gender2 == 'M' > false
    System.out.println(result3);//true

    // || OR (false || false)
    boolean result4 = age2 < 30 || gender2 != 'F';
    System.out.println(result4);//false

    // AND OR (true AND (false OR true))
    boolean result5 = age2 >= 30 && (gender2 == 'M' || age2 >18);
    System.out.println(result5);//
    // Step 1: (gender2 == 'M' || aage2 >18) > false || true > true
    // Step 2: age2 >=30 > true, true && true > true

    //! The ordering of envent checking is different
    // AND go first
    boolean result6 = age2 >=18 || age2 >= 30 && gender2 == 'M';
    System.out.println(result6);//true
    // Step 1: age2 >= 30 && gender2 == 'M' > true && false > false
    // Step 2: true || false > true

    
    int apple = 10;
    char size = 's';
    boolean result6a = apple > 10 || size == 's';
    System.out.println(result6a); //true
    boolean result6b = apple <= 10 && size != 's';
    System.out.println(result6b);//false
    boolean result6c = size != 'M' && apple == 10;
    System.out.println(result6c);//true
    boolean result6d = size != 'M' || apple >=10 && apple ==10;
    System.out.println(result6d);//true
    
  }
  
}
