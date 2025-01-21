public class DemoSwitchExpression {
  public static void main(String[] args) {
    // Switch + Lambda
    System.out.println(getColorValue(Color.RED)); // R
  }

  public static char getColorValue(Color color){
    return switch (color){
      case RED -> 'R';
      case YELLOW -> 'Y';
      case BLUE -> 'B';
    };
  }

  public static String getColorValue2(Color color){
    return switch (color){
      case RED -> {
        yield "Red.";
      }
      case YELLOW -> {
        yield "Yellow.";
      }
      case BLUE -> {
        yield "Blue.";
      }
    };
  }

  public static enum Color{
    RED, YELLOW, BLUE,;
  }
}
