public class Product {
  private int quantities;
  private char size;
  private double price;
  
  public Product(int quantities, char size, double price){
  this.quantities = quantities;
  this.size = size;
  this.price = price;
  }

  // getter
  public int getQuantities(){
    return this.quantities;
  }

  public char getSize(){
    return this.size;
  }

  public double getPrice(){
    return this.price;
  }
 
}
