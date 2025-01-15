public class DemoCheckException {
  // 2 Types Exception: !) Checked Exception (Compile-time) 2) Unhecked Exception (Runtime)

  // Define Checked Exception
  public static class BusinessException extends Exception {

  }

  // Define Unchecked Exception
  public static class BusinessRuntimeException extends RuntimeException {

  }

  public static void main (String[] args) throws BusinessException {
    sum(1, null);
    int sum = 0;
    try {
      sum = sum(10, null); // throw check exception (complie time)
      System.out.println(sum);
    } catch (BusinessException e){
      System.out.println("x and y cannot be null.");
    }

    // For rumtime exception, you can catch or not catch (Syntax Perspective)
    sum = sum2(10, null); // Syntax OK, but the execption still exists

    try {
      sum = sum2(10, null); // throw Uncheck exception (runtime)
      System.out.println(sum);
    } catch (BusinessRuntimeException e){
      System.out.println("x and y cannot be null.");
    }
  }


  public static int sum(Integer x, Integer y) throws BusinessException{
    if (x == null || y == null)
      throw new BusinessException();
    return x.intValue() + y.intValue();
  }

  public static int sum2(Integer x, Integer y) {
    if (x == null || y == null)
      throw new BusinessRuntimeException();
    return x.intValue() + y.intValue();
  }
}
