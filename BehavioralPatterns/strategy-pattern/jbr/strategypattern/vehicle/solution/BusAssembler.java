package jbr.strategypattern.vehicle.solution;

import jbr.strategypattern.common.Vehicle;
import jbr.strategypattern.common.VehicleType;

public class BusAssembler implements Assembler {

  @Override
  public Vehicle assemble() {
    return new Vehicle(4, "ashok leyland", VehicleType.BUS, 1300000);
  }

}
