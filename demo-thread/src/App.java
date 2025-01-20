public class App {

  // main thread (worker A)
  // Another thread (worker B)
  public static void main(String[] args) throws Exception {
    int x = 3;
    x++;
    ++x;
    x += 1;
    System.out.println(x); // 6

    // Create another thread
    // 1. Task, 2. Thread
    Runnable sayHelloTask = () -> System.out.println("Hello!!!");
    
    Thread workerB = new Thread(sayHelloTask);
    workerB.start(); // main thread (workerA) execute new Thread (workerB)
    // main thread proceed its own task

    System.out.println("Program end.");
  }
}
