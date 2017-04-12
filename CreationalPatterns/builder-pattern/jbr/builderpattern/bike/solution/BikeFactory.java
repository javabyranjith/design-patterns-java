package jbr.builderpattern.bike.solution;

public class BikeFactory {

  public void assemble(BikeBuilder bikeAssembler) {
    bikeAssembler.assembleWheel();
    bikeAssembler.assembleEngine();
    bikeAssembler.estimateCost();
  }
}
