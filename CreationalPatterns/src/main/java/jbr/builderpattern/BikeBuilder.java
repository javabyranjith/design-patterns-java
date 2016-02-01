package jbr.builderpattern;

public interface BikeBuilder {
  void assembleEngine();

  void assembleWheel();

  void estimateCost();

  Bike getBike();

}
