public class Student {
  private int id;
  private int score;
  private int candies;

  public Student(int id, int score){
    this.id = id;
    this.score = score;
  }

  public int getId(){
    return this.id;
  }

  public int getScore(){
    return this.score;
  }

  public int getCandies(){
    return this.candies;
  }

  public void receiveCandy(int nums){
    this.candies += nums;
  } 
 
 
  // Expected Output:
  // 20 candies > distribute students according to their score
  // Rule: Every round of distribution, Above 80 score > 2 candies; above 60 - 79 > 1 candy
  
  // Student 1: 67 score
  // Student 2: 89 score
  // Student 3: 50 score
  // Student 4: 99 score
  // Student 5: 60 score
  // Student 6: 59 score

  // 1: 4
  // 2: 6
  // 3: 0
  // 4: 6
  // 5: 4
  // 6: 0

  // Expected output
  // Student 1 has 4 candies
  // Student 2 has 6 candies
  // Student 3 has 0 candies
  // Student 4 has 6 candies
  // Student 5 has 4 candies
  // Student 6 has 0 candies

  // Tips: static > candyCount (while loop)

  public static void main(String[] args) {

    Student s1 = new Student(1, 67);
    Student s2 = new Student(2, 89);
    Student s3 = new Student(3, 50);
    Student s4 = new Student(4, 99);
    Student s5 = new Student(5, 60);
    Student s6 = new Student(6, 59);
    Student[] sArr = new Student[]{s1, s2, s3, s4, s5, s6};

    int candyCount = 20;
    while(candyCount > 0){
      for (int i = 0; i < sArr.length; i++){
        if (sArr[i].getScore() >= 80 && candyCount >=2){
          sArr[i].receiveCandy(2);
          candyCount -= 2;
        }else if (sArr[i].getScore() >= 60 && sArr[i].getScore() <= 79){
          sArr[i].receiveCandy(1);
          candyCount -= 1;
        }else {
          continue;
        }
      }
    }

    for (int i = 0; i < sArr.length; i++){
      System.out.println(sArr[i].getId() + " " + sArr[i].getCandies());
    }

    // Question 2
    // Candy.class has attribute color (RED, BLUE, YELLOW)
    // Student2.class to store his own candies

    // 20 candies > distribute students according to their score
    // Rule: Every round of distribution, Above 80 score > RED; between 60 - 79 > BLUE, else YELLOW

  // Student 1: 67 score
  // Student 2: 89 score
  // Student 3: 50 score
  // Student 4: 99 score
  // Student 5: 60 score
  // Student 6: 59 score

  // Expected output: sysout return Student[] (Student should have Candy attribute)
  }
}
