public class DemoInnerClass { // Outer Class
  private int x;

  public void setX(int x){
    this.x = x;
  }

  public void print(){
    // Outer Class cannot read  inner class object attribute.
    // System.out.println("DemoInnerClass(): x=" + this.x + ", y=" + y);
    System.out.println("Outer.print(): x=" + x);
  }
  
  public static class Library{ // static nested class

  }

  public static class Builder{ // static nested class

  }

  public class Student{ // Inner Class
    private int y;

    public void print(){
      // Student object is able to read outer class object attribute directly.
      System.out.println("Student.print(): x=" + x + ", y=" + this.y);
    }

    public void setY(int y ){
      this.y = y;
    }
  }

  public static void main(String[] args) {
    DemoInnerClass.Library library = new DemoInnerClass.Library();

    DemoInnerClass dic = new DemoInnerClass();
    DemoInnerClass.Student student = dic.new Student(); // Not Parent-Child relationship
    // DemoInnerClass.Student student = new DemoInnerClass().new Student();

    dic.setX(10);
    student.setY(10);

    dic.print(); // Outer.print(): x=10
    student.print(); // Student.print(): x=10, y=10

  }
}
