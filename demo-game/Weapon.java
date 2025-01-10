public abstract class Weapon {

  private int weaponPa;
  private int weaponMa;

  public Weapon(int pA, int mA){
    this.weaponPa = pA;
    this.weaponMa = mA;
  }

  public int getWeaponPa(){
    return this.weaponPa;
  }

  public void setWeaponPa(int pA){
    this.weaponPa = pA;
  }
}
