package jbr.factorypattern.state.problem;

import jbr.factorypattern.common.StateName;

public class FactoryPatternClient {

  public static void main(String[] args) {

    StateName state = StateName.TAMILNADU;
    switch (state) {
    case TAMILNADU:
      Tamilnadu tamilnadu = new Tamilnadu();
      tamilnadu.getDetails();
      break;

    case KERALA:
      Kerala kerala = new Kerala();
      kerala.getDetails();
      break;

    default:
      break;
    }
  }
}
