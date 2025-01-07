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
  private int hp;
  private int mp;
  private int pd;
  private int md;
  private int ag;
  private int cc;
  private int level;
  private int id;
  private static int idCount = 1;

  public Hero(String name){
    this.name = name;
    this.id = Hero.idCount++;
    this.level = 1;
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

  public int getPd(){
    return this.pd;
  }

  public int getMd(){
    return this.md;
  }

  public int getAg(){
    return this.ag;
  }

  public int getCc(){
    return this.cc;
  }

  public int getId(){
    return this.id;
  }

  abstract int getPa();
  abstract int getMa();
  abstract int getCd();
  abstract void levelUp();
  abstract void physicalAttk(Hero hero);
  abstract void menaAttk(Hero hero);
  

  // public int getAp(){
  //   return this.ap;
  // }
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

  public void setPd(int pd){
    this.pd = pd;
  }

  public void setMd(int md){
    this.md = md;
  }

  public void setAg(int ag){
    this.ag = ag;
  }

  public void setCc(int cc){
    this.cc = cc;
  }

  public void addLevel(){
    this.level += 1;
  }

  public static Hero createHero(HeroRoles HeroRoles, String name){
    switch (HeroRoles){
      case ARCHER:
        return new Archer(name);
      case MAGE:
        return new Mage(name);
      case WARRIOR:
        return new Warrior(name);
      default:
      return null;
    }
  }

  


  public static void main(String[] args) {

   Hero a = Hero.createHero(HeroRoles.ARCHER, "ASD");
   System.out.println(a.getId());

   Hero m = Hero.createHero(HeroRoles.MAGE, "null");
   System.out.println(m.getId());

   System.out.println(a);

   a.physicalAttk(m);

  }
}
