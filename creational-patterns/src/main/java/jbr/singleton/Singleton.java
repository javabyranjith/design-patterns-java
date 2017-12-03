package jbr.singleton;

public class Singleton {

  // Declare a instance of this class private static
  private static Singleton _singletonInstance;

  /**
   * Make the constructor as private, so that it can't be sub-classed
   */
  private Singleton() {

  }

  /**
   * Has the logic to create a new Instance for Singleton class. static keyword
   * helps to access this method directly. synchronized - helps to avoid
   * multiple instance created by the multiple threads in case.
   *
   * @return
   */
  public static synchronized Singleton getSingletonInstance() {

    if (null == _singletonInstance) {
      _singletonInstance = new Singleton();
    }

    return _singletonInstance;
  }
}
