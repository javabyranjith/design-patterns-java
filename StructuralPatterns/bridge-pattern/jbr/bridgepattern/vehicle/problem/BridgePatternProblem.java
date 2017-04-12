package jbr.bridgepattern.vehicle.problem;

import jbr.bridgepattern.common.VehicleType;

public class BridgePatternProblem {

  public static void main(String[] args) {

    VehicleType vehicleType = VehicleType.TWO_WHEELER;
    Vehicle vehicle = null;

    switch (vehicleType) {
    case TWO_WHEELER:
      vehicle = new TwoWheeler();
      break;

    case FOUR_WHEELER:
      vehicle = new FourWheeler();
      break;

    default:
      break;
    }

    System.out.println("vehicle type: " + vehicle.type());
    System.out.println("vehicle speed: " + vehicle.calcSpeed());
    System.out.println("vehicle on road price: " + vehicle.calcOnRoadPrice());
  }
}
