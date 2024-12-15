public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // if not found, print "Not Found."
    // code here ...
int beforeIndex = str.length();
int lastIndex = 0;
//int lastCharIndex = 0;
for (int i = 0; i < str.length(); i++){
  if (str. charAt(i) == target && i > beforeIndex){lastIndex = i;
  }else if(str.charAt(i)== target ){beforeIndex = i;}}
System.out.println("The index of the last character of c is " + lastIndex);
System.out.println(beforeIndex);
  }
}