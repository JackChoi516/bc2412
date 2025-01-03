public class Mage extends Hero{
  
  public Mage(String name, long id){
    super(name, id);
    super.setHp(Mages.levelHp[super.getLevel()]);
    super.setMp(Mages.levelMp[super.getLevel()]);
    this.setAp(Mages.levelAp[super.getLevel()]);
  }

  @Override
  public void levelUp(){
    super.addLevel();
    super.setHp(Mages.levelHp[super.getLevel()]);
    super.setMp(Mages.levelMp[super.getLevel()]);
    this.setAp(Mages.levelAp[super.getLevel()]);
  }

  @Override
  public String toString(){
    return "Mage[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + super.getAp() + "]";
  }
}
