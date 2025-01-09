import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class ArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple",
    // "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20,
    // 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India",
    // "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole",
    // "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their
    // name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

    // 1
    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);
    for (int i = 0; i < integers.size(); i++) {
      System.out.print(integers.get(i) + " ");
    }
    System.out.println();
    integers.remove(2);
    System.out.println(integers.size());

    // 2
    ArrayList<String> strings = new ArrayList<>();
    strings.add("Apple");
    strings.add("Banana");
    strings.add("Mango");
    strings.add("Orange");
    boolean found = false;
    String target = "Grapes";

    if (strings.contains(target)) {
      found = true;
    }

    if (!found) {
      strings.add(target);
    }
    strings.set(2, "Peach");
    for (int i = 0; i < strings.size(); i++) {
      System.out.println(strings.get(i));
    }

    // 3
    System.out.println("3.");
    // 10, 20, 10, 30, 40, 20, 50
    ArrayList<Integer> integers2 = new ArrayList<>();
    integers2.add(10);
    integers2.add(20);
    integers2.add(10);
    integers2.add(30);
    integers2.add(40);
    integers2.add(20);
    integers2.add(50);
    HashSet<Integer> integersHs = new HashSet<>();

    for (int i = 0; i < integers2.size(); i++){
      integersHs.add(integers2.get(i));
    }
    System.out.println(integersHs);

    // 4
    HashSet<String> countires = new HashSet<>();
    countires.add("USA");
    countires.add("India");
    countires.add("China");
    countires.add("Japan");
    countires.add("Canada");
    countires.add("India");
    System.out.println(countires);

    // 5
    System.out.println("5.");
    HashSet<Double> integers4 = new HashSet<>();
    integers4.add(1.1);
    integers4.add(2.2);
    integers4.add(3.3);
    integers4.add(4.4);
    integers4.add(5.5);
    if (integers4.contains(3.3)) {
      integers4.remove(2.2);
    }
    System.out.println(integers4);

    // 6
    System.out.println("6.");
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);
    HashSet<Integer> set2 = new HashSet<>();
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);
    for (Integer integer : set1){
      if (set2.contains(integer)){
        System.out.println(integer);
      }
    }

    // 7
    // "Cherry", "Steve", "Chole", "Jenny", "Vicky"
    HashSet<String> names = new HashSet<>();
    names.add("Cherry");
    names.add("Steve");
    names.add("Chole");
    names.add("Jenny");
    names.add("Vicky");
    ArrayList<String> names2 = new ArrayList<>();
    for (String name : names){
      names2.add(name);
    }
    for (int i = 0; i < names2.size(); i++){
    System.out.println(names2.get(i));
    }

    // 8
    Student s1 = new Student(1, "Alice");
    Student s2 = new Student(2, "Bob");
    Student s3 = new Student(3, "Charlie");
    ArrayList<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i));
    }
    students.remove(1);

    ArrayList<Student> studentStartA = new ArrayList<>();
    for (Student student : students) {
      if (student.getName().charAt(0) == 'A') {
        studentStartA.add(student);
      }
    }
    System.out.println(studentStartA.get(0));

    // 9 
    System.out.println();
    Student s4 = new Student(4, "David");
    HashSet<Student> students2 = new HashSet<>();
    HashSet<Student> students3 = new HashSet<>();
    students2.add(s1);
    students2.add(s2);
    students2.add(s3);
    students3.add(s2);
    students3.add(s3);
    students3.add(s4);
    for(Student student : students2){
      if (students3.contains(student)){
        System.out.println(student);
      }
    }

  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    // getter, setter, etc.
    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    public void setId(int id) {
      this.id = id;
    }

    public void setName(String name) {
      this.name = name;
    }

    public static String getNameById(Student[] students, int id) {
      String name = "";
      for (Student student : students) {
        if (student.getId() == id) {
          name = student.getName();
        } else {
          System.out.println("Student not found.");
        }
      }
      return name;
    }

    @Override
    public String toString() {
      return "[ID: " + this.id + ", Name: " + this.name + "]";
    }

    @Override
    public boolean equals(Object obj){
      if (this == obj){
        return true;
      }
      if (!(obj instanceof Student)){
        return false;
      }
      Student student = (Student) obj;
      return Objects.equals(student.getId(), this.id) && Objects.equals(student.getName(), this.name);
      }

  }
}
