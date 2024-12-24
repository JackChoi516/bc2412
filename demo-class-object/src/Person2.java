import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Person2 {
  // attributes
  private double height; // instance variable
  private double weight; // instance variable
  private char gender;
  
  public Person2(double height, double weight, char gender){
    this.height = height;
    this.weight = weight;
    this.gender = gender;
    }

  // empty constructor
  public Person2(){

  }

  // Constructor
  // public Person2(double height){
  //   this.height = height;
  // }

  // public Person2(double weight){
  //   this.weight = weight;
  // }

  // getter
  public double getHeight(){
    return this.height;
  }

  public double getWeight(){
    return this.weight;
   }

  public char getGender(){
    return this.gender;
  }

  

  // instance method
  public double bmi(){ // Person2 p2 = new Person2(1.7, 60) > p2.bmi()
    return BigDecimal.valueOf(this.weight)
    .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, RoundingMode.HALF_UP)
    //.setScale(2, RoundingMode.HALF_DOWN)
    .doubleValue();
    }

    // instance method 
    // able to call object attributes & instance method
    public String bmiIndex(){
      double bmiValue = this.bmi();
      if (bmiValue > 35.0){
        return "Extremely Obese";
      }else if (bmiValue >= 30.0 && bmiValue < 35){
        return "Obese";
      }else if (bmiValue >= 25.0 && bmiValue < 30){
        return "Overweight";
      }else if (bmiValue >= 18.5 && bmiValue < 25){
      return "Normal";
      }else {
        return "Under Weight";
      }
    }

    // static method...
  public static double bmi(double weight, double height){
    return BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2, RoundingMode.HALF_UP)
    //.setScale(2, RoundingMode.HALF_DOWN)
    .doubleValue();    
  }

  public static void main(String[] args) {
    Person2 p1 = new Person2(1.7, 60.0, 'M');
    System.out.println(p1.bmi()); // 20.76

    System.out.println(Person2.bmi(60.0, 1.7)); // 20.76

    System.out.println(p1.bmiIndex()); // Normal

    // Constructor object by empty contructor 
    Person2 p2 = new Person2();
    System.out.println(p2.getHeight()); // 0.0
    System.out.println(p2.getWeight()); // 0.0
    System.out.println(p2.getGender()); // ' '

    if (p2.getGender() == '\u0000'){ // different to ' '
      System.out.println("char's default value.");
    }

    double x;
    // for local variable, you cannot get the value before intialization
    //System.out.println(x);

  }
}
