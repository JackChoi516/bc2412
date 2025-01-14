import java.util.Comparator;


public class SortByAge implements Comparator<DemoPQ.Person> {
  @Override
  public int compare (DemoPQ.Person p1, DemoPQ.Person p2){
    if (p1.getAge() > 65)
      return -1;
    if (p1.getAge() > p2.getAge())
      return -1;
    return 1;

  }
  
}
