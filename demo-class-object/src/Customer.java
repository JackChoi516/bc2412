import java.math.BigDecimal;
import java.util.Arrays;

public class Customer { // Person "has" name, age
  private long id;
  private Order[] orders;

  // 1. Normally Customer can be created without order.
  // public Customer(long id, Order[] orders){
  // this.id = id;
  // this.orders = orders;
  // }

  public Customer(long id) {
    this.id = id;
    this.orders = new Order[0];
  }

  // getter
  public long getId() {
    return this.id;
  }

  // order id > item[]
  // totalOrderAmout by order id
  // isVip() > 100_100 (total amount of all orders)
  public boolean isVip() {
    BigDecimal result = BigDecimal.valueOf(0.0);
    for (int i = 0; i < orders.length; i++) {
      result = result.add(BigDecimal.valueOf(orders[i].totalOrderAmount()));
    }
    return result.doubleValue() >= 100_000.0;
  }

  // 2.Customer can place order after creating the customer account;
  public void placeOrder(Order order) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
  }

  public Item[] getOrderItems(long orderId) {
    for (Order order : this.orders) {
      if (order.getId() == orderId) {
        return order.getItems();
      }
    }
    return null; // return new item[0];
  }

  public double getTotalAmountOfOrder(long orderId){
    for(Order order : this.orders){
      if (order.getId() == orderId){
        return order.totalOrderAmount();
      }
    }
    return -1.0;
  }

  public int orderSize(){
    return this.orders.length;
  }

  public Order[] getOrders(){
    return this.orders;
  }

  public static void main(String[] args) {
    // Order[] orders = new Order[3];
    // orders[0] = new Order();
    // orders[1] = new Order();
    // orders[2] = new Order();
    Customer c1 = new Customer(1L); // create customer object and then, write down the "address" 
    // c1.placeOrder(new Order());

    Item item1 = new Item("bag", 10.99, 5);
    Item item2 = new Item("clothes", 5.99, 10);
    Item item3 = new Item("computer", 10000, 1);

    Order order1 = new Order(1L);
    order1.addItem(new Item("chair", 100.0, 2));
    order1.addItem(item1);
    c1.placeOrder(order1);

    Order order2 = new Order(2L);
    order2.addItem(item2);
    order2.addItem(new Item("pen", 5.0, 5));    

    Customer c2 = new Customer(2L);
    c2.placeOrder(order1);
    c2.placeOrder(order2);
    

    c2.getOrderItems(2);
    c2.getTotalAmountOfOrder(2L);
    
    System.out.println(c2.isVip());
    System.out.println(c2.getTotalAmountOfOrder(2L));

    Order order4 = new Order(4L);
    order4.addItem(new Item("Diamond", 10000.0, 10));
    c2. placeOrder(order4);
    System.out.println(c2.getTotalAmountOfOrder(4));
    System.out.println(c2.isVip()); // true

    System.out.println(c1.getOrders()[0].getItems()[0].getPrice()); // 100.0
    System.out.println(c1.getOrders()[0].getItems()[1].getPrice()); // 10.99
    System.out.println(c1.getOrders()[0].totalOrderAmount()); // Order1 = 10.99*5 +100.0*2 = 254.95
    System.out.println(c1.getTotalAmountOfOrder(1)); // 254.95
    // c1.getOrders > Order[]
    // so, getOrders[0] > order
    // so, getOrders[0].getItems() > Item[]
    // so, getOrders[0].getItems()[1] > Item
    // so, getOrders[0].getItems()[1].getPrice() > double

  }
}
