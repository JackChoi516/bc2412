public class Worker2 {
  
  public Worker2(){

  }

  public void moveIn(int quantities){
    Supermarket2.availableStock += quantities;
  }

  public void moveOut(int quantities){
    Supermarket2.availableStock -= quantities;
  }

  public int checkStockQuantities(){
    return Supermarket2.availableStock;
  }

  public static void main(String[] args) {
    Worker2 w1 = new Worker2();
    w1.moveIn(100);
    w1.moveOut(23);
    System.out.println(w1.checkStockQuantities()); // 77
  }
}
