public class Exercise20241210 {
  public static void main(String[]args){
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;
    double totalAmount = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;


    System.out.println(totalAmount);



    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;
    double averageScore = (mathScore + englishScore + historyScore) / 3.0;
    System.out.println(averageScore);

    //byte > short > int > long 

    byte b1 = 127;
    byte b2 = -128;
    byte maxByte = 127;
    //int value > byte
    maxByte = (byte)(maxByte + 1); //Java: is it safe? Not safe
    System.out.println(maxByte);//overflow
    //Step 1: byte value + int value > int value
    //can we assign int value to byte variable?(downcasting)

    int x = maxByte; // Java: is it safe? it is safe
    
    //!Java: (1)Compile time + (2)Run Time
    // (1)Java file (.java) > class file　(.class): java code > byte code (~machine)
     // (1.1) compile fail. for example (missing ; > syntax error)
     // (1.2) compile success > class file
    //(2) Java Virtual Machine (JVM) > convert class file to machiine code > execute machine code
    //short s1 = 

  }
}