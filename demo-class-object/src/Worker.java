public class Worker {
  private static int workerCount = 0;
  private Supermarket supermarket;

  public Worker(Supermarket supermarket){
    this.supermarket = supermarket;
    Worker.workerCount++;
  }

  // if read private static variable, we should use a static method
  public static int getWorkCount(){
    return Worker.workerCount;
  }

  public void moveIn(int quantities){
    supermarket.setAvailableStock(supermarket.getavailableStock() + quantities);
  }

  public void moveOut(int quantities){
    supermarket.setAvailableStock(supermarket.getavailableStock() - quantities);
  }
}
