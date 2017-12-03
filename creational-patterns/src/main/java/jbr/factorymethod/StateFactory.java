package jbr.factorymethod;

/**
 * The factory class is the one which has be main logic of creating the instance
 * of the required object.
 *
 */
public class StateFactory {

  /**
   * Create a new instance of the object based on the request.
   *
   * @param stateName
   * @return
   */
  public State getState(String stateName) {
    if (stateName.equalsIgnoreCase("karnataka")) {
      return new Karnataka();
    } else if (stateName.equalsIgnoreCase("delhi")) {
      return new Delhi();
    }
    return null;
  }
}
