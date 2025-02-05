package com.bootcamp.demo;

// Singleton Pattern (Coding Pattern)
public class InventoryService {
  private static InventoryService uniqueInstance = new InventoryService();

  private int stockCount;

  private InventoryService(){

  }

  public static InventoryService getInstance(){
    return uniqueInstance;
  }

  public static int getInstanceStockCount(){
    return uniqueInstance.getStockCount();
  }

  public boolean deductInstanceStockCount(){
    return this.deductStock();
  }

  public int getStockCount(){
    return this.stockCount;
  }

  public int checkAvailableStock(){
    return -1;
  }

  public boolean deductStock(){
    this.stockCount--;
    return false;
  }
}
