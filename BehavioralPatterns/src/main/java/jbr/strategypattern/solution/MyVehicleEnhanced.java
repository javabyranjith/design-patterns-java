package jbr.strategypattern.solution;

import jbr.common.VehicleType;
import jbr.common.model.Vehicle;

public class MyVehicleEnhanced {

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
