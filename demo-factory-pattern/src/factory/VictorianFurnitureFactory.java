package factory;

import furniture.VictorianChair;
import furniture.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
  @Override
  public VictorianChair createChair(){
    return new VictorianChair();
  }

  @Override
  public VictorianSofa createSofa(){
    return new VictorianSofa();
  }
}
