public class DemoString {
  public static void main(String[]args){

    char x = 'a';
    x = 1;//!??
    //x = 1.1;
    //x = true;
    x = 'x';
    //char x = 'o';

    // ! define a String value by double quote ""
    // ! define a char value by single quote ''
    String password = "abcd1234";
    String emailAddress = "abc@gmail.com";

    // + operation
    password = password + "!";
    System.out.println(password);//abcde!

    // Jva Method (Instance method)
    // action/ tools
    char result = password. charAt(0);// 0 represent the first position of the string value
    System.out.println(result);//a

    // ! index start from 0 to length -1
    System.out.println(password. charAt(8));// !
    //System.out.println(password. charAt(-1));// error
    //System.out.println(password. charAt(9));//error

    // Problem: print the last character of String
    String password2 = "helloword";
    char lastChar = password2. charAt (password2.length()-1);
    System.out.println(lastChar);//d

    // equals()
    String s1 = "abc";
    String s2 = "abc";
    boolean result2 = s1. equals(s2);
    System.out.println(result2);//true

    //equals()> false
    String s22 = "abcc";
    boolean result22 = s1. equals(s22);
    System.out.println(result22);//false

    // length()
    int result4 = password. length();
    System.out.println(result4);//9, the length of the String value

    String emptyString = "";
    System.out.println(emptyString. length());//0
    boolean isStringempty = "". equals(emptyString);
    System.out.println(isStringempty);//true

    String target = "hello";
    System.out.println("hello". equals(target));//true, asking if target equals to "hello"

    System.out.println("hello". charAt(2));//L
    System.out.println("hello". length());//5
    
    //'c'. charAt() // Primitive has no method tool

    // isEmpty()
    String s5 = "abc";
    // Check if s5 is empty
    boolean isEmpty = s5. length() == 0;
    System.out.println(isEmpty);//false
    System.out.println(s5. isEmpty());//false

    if (!s5.isEmpty()){

    }

    // substring
    // abc
    String substr = s5.substring(0, 2);
    // ! s5'svalue doesn't change 
    // ! substring is storing a new String value returned by "substring"
    System.out.println(substr);//ab
    System.out.println(s5. substring(0, 3));//abc
    System.out.println(s5. substring(0, s5. length()));//abc// System.out.println(s5)
    System.out.println(s5. substring(1, s5. length()));//bc
    System.out.println(s5. substring(1));//bc

    
    // String s502 = s5. substring(0,2);
    // System.out.println(s502);
    // if (s5. substring(0,2) == "ab"){
    //   System.out.println("substring0,2 is ab");
    // }

      

    








  }
}
