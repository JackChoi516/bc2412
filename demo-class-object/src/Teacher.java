public class Teacher {
  private Candy[] candies;
  private Student3[] students;

  public Teacher(Candy[] candies, Student3[] students){
    this.candies = candies;
    this.students = students;
  }

  public Candy[] getCandies(){
    return this.candies;
  }
  public Student3[] getStudents(){
    return this.students;
  }

  public Candy getCandyByColor(char color){
    Candy candy = null;
    for (int i = 0; i < this.candies.length; i++){
      if (this.candies[i].getColor() == color){
        candy = this.candies[i];
        break;
      }
    }
    if (candy == null){
      System.out.println("cannot find " + color + " candy.");
    }
    return candy;
  }

  public void removeCandy(Candy candy){
    if (candy != null){
    Candy[] newCandies = new Candy[this.candies.length - 1];
    int idx = 0;
      for (int i = 0; i < this.candies.length; i++){
        if (this.candies[i] == candy){
          continue;
        }else {
          newCandies[idx++] = this.candies[i];
        }
      }
      this.candies = newCandies;
    }else {System.out.println("cannot remove cuz candy is null.");}
  }

  public void distribute(int score1, int score2, char color){
   while (this.getCandyByColor(color) != null){
    for (int i = 0; i < this.students.length; i++){
      Candy candy = this.getCandyByColor(color);
      if (candy == null){
        break;
      } else if (this.students[i].getScore() <= score1 && this.students[i].getScore() > score2 && candy != null){
        this.students[i].addCandy(candy);
        this.removeCandy(candy);
      } else if (this.getCandyByColor(color) == null){
        break;
      }
    }
  }
}





  public static void main(String[] args) {

    Candy[] candiesCount = new Candy[]{new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('R'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('B'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y'), new Candy('Y')};

    Student3 s1 = new Student3(1, 67);
    Student3 s2 = new Student3(2, 89);
    Student3 s3 = new Student3(3, 50);
    Student3 s4 = new Student3(4, 99);
    Student3 s5 = new Student3(5, 60);
    Student3 s6 = new Student3(6, 59);
    Student3[] student3s = new Student3[]{s1, s2, s3, s4, s5, s6};

    Teacher t1 = new Teacher(candiesCount, student3s);

    

      t1.distribute(100, 80, 'R');
      t1.distribute(80, 59, 'B');
      t1.distribute(59, 0, 'Y');
      
      

    System.out.println("left " + t1.getCandies().length);


    for (Student3 student3 :student3s){
      for (Candy candy: student3.getCandies()){
        System.out.print(candy.getColor());
      }
      System.out.println();
    }
  }

}
