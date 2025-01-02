public class CandyManager {
  private String name;
  private Candy[] candies;

  public CandyManager(String name, Candy[] candies){
    this.name = name;
    this.candies = candies;
  }



  public Candy[] getCandies(){
    return this.candies;
  }



  public void addCandy(Candy candy){
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++){
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = candy;
    this.candies = newCandies;
  }

  public void giveCandy(Candy candy){
    Candy[] newCandies = new Candy[this.candies.length - 1];
    int idx = 0;
    for (int i = 0; i < this.candies.length; i++){
      if (this.candies[i] == candy){
        continue;
      }else newCandies[idx++] = this.candies[i];
    }
    this.candies = newCandies;
  }


  public static void main(String[] args) {
    Candy[] candiesCount = new Candy[]{new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y')};
    CandyManager cm1 = new CandyManager("cm1", candiesCount);



  }
}
