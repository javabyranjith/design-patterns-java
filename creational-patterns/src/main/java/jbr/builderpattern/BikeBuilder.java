package jbr.builderpattern;

public interface BikeBuilder {

  void setName();

  void assembleEngine();

  void assembleWheel();

  void estimateCost();

  Bike getBike();

}
