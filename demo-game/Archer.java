public class Archer extends Hero {

  public Archer(String name) {
    super(name);
    super.setHp(Archers.MAX_HP[super.getLevel() - 1]);
    super.setMp(Archers.MAX_MP[super.getLevel() - 1]);
  }

  @Override
  public int getLevelPa(){
    return Archers.LEVEL_PA[super.getLevel() - 1];
  }

  @Override
  public int getLevelMa(){
    return Archers.LEVEL_MA[super.getLevel() - 1];
  }

  @Override
  public int getLevelCd(){
    return Archers.LEVEL_CD[super.getLevel() - 1];
  }

  @Override
  public int getPd(){
    return Archers.LEVEL_PD[super.getLevel() - 1];
  }

  @Override
  public int getMd(){
    return Archers.LEVEL_MD[super.getLevel() - 1];
  }

  @Override
  public void levelUp() {
    super.addLevel();
    super.setHp(Archers.MAX_HP[super.getLevel() - 1]);
    super.setMp(Archers.MAX_MP[super.getLevel() - 1]);
  }

  @Override
  public void physicalAttk(Hero hero){
    if (hero.isAlive()){
      hero.setHp(hero.getHp() - (this.getLevelPa() + super.getWeaponPa() - hero.getPd()));
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
  public String toString() {
    return "Archer[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + (this.getLevelPa() + super.getWeaponPa())
        + "]";
  }


  public static void main(String[] args) {
    Hero a = Hero.createHero(Roles.ARCHER, "QWE");
    a.levelUp();
    a.levelUp();
    System.out.println(a.getHp()); // 200
    System.out.println(a.getLevel()); // 3

    Hero m = Hero.createHero(Roles.MAGE, "asd");
    m.levelUp();

    a.physicalAttk(m);
    a.physicalAttk(m);
    a.physicalAttk(m);
    a.physicalAttk(m);
    a.menaAttk(m);
    System.out.println(m);
    //a.setWeaponPa(AclassBow.pA);
    System.out.println(a);
    
    Hero m2 = Hero.createHero(Roles.MAGE, "ZXC");
    a.physicalAttk(m2);
  }
}
