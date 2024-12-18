public class DemoString {
  public static void main(String[] args) {
    String s1 = "hello";
    System.out.println(s1); // 5
    System.out.println(s1.charAt(1)); // e
    System.out.println("hello".equals(s1)); // true
    System.out.println(s1.substring(0, 2)); // he

    System.out.println(s1.contains("ll")); // true
    System.out.println(s1.contains("lll")); // false    
    System.out.println(s1.concat("!!!")); // hello!!!
    System.out.println(s1.startsWith("h")); // true
    System.out.println(s1.startsWith("ha")); // false
    System.out.println(s1.endsWith("lo")); // true
    System.out.println(s1.endsWith("oo")); // false
    System.out.println(s1.toUpperCase()); // HELLO
    System.out.println("HeLLo".toLowerCase()); // hello

    System.out.println(s1.replace("ll", "xxx")); // hexxxo
    System.out.println(s1.replace('l', 'm')); // hemmo
    System.out.println(s1.equalsIgnoreCase("HeLLo")); // true

    // !!!
    System.out.println(s1.indexOf('e')); // 1
    System.out.println(s1.indexOf('h')); // 0
    System.out.println(s1.indexOf('x')); // -1
  }
    
}
