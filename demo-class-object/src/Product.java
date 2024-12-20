public class Product {
  private int quantities;
  private char size;
  
  public Product(int quantities, char size){
  this.quantities = quantities;
  this.size = size;
  }

  public int getQuantities(){
    return this.quantities;
  }

  public char getSize(){
    return this.size;
  }
 
}
