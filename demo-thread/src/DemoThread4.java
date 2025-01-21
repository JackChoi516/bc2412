import java.util.ArrayList;
import java.util.List;
// solution 
// 1. Native Data structure (Vector)
// 2. lock the action
import java.util.Vector;

public class DemoThread4 {
  private List<Integer> integers; //Not Thread-safe

  public DemoThread4(){
    this.integers = new Vector<>(); // Polymorphism
  }

  // Encapsulate
  // public ArrayList<Integer> getIntegers(){
  //   return this.integers;
  // } 

  public boolean add(Integer integer){
    this.integers.contains(2); // lock
    return this.integers.add(integer); // lock this line of code
  }

  public int size(){
    return this.integers.size();
  }

  public static void main(String[] args) {
    DemoThread4 central = new DemoThread4();
    Runnable centralAddTask = () -> {
      for (int i = 0; i < 1_000_000; i++){
        central.add(i); 
      }
    };

    Thread workerB = new Thread(centralAddTask);
    workerB.start(); // main thread initialize another thread (workerB) to execute the task.
    // The workerB execute the Task Only.

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

    System.out.println(central.size());

  }
}
