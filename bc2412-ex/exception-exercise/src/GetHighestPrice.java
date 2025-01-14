import java.util.Comparator;

public class GetHighestPrice implements Comparator<Double> {
  @Override
  public int compare(Double d1, Double d2){
    if (d1 > d2)
      return -1;
    if (d1 < d2)
      return 1;
    return 1;
  }
}
