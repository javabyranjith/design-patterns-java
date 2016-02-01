package jbr.builderpattern;

public class Bike {

  private String wheelType;
  private String engineType;
  private int cost;

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public String getWheelType() {
    return wheelType;
  }

  public void setWheelType(String wheelType) {
    this.wheelType = wheelType;
  }

  public String getEngineType() {
    return engineType;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

}
