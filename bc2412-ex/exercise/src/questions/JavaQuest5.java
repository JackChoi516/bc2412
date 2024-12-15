public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'o'; // Update this target to test the logic

    // if not found, print "Not Found."
    // code here ...
    int lastIndex = 0;
    int firstIndex = str.length();
    boolean isTargetExist = false;

    for ( int i = 0; i < str.length(); i++){
      if ( str.charAt(i) == target && i < firstIndex){firstIndex = i; isTargetExist = true;}
      else if ( str.charAt(i) == target && i > firstIndex){
         lastIndex = i; isTargetExist = true;}
      }
    if (isTargetExist == true){System.out.println("The index of the last character of c is " + lastIndex);}
    else if (isTargetExist == false){System.out.println("Not Found.");}
    
  }
}