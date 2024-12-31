public class DemoInteger {
  public static void main(String[] args) {
    Integer x = 3;
    Integer x2 = 3;
     // 2 reference, 1 object (Internal Cache)
    System.out.println(System.identityHashCode(x)); // 1159190947
    System.out.println(System.identityHashCode(x2)); // 1159190947

    Integer x3 = new Integer(3);
    System.out.println(System.identityHashCode(x3)); // 925858445
    Integer x4 = Integer.valueOf(3);
    System.out.println(System.identityHashCode(x4)); // 1159190947

    // Cache Range: -128 to 127
    Integer x5 = 128;
    Integer x6 = 128;
    System.out.println(System.identityHashCode(x5)); // 798154996
    System.out.println(System.identityHashCode(x6)); // 681842940

    Integer x7 = new Integer(128);
    Integer x8 = Integer.valueOf(128);
    System.out.println(System.identityHashCode(x7)); // 1392838282
    System.out.println(System.identityHashCode(x8)); // 523429237

    // Same situations for Byte , Short, Long, Character, Boolean

    Character c1 = 'a';
    Character c2 = 'a';
    System.out.println(System.identityHashCode(c1)); // 664740647
    System.out.println(System.identityHashCode(c2)); // 664740647

    Boolean b1 = true;
    Boolean b2 = true;
    System.out.println(System.identityHashCode(b1)); // 804564176
    System.out.println(System.identityHashCode(b2)); // 804564176

    // Not support Internal Cache: Float & Double
    Double d1 = 10.3;
    Double d2 = 10.3;
    System.out.println(System.identityHashCode(d1)); // 1421795058
    System.out.println(System.identityHashCode(d2)); // 1555009629

    Float f1 = 10.3f;
    Float f2 = 10.3f;
    System.out.println(System.identityHashCode(f1)); // 41359092
    System.out.println(System.identityHashCode(f2)); // 149928006

    // Most Important !!!!
    // >, <, >=, <=, !=, == for primitives ONLY
    Double d3 = 10.3;
    Double d4 = 10.3;
    if (d3 > 10.0){ // NOT OK!!

    }

    if (d3.compareTo(d4) > 0){
      System.out.println("d3 > d4");
    }
    Double d5 = 10.1;
    Double d6 = 10.6;
    if (d5.compareTo(d6) < 0){
      System.out.println(d3 < d4);
    }
    Double d7 = 10.1;
    Double d8 = 10.1;
    if (d7.equals(d8)){ // d7.compareTo(d8) == 0
      System.out.println("d7 = d8");
    }

    if (d3.compareTo(3.0) > 0){
      System.out.println("d3 > 3.0");
    }
    if (d3 > 3.0){ 
    // because 3.0 > primitive double > d3 auto convert to double
    System.out.println("d3 > 3.0");
    }

  }
}
