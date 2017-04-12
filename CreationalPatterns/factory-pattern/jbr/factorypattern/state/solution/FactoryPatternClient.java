package jbr.factorypattern.state.solution;

import jbr.factorypattern.common.StateName;

public class FactoryPatternClient {

  public static void main(String[] args) {
    StateFactory stateFactory = new StateFactory();

    State tamilnadu = stateFactory.getState(StateName.TAMILNADU);
    System.out.println(tamilnadu.getAllDetails());

    State kearla = stateFactory.getState(StateName.KERALA);
    System.out.println("\n" + kearla.getAllDetails());
  }
}
