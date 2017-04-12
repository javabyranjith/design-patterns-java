package jbr.bridgepattern.vehicle.solution;

import jbr.bridgepattern.common.VehicleType;

public interface VehicleAbstraction {
  VehicleType type();

  double calcSpeed();

  double calcOnRoadPrice();

  double calcInsurance();
}
