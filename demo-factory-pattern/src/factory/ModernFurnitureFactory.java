package factory;

import furniture.ModernChair;
import furniture.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {
  @Override
  public ModernChair createChair(){
    return new ModernChair();
  }

  @Override
  public ModernSofa createSofa(){
    return new ModernSofa();
  }
}
