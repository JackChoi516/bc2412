public class CandyManager {
  private String name;
  private Candy[] candies;

  public CandyManager(String name, Candy[] candies){
    this.name = name;
    this.candies = candies;
  }



  public Candy[] getCandies(){
    return  this.candies;
  }

  public Candy getCandyByColor(char color){
    Candy candy = null;
    for (int i = 0; i < this.candies.length; i++){
      if (this.candies[i].getColor() == color){
        candy = this.candies[i];
        break;
      }
    }
    return candy;
  }

  public void addCandy(Candy candy){
    Candy[] newCandies = new Candy[0];
    for (int i = 0; i < this.candies.length; i++){
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = candy;
    this.candies = newCandies;
  }

  public void takeAwayCandy(Candy candy){
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
    Candy c1 = cm1.getCandyByColor('R');
    //System.out.println(c1.getColor());

    Student2 s1 = new Student2(1, 67, cm1);
    s1.addCandy(cm1.getCandyByColor('R'));
    s1.addCandy(cm1.getCandyByColor('R'));
    s1.addCandy(cm1.getCandyByColor('R'));
    s1.addCandy(cm1.getCandyByColor('R'));
    s1.addCandy(cm1.getCandyByColor('R'));
    s1.addCandy(cm1.getCandyByColor('R'));
    s1.addCandy(cm1.getCandyByColor('R'));
    s1.addCandy(cm1.getCandyByColor('R'));

    System.out.println(cm1.getCandies().length);
    System.out.println(s1.getNumOfCandies());
  }
}
