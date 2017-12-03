package jbr.factorypattern.state.solution;

import jbr.factorypattern.common.StateName;

public class StateFactory {

  public State getState(StateName state) {
    State result = null;
    switch (state) {
    case TAMILNADU:
      result = new Tamilnadu();
      break;

    case KERALA:
      result = new Kerala();
      break;

    default:
      break;
    }
    return result;
  }
}
