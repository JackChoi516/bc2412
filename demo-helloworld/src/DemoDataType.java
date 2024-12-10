public class DemoDataType {
  public static void main(String[]args){
    //Comment. Welcome to bootcamp!
    //!1. Data Type (8 Primitive)
    //int, integer
    int x=3;
    int dayOfweek=7;
    //int y=3.2; //!not ok, y can only store integer
    double y2=3.2;
    //variable Java naming convension
    //caml case: dayOfweek, y2

    //!x can not be declared twice
    //Variable Declareation
    //int x100;
    //Value Assignment
   // x100 = 9;


    //Re-assignment
    x=101; //re-assign 101 to x
    x=x+10; //right:101+10, left:assign 111 to x
    x=x-40; //111-40=71
    x=x*3; //71*3=213
    x = x / 213 ;

    //print out 
    System.out.println(x); //1
 
    x = x + 8 * 2 / 4 + 1;
    System.out.println(x); //6

    //divided by 0
    //int f = 10 / 0 ; // !error
    //System.out.println(f);//

    // 0 / 10
    //System.out.println(0 / 10); //0


    //divide
    int x2 = 3 / 2;
    //Step 1: 3 > int value, 2 > int value
    //Step 2: int value / int value > int value
    //Step 3: 3 / 2 > 1
    //Step 4: assign 1 (int value) to int type variable (ok!)
    System.out.println(x2);//1

    double x3 = 3 / 2;
    //Step 1: 3 >int value, 2 > int value 
    //Step 2: int value / int value > int value
    //Step 3: 3 / 2 > 1
    //Step 4: assign 1 (int value) to double type variable (convert 1 to 1.0)
    System.out.println(x3);//1.0

    double x4 = 3.0 / 2;
    //Step 1: 3.0 > double value, 2 > int value 
    //Step 2: double value / int value > double value 
    //Step 3: 3.0 / 2.0 > 1.5
    //Step 4: assign 1.5 (double value) to double type variable
    System.out.println(x4);//1.5

    //int x5 = 3.0 / 2;
    //Step 1: 3.0 > double value, 2 > int value 
    //Step 2: double value / int value > double value 
    //Step 3: 3.0 / 2.0 > 1.5
    //Step 4: assign 1.5 (double value) to int type variable (downcasting)
    //!not allow assign a higher lvl value to a lower lvl type of variable

    //int > double (upcast)
    //double > int (downcast)

    //! store snteger. Java: int, byte, short, long
    int value = 100000;
    int value2 = 1_000_000;
    //int maxInteger = 2_147_483_648;
    //int minInteger = -2_147_483_649;


    //!byte -128 to 127
    //-128 > int tvalue
    //assign an int value to byte type variable
    byte b1 = -128;
    byte b2 = 127;

    //!Short -32786 tot 32767
    short s1 = -32768;
    short s2 = 32767;

    //!long
    //2_147_483_648 > int value
    //int value > double type variable
    //!Declare a hardcode long value, you should always add "L"

    long l1 = 2147483648L; //L > declare it is a long value
    //!Step 1:declare an int value (not ok)
    //!Step 2: convert an int value to long value

    //float > double
    double d1 = 10.2; //10.2 > double value
    double d2 = 10.2d; //10.2 > double value
    float f1 = 10.2f;// 10.2f > float value

    float f2 = 10.2222222222222222222222222222222222222222f;

    //convertion
    float f4 = 10.2f;
    double d3 = f4; //safe. assign float value to double variable
    
    double d4 = 10.2f; //upcasting (float > double)

    double d5 = f4 + 10.2d;
    //float + double > double
    System.out.println(d5);//20.399999809265136

    double d6 = 0.2 + 0.1;
    System.out.println(d6);//0.30000000000000004

    double d7 = 0.2 + 0.2;
    System.out.println(d7);//0.4

    // - * / on double, do not

    //char
    char c = 'x';
    char c2 = '1';
    char c3 = '!';
    char c4 = ' ';
    //char c5 = ''; //! at least one character

    //boolean
    boolean b = true;
    boolean b10 = false;
    boolean isSmoker = false;
    int age = 66;
    boolean isElderly = age > 65; //"age > 65" > asking if age >65
    System.out.println(isElderly);//true

    int age2 = 18;
    boolean isAdult = age2 >= 18;
    System.out.println(isAdult);//true


    


    }
}
