public class Archangel extends Stave {
  private final String name = "Archangel";
  private final int[] pA = new int[]{50, 60, 70};
  private final int[] mA = new int[]{50, 60, 70};
  private final int[] cC = new int[]{5, 10, 15};

  @Override
  public int getpA(){
    return this.pA[super.getLevel() - 1];
  }

  @Override
  public int getmA(){
    return this.mA[super.getLevel() - 1];
  }

  @Override
  public int getcC(){
    return this.cC[super.getLevel() - 1 ];
  }
}
