package jbr.bridgepattern.vehicle.problem;

import jbr.bridgepattern.common.VehicleType;

public class TwoWheeler implements Vehicle {

  public double calcSpeed() {
    return 100;
  }

  public double calcOnRoadPrice() {
    return 1000000;
  }

  @Override
  public VehicleType type() {
    return VehicleType.TWO_WHEELER;
  }

}
