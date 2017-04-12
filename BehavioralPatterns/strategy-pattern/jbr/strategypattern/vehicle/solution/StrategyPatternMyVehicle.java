package jbr.strategypattern.vehicle.solution;

import jbr.strategypattern.common.Vehicle;
import jbr.strategypattern.common.VehicleType;

public class StrategyPatternMyVehicle {

  public static void main(String[] args) {
    Vehicle car = assemble(VehicleType.CAR);
    System.out.println(car.getVehicleType());
  }

  public static Vehicle assemble(VehicleType vehicleType) {
    CarAssembler carAssembler = new CarAssembler();
    BikeAssembler bikeAssembler = new BikeAssembler();
    Vehicle vehicle = null;

    switch (vehicleType) {
    case CAR:
      vehicle = carAssembler.assemble();
      break;
    case BIKE:
      vehicle = bikeAssembler.assemble();
      break;
    default:
      break;
    // add implementations for new type of vehicles
    }

    return vehicle;
  }

}
