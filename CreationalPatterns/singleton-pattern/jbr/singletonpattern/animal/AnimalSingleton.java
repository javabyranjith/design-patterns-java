package jbr.singletonpattern.animal;

public class AnimalSingleton {
  private static AnimalSingleton _instance;

  /**
   * Make constructor private to avoid this class sub-classed. If you want to
   * this class to be sub-classed make it as protected.
   **/
  private AnimalSingleton() {

  }

  // Make it thread safe by adding synchronized keyword
  public static synchronized AnimalSingleton getInstance() {
    if (_instance == null) {
      _instance = new AnimalSingleton();
    }

    return _instance;
  }

  public String callMe() {
    return "MySingleton Class";
  }
}
