package jbr.strategypattern.common;

public class Vehicle {
  private int noOfWheels;
  private String manufacturer;
  private VehicleType vehicleType;
  private int price;

  public Vehicle(int noOfWheels, String manufacturer, VehicleType vehicleType, int price) {
    this.noOfWheels = noOfWheels;
    this.manufacturer = manufacturer;
    this.vehicleType = vehicleType;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public int getNoOfWheels() {
    return noOfWheels;
  }

  public void setNoOfWheels(int noOfWheels) {
    this.noOfWheels = noOfWheels;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String model) {
    this.manufacturer = model;
  }

  @Override
  public String toString() {

    return "Type: " + this.vehicleType + "\nNo Of Wheels: " + this.noOfWheels + "\nManufacturer: " + this.manufacturer
        + "\nPrice: " + this.price;
  }
}
