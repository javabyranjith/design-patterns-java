package jbr.bridgepattern.vehicle.problem;

import jbr.bridgepattern.common.VehicleType;

public interface Vehicle {

  VehicleType type();

  double calcSpeed();

  double calcOnRoadPrice();

  // double calcInsurance(); // change affects all its implementation

}
