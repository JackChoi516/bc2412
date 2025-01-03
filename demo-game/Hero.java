import javax.swing.plaf.synth.SynthOptionPaneUI;

public abstract class Hero {
  // HP 
  // MP
  // Level 
  // attackPower

  //Method:
  // Presentation: isAlive
  // Action: Level Up: +MaxHP, +MaxMP, +AttackPower

  // Hero is a Parent Class
  // Child Class: Archer, Mage, Warrior

  // attackPower
  // Weapons, 
  private String name;
  private long id;
  private int maxHp;
  private int maxMp;
  private int hp;
  private int mp;
  private int level;
  private static final int[] levelHp = new int[]{100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600};
  private static final int[] levelMp = new int[]{50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150};

  public Hero(String name, long id){
    this.name = name;
    this.id = id;
    this.level = 0;
    this.maxHp = Hero.levelHp[this.level];
    this.maxMp = Hero.levelMp[this.level];
    this.hp = this.maxHp;
    this.mp = this.maxMp;
  }

  public int[] getLevelHp(){
    return Hero.levelHp;
  }

  public String getName(){
    return this.name;
  }

  public int getLevel(){
    return this.level;
  }

  public int getHp(){
    return this.hp;
  }

  public int getMp(){
    return this.mp;
  }
  // Method:
  // Presentation: isAlive
  // Action: Level Up
  public boolean isAlive(){
    return this.hp > 0;
  }

  public void levelUp(){
    this.level += 1;
    this.maxHp = Hero.levelHp[this.level];
    this.maxMp = Hero.levelMp[this.level];
    this.hp = this.maxHp;
    this.mp = this.maxMp;
  }

  public static void main(String[] args) {

  }
}
