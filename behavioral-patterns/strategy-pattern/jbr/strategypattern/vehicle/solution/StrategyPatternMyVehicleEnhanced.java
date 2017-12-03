package jbr.strategypattern.vehicle.solution;

import jbr.strategypattern.common.Vehicle;
import jbr.strategypattern.common.VehicleType;

public class StrategyPatternMyVehicleEnhanced {

  public static void main(String[] args) {
    Vehicle vehicle = assemble(VehicleType.CAR);
    System.out.println(vehicle.toString());

    vehicle = assemble(VehicleType.BIKE);
    System.out.println("\n" + vehicle.toString());

    vehicle = assemble(VehicleType.BUS);
    System.out.println("\n" + vehicle.toString());

  }

  public static Vehicle assemble(VehicleType vehicleType) {
    return AssemblerFactory.assemble(vehicleType)
        .assemble();
  }

}
