package jbr.strategypattern.solution;

import jbr.common.VehicleType;
import jbr.common.model.Vehicle;

public class BikeAssembler implements Assembler {

  @Override
  public Vehicle assemble() {
    return new Vehicle(2, "hero", VehicleType.BIKE, 300000);
  }

}
