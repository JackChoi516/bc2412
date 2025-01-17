public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    s += "???";

    s = "";
    long before = System.currentTimeMillis(); // 1737012397649
    for (int i = 0; i < 100_100; i++){
      s += "!";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before); // 614ms

    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++){
      sb.append("!");// similar to setter
    }
    after = System.currentTimeMillis();
    System.out.println(after - before); // 8ms

    sb = new StringBuilder("abcd");
    System.out.println(sb.reverse()); // String does not have

    System.out.println(sb.charAt(2));
    sb.replace(0, 2, "yy");
    System.out.println(sb); // yyba

    sb.deleteCharAt(2);
    System.out.println(sb); // yya

    sb.setCharAt(2, 'o');
    System.out.println(sb); // yyo

    sb.insert(1, "!!!");
    System.out.println(sb); // y!!!yo

  }
}
