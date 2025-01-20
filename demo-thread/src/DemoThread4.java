import java.util.ArrayList;

public class DemoThread4 {
  private ArrayList<Integer> integers = new ArrayList<>();

  public void addInteger(){
    this.integers.add(1);
  }

  public ArrayList<Integer> getIntegers(){
    return this.integers;
  } 

  public static void main(String[] args) {
    DemoThread4 central = new DemoThread4();
    Runnable centralAddTask = () -> {
      for (int i = 0; i < 1_000_000; i++){
        central.addInteger();
      }
    };

    Thread workerB = new Thread(centralAddTask);
    workerB.start();

    Thread workerC = new Thread(centralAddTask);
    workerC.start();

    Thread workerD = new Thread(centralAddTask);
    workerD.start();

    try{
      workerB.join();
      workerC.join();
      workerD.join();
    } catch (InterruptedException e){

    }



    // for (int i = 0; i < 100_000; i++){
    //   central.addInteger();
    // }

    System.out.println(central.getIntegers().size());

  }
}
