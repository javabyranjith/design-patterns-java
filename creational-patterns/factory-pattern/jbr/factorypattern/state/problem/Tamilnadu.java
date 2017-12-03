package jbr.factorypattern.state.problem;

public class Tamilnadu {

  private String language = "tamil";
  private String population = "7 crores";
  private String capital = "Chennai";

  public void getDetails() {
    System.out.println(
        "State Name: TamilNadu \nLanguage: " + language + "\nPopulation: " + population + "\nCapital: " + capital);
  }

}
