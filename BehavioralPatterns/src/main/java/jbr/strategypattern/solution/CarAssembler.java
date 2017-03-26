package jbr.strategypattern.solution;

import jbr.common.VehicleType;
import jbr.common.model.Vehicle;

public class CarAssembler implements Assembler {

  @Override
  public Vehicle assemble() {
    return new Vehicle(4, "honda", VehicleType.CAR, 100000);
  }

}
