package jbr.builderpattern.bike.solution;

import jbr.builderpattern.common.Bike;

public interface BikeBuilder {

  void setName();

  void assembleEngine();

  void assembleWheel();

  void estimateCost();

  Bike getBike();

}
