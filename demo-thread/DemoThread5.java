import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoThread5 {
  private Map<Integer, String> map;// Hashmap is not thread-safe

  public DemoThread5(){
    this.map = new Hashtable<>();
    // this.map = Collections.synchronizedMap(new HashMap<>()); // HashMap = Array + LinkedList
  }

  public String put(Integer key, String value){
    return this.map.put(key, value);
  }

  public int size(){
    return this.map.size();
  }

  public static void main(String[] args) {
    DemoThread5 central = new DemoThread5();
    Runnable putEntryRask1 = () -> {
      for (int i = 0; i < 1_000_000; i++){
        central.put(i, "abc");
      }
    };

    Runnable putEntryRask2 = () -> {
      for (int i = 1_000_000; i < 2_000_000; i++){
        central.put(i, "abc");
      }
    };

    Thread workerB = new Thread(putEntryRask1);
    workerB.start();

    Thread workerC = new Thread(putEntryRask2);
    workerC.start();

    try {
      workerB.join();
      workerC.join();
    } catch (InterruptedException e){

    }

    System.out.println(central.size());
    
  }
}
