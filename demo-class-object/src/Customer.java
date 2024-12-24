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
  public double totalAmountOfAllOrders() {
    double result = 0;
    for (int i = 0; i < orders.length; i++) {
      result += orders[i].totalOrderAmout();
    }
    return result;
  }

  // public boolean isVip(){
  public boolean isVip() {
    boolean result = false;
    if (this.totalAmountOfAllOrders() > 100000) {
      result = true;
    }
    return result;
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

  public Item[] showItems(long orderId) {
    for (Order order : this.orders) {
      if (order.getId() == orderId) {
        // return orer.getItem();
        order.showOrderNames();
      }
    }
    return null;
  }

  public double showTotalAmountOfOrder(long orderId){
    for(Order order : this.orders){
      if (order.getId() == orderId){
        return order.totalOrderAmout();
      }
    }
    return 0.0;
  }

  public static void main(String[] args) {
    // Order[] orders = new Order[3];
    // orders[0] = new Order();
    // orders[1] = new Order();
    // orders[2] = new Order();
    Customer c1 = new Customer(1L);
    // c1.placeOrder(new Order());

    Item item1 = new Item("bag", 10.99, 5);
    Item item2 = new Item("clothes", 5.99, 10);

    Order order1 = new Order(1L, new Item[] { item1, item2 });

    Customer c2 = new Customer(2L);
    c2.placeOrder(order1);
    System.out.println(c2.totalAmountOfAllOrders());
    System.out.println(c2.isVip());

    c2.showItems(1L);

  }
}
