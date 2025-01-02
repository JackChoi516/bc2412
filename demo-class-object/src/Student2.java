public class Student2 {
  private int id;
  private int score;
  private Candy[] candies;
  private CandyManager candyManager;
  
  public Student2(int id, int score, CandyManager candyManager){
    this.id = id;
    this.score = score;
    this.candies = new Candy[0];
    this.candyManager = candyManager;
  }

  public int getId(){
    return this.id;
  }

  public int getScore(){
    return this.score;
  }

  public Candy[] getCandies(){
    return this.candies;
  }

  public int getNumOfCandies(){
    return this.candies.length;
  }



  public void getCandyByColor(char color){
    Candy candy = null;
    for (int i = 0; i < this.candyManager.getCandies().length; i++){
      if (this.candyManager.getCandies()[i].getColor() == color){
        candy = this.candyManager.getCandies()[i];
        break;
      }
    }
    if (candy == null){
      System.out.println("cannot find " + color + " candy");
    }else {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++){
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = candy;
    this.candies = newCandies;
    this.candyManager.takeAwayCandy(candy);
  }
}



  public static void main(String[] args) {

    Candy[] candiesCount = new Candy[]{new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y')};
    CandyManager cm1 = new CandyManager("cm1", candiesCount);
    Student2 s1 = new Student2(1, 67, cm1);
    Student2 s2 = new Student2(2, 89, cm1);
    Student2 s3 = new Student2(3, 50, cm1);
    Student2 s4 = new Student2(4, 99, cm1);
    Student2 s5 = new Student2(5, 60, cm1);
    Student2 s6 = new Student2(6, 59, cm1);
    Student2[] student2s = new Student2[]{s1, s2, s3, s4, s5, s6};
    

  while (cm1.getCandies().length > 0){
    for (int i = 0; i < student2s.length; i++){
      if (student2s[i].getScore() >= 80){
        student2s[i].getCandyByColor('R');
      }else if (student2s[i].getScore() < 80 && student2s[i].getScore() >= 60){
        student2s[i].getCandyByColor('B');
      }else if (student2s[i].getScore() < 60){
        student2s[i].getCandyByColor('Y');
      }
    }
  }
    
    for (Student2 student2 :student2s){
      for (Candy candy: student2.getCandies()){
        System.out.print(candy.getColor());
      }
      System.out.println();
    }


  }
}
