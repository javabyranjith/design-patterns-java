package jbr.bridgepattern.vehicle.solution;

import jbr.bridgepattern.common.VehicleType;

public class BridgePatternSolution {

  public static void main(String[] args) {

    VehicleType vehicleType = VehicleType.TWO_WHEELER;
    VehicleAbstraction vehicle = null;

    switch (vehicleType) {
    case TWO_WHEELER:
      vehicle = new VehicleAbstractionImpl(new TwoWheeler());
      break;

    case FOUR_WHEELER:
      vehicle = new VehicleAbstractionImpl(new FourWheeler());
      break;

    default:
      break;
    }

    System.out.println("vehicle type: " + vehicle.type());
    System.out.println("vehicle speed: " + vehicle.calcSpeed());
    System.out.println("vehicle on road price: " + vehicle.calcOnRoadPrice());
  }
}
