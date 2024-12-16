import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[]args){

    double result = 0.2 + 0.1;
    System.out.println(result); // 0.30000000000000004
    if (result == 3.0){
      System.out.println("Result is 0.3.");
    }else {
      System.out.println("Result is Not 0.3");
    }

    // Solution: BigDecimal
    BigDecimal bd1 = BigDecimal. valueOf(0.2);
    BigDecimal bd2 = BigDecimal. valueOf(0.1);
    BigDecimal bd3 = bd1. add(bd2);
    System.out.println(bd3.doubleValue()); // 0.3

    System.out.println(0.3 - 0.1); // 0.19999999999999998
    // subtract
    BigDecimal bd4 = BigDecimal. valueOf(0.3);
    BigDecimal bd5 = BigDecimal. valueOf(0.1);
    BigDecimal bd6 = bd4. subtract(bd5);
    System.out.println(bd6. doubleValue()); // 0.2

    System.out.println(0.1 * 0.2); // 0.020000000000000004
    // multiply
    BigDecimal bd7 = bd2. multiply(bd1);
    System.out.println(bd7. doubleValue()); // 0.02
    
    System.out.println(0.3 / 0.1); // 2.9999999999999996
    // divide
    BigDecimal bd8 = bd4. divide(bd2);
    System.out.println(bd8. doubleValue()); // 3.0

    // 10 / 3
    System.out.println(10.0 / 3); // 3.3333333333333335
    BigDecimal bd9 = BigDecimal. valueOf(10);
    BigDecimal bd10 = BigDecimal. valueOf(3);
    BigDecimal bd11 = bd9. divide(bd10, BigDecimal.ROUND_DOWN);
    System.out.println(bd11. doubleValue()); // 3.0 // Non-terminating decimal expansion

    BigDecimal bd16 = BigDecimal. valueOf(4.565).setScale(2, RoundingMode.HALF_DOWN);
    System.out.println(bd16.doubleValue()); // 4.56

    BigDecimal bd17 = BigDecimal. valueOf(4.566).setScale(2, RoundingMode.HALF_DOWN);
    System.out.println(bd17.doubleValue()); // 4.57
    System.out.println(bd17.setScale(2, RoundingMode.HALF_UP)); // 4.57

    BigDecimal bd18 = BigDecimal. valueOf(4.565);
    System.out.println(bd18.setScale(2, RoundingMode.HALF_DOWN)); // 4.56
    System.out.println(bd18.setScale(2,RoundingMode.HALF_UP)); // 4.57

    BigDecimal bd19 = BigDecimal.valueOf(4.561);
    System.out.println(bd19.setScale(2, RoundingMode.UP)); // 4.57
    BigDecimal bd20 = BigDecimal.valueOf(4.569);
    System.out.println(bd20.setScale(2, RoundingMode.DOWN)); // 4.56



    

  }
  
}
