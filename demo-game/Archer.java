public class Archer extends Hero {

  public Archer(String name, long id) {
    super(name, id);
    super.setHp(Archers.levelHp[super.getLevel()]);
    super.setMp(Archers.levelMp[super.getLevel()]);
    super.setAp(Archers.levelAp[super.getLevel()]);
  }

  public void attack(Mage mage) {
    if (mage.isAlive()) {
      mage.setHp(mage.getHp() - super.getAp());
      System.out.println("Mage: " + mage.getName() + " - " + super.getAp());
      if (mage.getHp() <= 0){
        System.out.println("Archer: " + super.getName() + " just killed " + "Mage: " + mage.getName());
      }
    }else {
      System.out.println("Mage: " + mage.getName() + " is already dead.");
    }
  }

  public void attack(Warrior warrior) {
    if (warrior.isAlive()) {
      warrior.setHp(warrior.getHp() - super.getAp());
      System.out.println("Warrior: " + warrior.getName() + " - " + super.getAp());
    }else {
      System.out.println("Warrior: " + warrior.getName() + " is already dead.");
    }
  }

  @Override
  public void levelUp() {
    super.addLevel();
    super.setHp(Archers.levelHp[super.getLevel()]);
    super.setMp(Archers.levelMp[super.getLevel()]);
    super.setAp(Archers.levelAp[super.getLevel()]);
  }

  @Override
  public String toString() {
    return "Archer[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + super.getAp()
        + "]";
  }

  // public void attackSkill(Warrior Warrior){

  // }

  public static void main(String[] args) {
    Archer a = new Archer("asd", 3L);
    a.levelUp();
    a.levelUp();
    System.out.println(a.getHp()); // 150
    System.out.println(a.getLevel()); // 1

  }
}
