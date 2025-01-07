public class Archer extends Hero {

  public Archer(String name) {
    super(name);
    super.setHp(Archers.levelHp[super.getLevel() - 1]);
    super.setMp(Archers.levelMp[super.getLevel() - 1]);
    super.setPd(Archers.levelPd[super.getLevel() - 1]);
    super.setMd(Archers.levelMd[super.getLevel() - 1]);
    super.setAg(Archers.levelAg[super.getLevel() - 1]);
    super.setCc(Archers.levelCc[super.getLevel() - 1]);
  }

  @Override
  public int getPa(){
    return Archers.levelPa[super.getLevel() - 1];
  }

  @Override
  public int getMa(){
    return Archers.levelMa[super.getLevel() - 1];
  }

  @Override
  public int getCd(){
    return Archers.levelCd[super.getLevel() - 1];
  }

  @Override
  public void levelUp() {
    super.addLevel();
    super.setHp(Archers.levelHp[super.getLevel() - 1]);
    super.setMp(Archers.levelMp[super.getLevel() - 1]);
    super.setPd(Archers.levelPd[super.getLevel() - 1]);
    super.setMd(Archers.levelMd[super.getLevel() - 1]);
    super.setAg(Archers.levelAg[super.getLevel() - 1]);
    super.setCc(Archers.levelCc[super.getLevel() - 1]);  
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
  public String toString() {
    return "Archer[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + this.getPa()
        + "]";
  }

  // public void attackSkill(Warrior Warrior){

  // }

  public static void main(String[] args) {
    Archer a = new Archer("asd");
    a.levelUp();
    a.levelUp();
    System.out.println(a.getHp()); // 150
    System.out.println(a.getLevel()); // 1

  }
}
