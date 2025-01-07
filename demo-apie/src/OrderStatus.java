public enum OrderStatus {
  PAID(1), READY_FOR_SHIP(2), DILIVERING(3), DELIVERED(4),;

  private final int value;

  private OrderStatus(int value){
    this.value = value;
  }

   
  // DELIVERED.next() > null
  public OrderStatus next(){
    for (OrderStatus o : OrderStatus.values()){
      if (o.value == this.value + 1){
        return o;
      }
    }
    return null;
  }

  public static void main(String[] args) {  
    System.out.println(OrderStatus.DELIVERED.next()); // null //toString  
    System.out.println(OrderStatus.PAID.name());
    System.out.println(OrderStatus.PAID.next().name());

    System.out.println(OrderStatus.valueOf("PAID") == OrderStatus.PAID); // true
 // System.out.println(OrderStatus.valueOf("paid") == OrderStatus.PAID); // truejava.lang.IllegalArgumentException

  }
}
