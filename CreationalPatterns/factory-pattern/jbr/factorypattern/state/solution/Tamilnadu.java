package jbr.factorypattern.state.solution;

public class Tamilnadu implements State {
  private String language = "tamil";
  private String population = "7 crores";
  private String capital = "Chennai";

  @Override
  public String getAllDetails() {
    return "Name: TamilNadu \nLanguage: " + language + "\nPopulation: " + population + "\nCapital: " + capital;
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
