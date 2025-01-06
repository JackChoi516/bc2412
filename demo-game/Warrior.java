public class Warrior extends Hero{

  public Warrior(String name, long id){
    super(name, id);
    super.setHp(Warriors.levelHp[super.getLevel()]);
    super.setMp(Warriors.levelMp[super.getLevel()]);
    super.setAp(Warriors.levelAp[super.getLevel()]);
  }

  @Override
  public void levelUp(){
    super.addLevel();
    super.setHp(Warriors.levelHp[super.getLevel()]);
    super.setMp(Warriors.levelMp[super.getLevel()]);
    super.setAp(Warriors.levelAp[super.getLevel()]);
  }

  @Override
  public String toString(){
    return "Warrior[" + super.getName() + ", Hp:" + super.getHp() + ", Mp:" + super.getMp() + ", Ap:" + super.getAp() + "]";
  }

  public static void main(String[] args) {
    Archer a = new Archer("QWE", 1L);
    a.levelUp();
    a.levelUp();
    System.out.println(a);

    Mage m = new Mage("ASD", 2L);
    m.levelUp();
    System.out.println(m);

    Warrior w = new Warrior("ZXC", 3L);
    w.levelUp();
    w.levelUp();
    System.out.println(w);

    a.attack(m);    
    System.out.println(m);

    m.attack(a);
    System.out.println(a);

    
  }
}