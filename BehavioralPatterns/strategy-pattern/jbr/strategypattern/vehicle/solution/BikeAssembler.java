package jbr.strategypattern.vehicle.solution;

import jbr.strategypattern.common.Vehicle;
import jbr.strategypattern.common.VehicleType;

public class BikeAssembler implements Assembler {

  @Override
  public Vehicle assemble() {
    return new Vehicle(2, "hero", VehicleType.BIKE, 300000);
  }

}
