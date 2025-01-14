public abstract class Weapon {
  private int level;

  public Weapon(){
    this.level = 1;
  }

  abstract int getpA();

  abstract int getmA();

  abstract int getcC();

  public int getLevel(){
    return this.level;
  }

  public void levelUp(){
    this.level += 1;
  }

}
