package jbr.singletonpattern;

public class MySingleton {
  private static MySingleton _instance;

  /**
   * Make constructor private to avoid this class sub-classed. If you want to
   * this class to be sub-classed make it as protected.
   **/
  private MySingleton() {

  }

  // Make it thread safe by adding synchronized keyword
  public static synchronized MySingleton getInstance() {
    if (_instance == null) {
      _instance = new MySingleton();
    }

    return _instance;
  }

  public String callMe() {
    return "MySingleton1 Class";
  }
}
