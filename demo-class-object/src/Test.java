import java.util.Arrays;

public class Test {
  public static void main(String[] args){
    int x = 3;
    System.out.println(x);
    int[] arr = new int[3];
    
    String person = "vincent";
    int personAge = 18;

    String person2 = "lucas";
    int personAge2 = 17;

    String[]names = new String[]{"vincent", "lucas"};
    int[] ages = new int[]{18, 17};

    Person p1 = new Person("vincent", 18, "abc@email.com");
    System.out.println(p1.getName()); // vincent
    System.out.println(p1.getAge()); // 18
    System.out.println(p1.getEmail()); // abc@email.com

    Person p2 = new Person("lucas", 17, "abcd@email.com");
    System.out.println(p2.getName()); // lucas
    System.out.println(p2.getAge()); // 17
    System.out.println(p2.getEmail()); // abcd@email.com

    Person[] personsArr = new Person[]{p1, p2, new Person("dicky", 19, "dicky@gmail.com")};
    for (Person p: personsArr){
        System.out.println(p.getName() + "," + p.getAge() + "," + p.getEmail());
    }
    Person p3 = p2;
    System.out.println(p3.getAge()); // 17
    System.out.println(p3.getName()); // lucas
    System.out.println(p2.getAge()); // 17

    p2.setAge(30);
    System.out.println(p2.getAge()); // 30
    System.out.println(p3.getAge()); // 30

    p2.setEmail("lucas@gmail.com");
    System.out.println(p2.getEmail()); // lucas@gmail.com
    System.out.println(p3.getEmail()); // lucas@gmail.com
    
    String s1 = "hello";
    String[] strings = new String[]{s1, "world"};

    Computer c = new Computer("Asus", "rtx-4060", 10000, true, new String[]{"i7", "15"});
    System.out.println(Arrays.toString(c.getCpu())); // [i7, 15]

    }

  
}
