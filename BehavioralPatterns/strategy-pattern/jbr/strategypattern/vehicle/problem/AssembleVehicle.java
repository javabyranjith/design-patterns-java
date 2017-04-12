package jbr.strategypattern.vehicle.problem;

import jbr.strategypattern.common.Vehicle;
import jbr.strategypattern.common.VehicleType;

public class AssembleVehicle {

  public static void main(String[] args) {
    Vehicle car = assemble(VehicleType.CAR);
    System.out.println(car.getVehicleType());
  }

  public static Vehicle assemble(VehicleType vehicleType) {
    Vehicle vehicle = null;
    switch (vehicleType) {
    case CAR:
      vehicle = new Vehicle(4, "honda", VehicleType.CAR, 100000);
      break;
    case BIKE:
      vehicle = new Vehicle(2, "hero", VehicleType.BIKE, 300000);
      break;
    case BUS:
      vehicle = new Vehicle(4, "ashok leyland", VehicleType.BUS, 1300000);
      break;
    default:
      break;
    // add implementations for new type of vehicles
    }

    return vehicle;
  }
}
