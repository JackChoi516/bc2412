public class Student3 {
  private int id;
  private int score;
  private Candy[] candies;
  
  
  public Student3(int id, int score){
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

  public void addCandy(Candy candy){
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++){
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = candy;
    this.candies = newCandies;
  }
}
