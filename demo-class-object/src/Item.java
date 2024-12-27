import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
  private String name;
  private double price;
  private int quantities;

  public Item(){

  }

  public Item(String name, double price, int quantities){
    this.name = name;
    this.price = price;
    this.quantities = quantities;
  }

  // getter
  public String getItemName(){
    return this.name;
  }

  public double getPrice(){
    return this.price;
  }

  public int getQuantities(){
    return this.quantities;
  }

  // setter
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setQuantities(int quantities){
    this.quantities = quantities;
  }

  // instance method
  public double totalAmount(){
    return (BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantities))).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
  
  public static void main(String[] args) {
    Item item1 = new Item("bag", 60.99, 11);
    System.out.println(item1.totalAmount());
  }
}
