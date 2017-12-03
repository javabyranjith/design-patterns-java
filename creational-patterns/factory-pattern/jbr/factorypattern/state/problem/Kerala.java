package jbr.factorypattern.state.problem;

public class Kerala {

  private String language = "malayalam";
  private String population = "10 crores";
  private String capital = "Trivandram";

  public void getDetails() {
    System.out.println(
        "State Name: Kerala \nLanguage: " + language + "\nPopulation: " + population + "\nCapital: " + capital);
  }

}
