public class Warrior extends Hero{

  public Warrior(String name){
    super(name);
    super.setHp(Warriors.levelHp[super.getLevel() - 1]);
    super.setMp(Warriors.levelMp[super.getLevel() - 1]);
    super.setPd(Warriors.levelPd[super.getLevel() - 1]);
    super.setMd(Warriors.levelMd[super.getLevel() - 1]);
    super.setAg(Warriors.levelAg[super.getLevel() - 1]);
    super.setCc(Warriors.levelCc[super.getLevel() - 1]);
  }

  @Override
  public int getPa(){
    return Warriors.levelPa[super.getLevel() - 1];
  }

  @Override
  public int getMa(){
    return Warriors.levelMa[super.getLevel() - 1];
  }

  @Override
  public int getCd(){
    return Warriors.levelCd[super.getLevel() - 1];
  }

  @Override
  public void levelUp(){
    super.addLevel();
    super.setHp(Warriors.levelHp[super.getLevel() - 1]);
    super.setMp(Warriors.levelMp[super.getLevel() - 1]);
    super.setPd(Warriors.levelPd[super.getLevel() - 1]);
    super.setMd(Warriors.levelMd[super.getLevel() - 1]);
    super.setAg(Warriors.levelAg[super.getLevel() - 1]);
    super.setCc(Warriors.levelCc[super.getLevel() - 1]);
  }

  @Override
  public void physicalAttk(Hero hero){
    if (hero.isAlive()){
      hero.setHp(this.getPa() - hero.getPd());
      if (hero.isAlive()){
        System.out.println(hero.getName() + " - " + (this.getPa() - hero.getPd()));
      }else {
        System.out.println(super.getName() + " just killed " + hero.getName());
      }
    }
  }

  @Override
  public String toString(){
    return "Warrior[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + this.getPa();
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