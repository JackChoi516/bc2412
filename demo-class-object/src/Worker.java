public class Worker {
  private Supermarket supermarket;

  public Worker(Supermarket supermarket){
    this.supermarket = supermarket;
  }

  public void moveIn(int quantities){
    supermarket.setAvailableStock(supermarket.getavailableStock() + quantities);
  }

  public void moveOut(int quantities){
    supermarket.setAvailableStock(supermarket.getavailableStock() - quantities);
  }
}
