package jbr.builderpattern;

public class Bike {

  private String name;
  private String wheelType;
  private String engineType;
  private int cost;

  public int getCost() {
    return cost;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  @Override
  public String toString() {
    return "Bike Name: " + this.name + "\nWheel Type: " + this.wheelType + "\nEngine Type: " + this.engineType
        + "\nCost: " + this.cost;
  }

}
