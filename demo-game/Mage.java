public class Mage extends Hero{
  
  public Mage(String name){
    super(name);
    super.setHp(Mages.levelHp[super.getLevel() - 1]);
    super.setMp(Mages.levelMp[super.getLevel() - 1]);
    super.setPd(Mages.levelPd[super.getLevel() - 1]);
    super.setMd(Mages.levelMd[super.getLevel() - 1]);
    super.setAg(Mages.levelAg[super.getLevel() - 1]);
    super.setCc(Mages.levelCc[super.getLevel() - 1]);
  }

  @Override
  public int getPa(){
    return Mages.levelPa[super.getLevel() - 1];
  }

  @Override
  public int getMa(){
    return Mages.levelMa[super.getLevel() - 1];
  }

  @Override
  public int getCd(){
    return Mages.levelCd[super.getLevel() - 1];
  }

  @Override
  public void levelUp(){
    super.addLevel();
    super.setHp(Mages.levelHp[super.getLevel() - 1]);
    super.setMp(Mages.levelMp[super.getLevel() - 1]);
    super.setPd(Mages.levelPd[super.getLevel() - 1]);
    super.setMd(Mages.levelMd[super.getLevel() - 1]);
    super.setAg(Mages.levelAg[super.getLevel() - 1]);
    super.setCc(Mages.levelCc[super.getLevel() - 1]);
  }

  @Override
  public void physicalAttk(Hero hero){
    if (hero.isAlive()){
      hero.setHp(hero.getHp() - (this.getPa() - hero.getPd()));
      if (hero.isAlive()){
        System.out.println(hero.getName() + " - " + (this.getPa() - hero.getPd()));
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
      hero.setHp(hero.getHp() - (this.getMa() - hero.getMd()));
      if (hero.isAlive()){
        System.out.println(hero.getName() + " - " + (this.getMa() - hero.getMd()));
      }else {
        System.out.println(super.getName() + " just killed " + hero.getName());
      }
    }else {
      System.out.println(hero.getName() + " is already dead.");
    }
  }

  @Override
  public String toString(){
    return "Mage[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + this.getPa() + "]";
  }
}
