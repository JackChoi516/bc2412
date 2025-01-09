public class Warrior extends Hero{

  public Warrior(String name){
    super(name);
    super.setHp(Warriors.MAX_HP[super.getLevel() - 1]);
    super.setMp(Warriors.MAX_MP[super.getLevel() - 1]);

  }

  @Override
  public int getLevelPa(){
    return Warriors.LEVEL_PA[super.getLevel() - 1];
  }

  @Override
  public int getLevelMa(){
    return Warriors.LEVEL_MA[super.getLevel() - 1];
  }

  @Override
  public int getLevelCd(){
    return Warriors.LEVEL_CD[super.getLevel() - 1];
  }

  @Override
  public int getPd(){
    return Warriors.LEVEL_PD[super.getLevel() - 1];
  }

  @Override
  public int getMd(){
    return Warriors.LEVEL_MD[super.getLevel() - 1];
  }

  @Override
  public void levelUp(){
    super.addLevel();
    super.setHp(Warriors.MAX_HP[super.getLevel() - 1]);
    super.setMp(Warriors.MAX_MP[super.getLevel() - 1]);

  }

  @Override
  public void physicalAttk(Hero hero){
    if (hero.isAlive()){
      hero.setHp(hero.getHp() - (this.getLevelPa() - hero.getPd()));
      if (hero.isAlive()){
        System.out.println(hero.getName() + " - " + (this.getLevelPa() - hero.getPd()));
      }else {
        System.out.println(super.getName() + " just killed " + hero.getName());
      }
    }else {
      System.out.println(hero.getName() + " is already dead.");
    }
  }

  @Override
  public void menaAttk(Hero hero){
    if (hero.isAlive()){
      hero.setHp(hero.getHp() - (this.getLevelMa() - hero.getMd()));
      if (hero.isAlive()){
        System.out.println(hero.getName() + " - " + (this.getLevelMa() - hero.getMd()));
      }else {
        System.out.println(super.getName() + " just killed " + hero.getName());
      }
    }else {
      System.out.println(hero.getName() + " is already dead.");
    }
  }

  @Override
  public String toString(){
    return "Warrior[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + this.getLevelPa() + "]";
  }

  public static void main(String[] args) {
    Archer a = new Archer("QWE");
    a.levelUp();
    a.levelUp();
    System.out.println(a);

    Mage m = new Mage("ASD");
    m.levelUp();
    System.out.println(m);

    Warrior w = new Warrior("ZXC");
    w.levelUp();
    w.levelUp();
    System.out.println(w);





    
  }
}