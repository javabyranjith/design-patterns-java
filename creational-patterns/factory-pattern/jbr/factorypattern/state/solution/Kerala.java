package jbr.factorypattern.state.solution;

public class Kerala implements State {

  private String language = "malayalam";
  private String population = "10 crores";
  private String capital = "Trivandram";

  public String getAllDetails() {
    return "Name: Kerala \nLanguage: " + language + "\nPopulation: " + population + "\nCapital: " + capital;
  }

  @Override
  public String getLanguage() {
    return this.language;
  }

  @Override
  public String getPopulation() {
    return this.population;
  }

  @Override
  public String getCapital() {
    return this.capital;
  }

}
