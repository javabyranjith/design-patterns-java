package jbr.abstractfactorypattern.state.solution;

public abstract class IndiaFactory {
  abstract State getState(String stateName);
}
