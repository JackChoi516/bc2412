import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
  public static void main(String[] args) {
    // FIFO
    Queue<String> strings = new LinkedList<>(); //LinkedList > add/remove head/tail
    strings.add("Oscar"); // add last
    strings.add("Vincent"); // add last
    strings.add("Lucas"); // add last
    System.out.println(strings); // [Oscar, Vincent, Lucas]

    String head = strings.poll(); //removeFirst, return String
    System.out.println(head); // Oscar
    System.out.println(strings); // [Vincent, Lucas]

    // Queue Interface hidden lots of function of LinkedList
    String str2 = strings.remove(); // similar to poll()
    System.out.println(strings);
    System.out.println(str2);

    System.out.println(strings.contains("Lucas")); // true

    // loolup the head element, not pick up
    System.out.println(strings.peek()); // Lucas
    System.out.println(strings.size()); // 1
    strings.offer("Jenny");

    // ArrayBlockingQueue
    Queue<String> qq =new ArrayBlockingQueue<>(3);
    System.out.println(qq.offer("ABC")); // true
    System.out.println(qq.offer("IJK")); // true
    System.out.println(qq.offer("ABC")); // true
    //System.out.println(qq.add("SDF"));
    System.out.println(qq.offer("XYZ")); // false
    System.out.println(qq.size());

    // for-each support queue
    for (String s : strings){
      System.out.println(s);
    }

    List<String> newStrings = new ArrayList<>();
    newStrings.add("AAA");
    newStrings.add("BBB");
    strings.addAll(newStrings);
    System.out.println(strings); // [Lucas, Jenny, AAA, BBB]
  }
}
