package jbr.builderpattern;

public class BikeFactory {

  public void assemble(BikeBuilder bikeAssembler) {
    bikeAssembler.assembleWheel();
    bikeAssembler.assembleEngine();
    bikeAssembler.estimateCost();
  }
}
