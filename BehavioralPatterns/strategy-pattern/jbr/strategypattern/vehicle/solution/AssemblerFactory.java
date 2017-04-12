package jbr.strategypattern.vehicle.solution;

import jbr.strategypattern.common.VehicleType;

public class AssemblerFactory {

  public static Assembler assemble(VehicleType vehicleType) {
    switch (vehicleType) {
    case CAR:
      return new CarAssembler();
    case BIKE:
      return new BikeAssembler();
    case BUS:
      return new BusAssembler();
    default:
      break;
    }

    return null;
  }
}
