import java.util.Arrays;

public class Order {
  private long id;
  private Item[] items;

  public Order(long id, Item[] items){
    this.id = id;
    this.items = items;
  }

  // getter
  public long getId(){
    return this.id;
  }

  public Item[] getItems(){
    return this.items;
  }

  // setter
  public void setId(long id){
    this.id = id;
  }
  public void setId(Item[] items){
    this.items = items;
  }
  
  public void placeItem(Item item){
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++){
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  // method
  public double totalOrderAmout(){
    double result = 0;
    for (int i = 0; i < items.length; i++){
      result += items[i].getTotalItemAmount();
    }
    return result;
  }

  public String showOrderNames(){
    for (Item item : this.items){
      System.out.println("Name: " + item.getItemName());
    }
    return null;
  }

  public static void main(String[] args) {
    Item item1 = new Item("bag", 10.99, 5);
    Item item2 = new Item("clothes", 5.99, 10);

    Order order1 = new Order(1L, new Item[]{item1, item2});

    Item item3 = new Item("book", 1.99, 5);
    order1.placeItem(item3);

    order1.getItems();
    order1.showOrderNames();
    
    // System.out.println(order1.totalOrderAmout());
    
    System.out.println(Arrays.toString(order1.getItems()));
  }
}
