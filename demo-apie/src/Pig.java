public class Pig extends Animal {
  private int age;
  private double weight;

  public Pig(){
    // implicitly calling super
    // super(); // Animal()
    // super("XYZ"); Animal("XYZ")
  }

  public Pig(String name, double weight){
    super(name);
    this.weight = weight;
  }

  public void sleep(){
    System.out.println("Pig is sleeping...");
  }

  public static void main(String[] args) {
    Pig pig = new Pig();
    Pig pig2 = new Pig("ASD", 50.0);

    System.out.println(pig.getName()); // null
    System.out.println(pig2.getName()); // ASD
    pig.sleep(); // 
  }
}
