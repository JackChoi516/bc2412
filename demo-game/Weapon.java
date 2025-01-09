public abstract class Weapon {

  private int weaponPa;
  private int weaponMa;

  public Weapon(){
    this.weaponPa = 0;
    this.weaponMa = 0;
  }

  public int getWeaponPa(){
    return this.weaponPa;
  }

  public void setWeaponPa(int pA){
    this.weaponPa = pA;
  }
}
