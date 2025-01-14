import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();
    strings.add("Lucas"); // add last
    strings.add("Vincent");
    strings.add("Oscar");
    strings.addFirst("Jenny");
    System.out.println(strings); // [Jenny, Lucas, Vincent, Oscar]
    System.out.println(strings.poll()); // pollFirst() // Jenny
    System.out.println(strings.pollLast()); // Oscar
    System.out.println(strings.peek()); // peekFirst // Lucas
    System.out.println(strings.peekLast()); // Vincent

    // support for loop
    // support remove
    // contains

    // ArrayDeque...
    Queue<String> ss3 = null;
    int x = 3;
    if(x > 2){
      ss3 = new ArrayDeque<>();
    }else {
      ss3 = new LinkedList<>();
    }

    ss3.poll(); // different implementation > performance according to scenario

    Deque<String> ss2 = new ArrayDeque<>();
    // Deque has wider scope (i.e add/remove/poll/peek first & Last)

  }
}
