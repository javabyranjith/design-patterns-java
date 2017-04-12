package jbr.builderpattern.bike.solution.java8;

import java.util.function.Consumer;

import jbr.builderpattern.java8.Bike;

public class HeroBike {

  private static Bike bike;

  public HeroBike assembleEngine() {
    bike.setEngineType("Petrol");
    return this;
  }

  public HeroBike assembleWheel() {
    bike.setWheelType("Alloy");
    return this;
  }

  public HeroBike estimateCost() {
    bike.setCost(50000);
    return this;
  }

  public HeroBike setName() {
    bike.setName("Hero");
    return this;
  }

  public Bike getBike(Consumer<HeroBike> heroBike) {
    bike = new Bike();

    HeroBike newHeroBike = new HeroBike();
    heroBike.accept(newHeroBike);

    return bike;
  }

}
