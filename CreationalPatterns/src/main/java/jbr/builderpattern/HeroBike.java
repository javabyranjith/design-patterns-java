package jbr.builderpattern;

public class HeroBike implements BikeBuilder {

  private Bike bike;

  public HeroBike() {
    bike = new Bike();
  }

  public void assembleEngine() {
    bike.setEngineType("Petrol");
  }

  public void assembleWheel() {
    bike.setWheelType("Alloy");

  }

  public void estimateCost() {
    bike.setCost(50000);

  }

  public Bike getBike() {
    return bike;
  }

  public void setName() {
    bike.setName("Hero");
  }

}
