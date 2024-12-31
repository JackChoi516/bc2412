public class Student2 {
  private int id;
  private int score;
  private Candy[] candies;
  ;

  public Student2(int id, int score){
    this.id = id;
    this.score = score;
    this.candies = new Candy[0];
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

  public void receiveCandy(char color){
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++){
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = new Candy(color);
    this.candies = newCandies;
    
  }

  public static void main(String[] args) {
    
    Student2 s1 = new Student2(1, 67);
    Student2 s2 = new Student2(2, 89);
    Student2 s3 = new Student2(3, 50);
    Student2 s4 = new Student2(4, 99);
    Student2 s5 = new Student2(5, 60);
    Student2 s6 = new Student2(6, 59);
    Student2[] student2s = new Student2[]{s1, s2, s3, s4, s5, s6};

    int candyCount = 20;

    while (candyCount > 0){
      for (int i = 0; i < student2s.length; i++){
        if (student2s[i].getScore() > 80 && candyCount >= 1){
          student2s[i].receiveCandy('R');
          candyCount--;
        }else if (student2s[i].getScore() >= 60 && student2s[i].getScore() < 80 && candyCount >= 1){
          student2s[i].receiveCandy('B');
          candyCount--;
        }else if (candyCount >= 1){
          student2s[i].receiveCandy('Y');
          candyCount--;
        }
      }
    }

    for (Student2 student2 :student2s){
      for (Candy candy: student2.getCandies()){
        System.out.print(candy.getColor());
      }
      System.out.println();
    }

    Candy[] candiesCount = new Candy[]{new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('Y'), new Candy('Y')};
    
  }
}
