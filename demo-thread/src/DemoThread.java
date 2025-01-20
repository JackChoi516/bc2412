public class DemoThread {

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
    StringBuilder sb = new StringBuilder();
    Runnable concatStringMillionTimes = () -> {
        for (int i = 0; i < 1_000_000; i++){
            sb.append("!");
        }
        //System.out.println(sb.length()); // 1_000_000, executed by WorkerB
    };
    
    Thread workerB = new Thread(concatStringMillionTimes);
    workerB.start(); // main thread (workerA) execute new Thread (workerB)
    // main thread proceed its own task
    System.out.println(sb.length()); // 0 (likely), execute by WorkerA (main thread)

    System.out.println("Program end.");
  }
}
