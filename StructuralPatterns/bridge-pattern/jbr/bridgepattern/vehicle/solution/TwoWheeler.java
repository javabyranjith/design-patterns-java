package jbr.bridgepattern.vehicle.solution;

import jbr.bridgepattern.common.VehicleType;

public class TwoWheeler implements VehicleImplementor {

  @Override
  public double calcSpeed() {
    return 100;
  }

  @Override
  public double calcOnRoadPrice() {
    return 1000000;
  }

  @Override
  public double calcMaintanenceCost() {
    return 0;
  }

  @Override
  public VehicleType type() {
    return VehicleType.TWO_WHEELER;
  }

}
