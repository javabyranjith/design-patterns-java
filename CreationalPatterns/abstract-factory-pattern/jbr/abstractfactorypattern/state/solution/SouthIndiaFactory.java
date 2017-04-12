package jbr.abstractfactorypattern.state.solution;

public class SouthIndiaFactory extends IndiaFactory {

  @Override
  State getState(String stateName) {
    if (stateName.equalsIgnoreCase("tamilnadu")) {
      return new Tamilnadu();
    } else if (stateName.equalsIgnoreCase("andra")) {
      return new Andra();
    }
    return null;
  }

}
