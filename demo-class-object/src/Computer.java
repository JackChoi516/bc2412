public class Computer {
  private String brand;
  private String gpu;
  private int price;
  private boolean isIntel;
  private String[] cpu;

  public Computer(String brand, String gpu, int price, boolean isIntel, String[]cpu){
    this.brand = brand;
    this.gpu = gpu;
    this.price = price;
    this.isIntel = isIntel;
    this.cpu = cpu;
  }

  //getter
  public String getBrand(){
    return this.brand;
  }

  public String getGpu(){
    return this.gpu;
  }

  public int getPrice(){
    return this.price;
  }

  public boolean getIsIntel(){
    return this.isIntel;
  }

  public String[] getCpu(){
    return this.cpu;
  }

  // setter
  public void setBrand(String brand){
    this.brand = brand;
  }

  public void setGpu(String gpu){
    this.gpu = gpu;
  }

  public void setPrice(int price){
    this.price = price;
  }

  public void setIsIntel(boolean trueFalse){
    this.isIntel = trueFalse;
  }

  public void setCpu(String[]cpu){
    this.cpu = cpu;
  }
  
}
