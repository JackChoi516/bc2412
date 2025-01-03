public class Archer extends Hero{
  private int hp;
  private int mp;

  public Archer(String name, long id){
    super(name, id);
    
  }

  public void attackSkill(){

  }

  // public void attackSkill(Warrior Warrior){

  // }

  public static void main(String[] args) {
    Archer a = new Archer("asd", 3L);
    a.levelUp();
    System.out.println(a.getHp()); // 150
    System.out.println(a.getLevel()); // 1
    
    Mage m = new Mage("wer", 4L);
    System.out.println(m.getHp()); // 100
  }
}
