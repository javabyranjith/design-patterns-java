package jbr.strategypattern.vehicle.solution;

import jbr.strategypattern.common.Vehicle;
import jbr.strategypattern.common.VehicleType;

public class CarAssembler implements Assembler {

  @Override
  public Vehicle assemble() {
    return new Vehicle(4, "honda", VehicleType.CAR, 100000);
  }

}
