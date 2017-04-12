package jbr.abstractfactorypattern.state.solution;

public class NorthIndiaFactory extends IndiaFactory {

  @Override
  public State getState(String stateName) {
    if (stateName.equalsIgnoreCase("gujarath")) {
      return new Gujarath();
    } else if (stateName.equalsIgnoreCase("delhi")) {
      return new Delhi();
    }
    return null;
  }

}
