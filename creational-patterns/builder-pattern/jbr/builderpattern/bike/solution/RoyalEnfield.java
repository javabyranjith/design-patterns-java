package jbr.builderpattern.bike.solution;

import jbr.builderpattern.common.Bike;

public class RoyalEnfield implements BikeBuilder {
  private Bike bike;

  RoyalEnfield() {
    bike = new Bike();
  }

  public void assembleWheel() {
    bike.setWheelType("Spoke");
  }

  public void estimateCost() {
    bike.setCost(170000);
  }

  public void assembleEngine() {
    bike.setEngineType("Diesel");
  }

  public Bike getBike() {
    return bike;
  }

  public void setName() {
    bike.setName("RoyalEnfield");
  }

}
