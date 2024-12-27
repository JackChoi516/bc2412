import java.math.BigDecimal;
import java.util.Arrays;

public class Order {
  private long id;
  private Item[] items; //address / reference > Item[] array

  public Order(long id){
    this.id = id;
    this.items = new Item[0];
  }

  // getter
  public long getId(){
    return this.id;
  }

  public Item[] getItems(){
    return this.items;
  }
  
  public void addItem(Item item){
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++){
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public void removeItem(Item item){
    // resize array - 1
    // this.items > Item array object
    // this.items[i] > Item Object
    Item[] newItems = new Item[this.items.length - 1];
    int idx = 0;
    int countTarget = 0;
    for (int i = 0; i < this.items.length; i++){
      if (this.items[i].equals(item) && countTarget == 0){
        countTarget++;
        continue;
      }
      newItems[idx++] = this.items[i]; //copy
      
    }
    this.items = newItems;
  }

  // Order order = new Order(itmes);
  // order.totalAmount
  public double totalOrderAmount(){
    // 0.0 + 10.3 (new BigDecimal Object) > 10.3 (new BigDecimal Object)
    // 10.3 + 7.7 (new BigDecimal Object) > 18.0 (new BigDecimal Object)
    BigDecimal result = BigDecimal.valueOf(0.0);
    for (Item item : items){
      result = result.add(BigDecimal.valueOf(item.totalAmount()));
    }
    return result.doubleValue();
  }

  public String showOrderNames(){
    for (Item item : this.items){
      System.out.println("Order id: " + this.id + " Name: " + item.getItemName());
    }
    return null;
  }

  public static void main(String[] args) {
    Item item1 = new Item("bag", 10.99, 5);
    Item item2 = new Item("clothes", 5.99, 10);

    Order order1 = new Order(1L);

    Item item3 = new Item("book", 1.99, 5);
    order1.addItem(item3);
    order1.addItem(item2);
    order1.addItem(item1);

    order1.removeItem(item3);
    order1.getItems();
    order1.showOrderNames();


    
    System.out.println(order1.totalOrderAmount());
    
    
  }
}
