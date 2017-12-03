package jbr.bridgepattern.vehicle.solution;

import jbr.bridgepattern.common.VehicleType;

public interface VehicleImplementor {
  VehicleType type();

  double calcSpeed();

  double calcOnRoadPrice();

  double calcMaintanenceCost();
}
