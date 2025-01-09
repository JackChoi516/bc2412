public class Mage extends Hero{
  
  public Mage(String name){
    super(name);
    super.setHp(Mages.MAX_HP[super.getLevel() - 1]);
    super.setMp(Mages.MAX_MP[super.getLevel() - 1]);

  }

  @Override
  public int getLevelPa(){
    return Mages.LEVEL_PA[super.getLevel() - 1];
  }

  @Override
  public int getLevelMa(){
    return Mages.LEVEL_MA[super.getLevel() - 1];
  }

  @Override
  public int getLevelCd(){
    return Mages.LEVEL_CD[super.getLevel() - 1];
  }

  @Override
  public int getPd(){
    return Mages.LEVEL_PD[super.getLevel() - 1];
  }

  @Override
  public int getMd(){
    return Mages.LEVEL_MD[super.getLevel() - 1];
  }

  @Override
  public void levelUp(){
    super.addLevel();
    super.setHp(Mages.MAX_HP[super.getLevel() - 1]);
    super.setMp(Mages.MAX_MP[super.getLevel() - 1]);

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
    return "Mage[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + this.getLevelPa() + "]";
  }
}
