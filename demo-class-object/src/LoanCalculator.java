import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculator {
  private double principle;
  private double annualInterestRate;
  private int numOfYears;

  // constructor
  public LoanCalculator(double principle, double annualInterestRate, int numOfYears){
    this.principle = principle;
    this.annualInterestRate = annualInterestRate;
    this.numOfYears = numOfYears;
  }

  public double totalInterestAfterYear(){
    // principle * ((1 + annualInterestRate/100)^numOfYears) - principle
    return BigDecimal.valueOf(this.principle)//
    .multiply(BigDecimal.valueOf(
      Math.pow(1 + this.annualInterestRate / 100.0, this.numOfYears)))//
    .subtract(BigDecimal.valueOf(this.principle))//
    .doubleValue();
  }
  // totalInterestAfterYear()
  // public double totalInterestAfterYear(){
  //   double totalInterest = this.principle;
  //   for (int i = 0; i <this.numOfYears; i++)
  //   totalInterest += BigDecimal.valueOf(totalInterest).multiply(BigDecimal.valueOf(annualInterestRate)).doubleValue();
  //   return BigDecimal.valueOf(totalInterest).setScale(3, RoundingMode.HALF_UP).subtract( BigDecimal.valueOf(principle)).doubleValue();
  // }

  // static method
  public static double totalInterestAfterYear2(double principle, double annualInterestRate, int numOfYears){
    return BigDecimal.valueOf(principle)//
    .multiply(BigDecimal.valueOf(
      Math.pow(1 + annualInterestRate / 100.0, numOfYears)))//
    .subtract(BigDecimal.valueOf(principle))//
    .doubleValue();
  }

  public static void main(String[] args) {
    LoanCalculator lc1 = new LoanCalculator(10000.0, 5, 6);
    System.out.println(lc1.totalInterestAfterYear());

    System.out.println(LoanCalculator.totalInterestAfterYear2(10000.0, 5, 6));
  }
  
}
