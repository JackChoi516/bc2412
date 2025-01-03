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
  private int hp;
  private int mp;
  private int ap;
  private int level;

  public Hero(String name, long id){
    this.name = name;
    this.id = id;
    this.level = 0;
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

  public int getAp(){
    return this.ap;
  }
  // Method:
  // Presentation: isAlive
  // Action: Level Up
  public boolean isAlive(){
    return this.hp > 0;
  }

  public void setHp(int hp){
    this.hp = hp;
  }

  public void setMp(int mp){
    this.mp = mp;
  }

  public void setAp(int ap){
    this.ap = ap;
  }

  public void addLevel(){
    this.level += 1;
  }

  abstract void levelUp();

  public static void main(String[] args) {

  }
}
