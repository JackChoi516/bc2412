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

  // setter
  public void setQuantities(int quantities){
    this.quantities = quantities;
  }
 
  public void setSize(char size){
    this.size = size;
  }

  public void setPrice(double price){
    this.price = price;
  }
}
