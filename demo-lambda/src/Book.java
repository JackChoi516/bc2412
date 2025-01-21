public record Book(String name, double price) {
  // private String author;
  public static final int X = 10;

  @Override
  public String toString(){
    return "sdf";
  }

  // public Book(){

  // }

  public void print(){
    System.out.println(name + price);
  }

  public static void main(String[] args) {
    Book b1 = new Book("ABC", 10.5);
    System.out.println(b1.name()); // ABC
    System.out.println(b1.price()); // 10.5
    System.out.println(new Book("ABC", 10.5).equals(b1)); // true
    System.out.println(new Book("ABC", 10.5).hashCode()); // 1078168574
    System.out.println(b1.hashCode()); // 1078168574
    System.out.println(b1); // Book[name=ABC, price=10.5]
    b1.print();


    // All-arg constructor ONLY
    // renamed getter
    // No setter (immutable)
    // Support equals() and hashCode()
    // Support toString()
    // Support static varaible
    // Support custom instance method
    // Do not Support custom attribute
    // Do not support custom constructor
  }
}
