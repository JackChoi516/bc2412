import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {

  public static class Person {
    private String name;
    private int age;
    public Person(String name, int age){
      this.age = age;
      this.name = name;
    }
    public int getAge(){
      return this.age;
    }
    @Override
    public String toString(){
      return "Name=" + this.name + "Age=" + this.age + " ";
    }

  }

  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("Vincent");
    System.out.println(pq); // [Vincent]
    pq.add("Oscar");
    System.out.println(pq); // [Oscar, Vincent]
    pq.add("Lucas"); 
    System.out.println(pq); // [Lucas, Vincent, Oscar] (No ordering)
    System.out.println(pq.size()); // 3
    
    // For poll(), ordering > String natural order
    System.out.println(pq.poll()); // Lucas
    System.out.println(pq.poll()); // Oscar
    System.out.println(pq.poll()); // Vincent

    PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
    pq2.add(new Person("Vincent", 66));
    pq2.add(new Person("Lucas", 80));
    pq2.add(new Person("Oscar", 40));
    System.out.println(pq2.poll()); // 80
    System.out.println(pq2.poll()); // 66
    System.out.println(pq2.poll()); // 40


  }
}
