package jbr.builderpattern.bike.solution;

public class BuilderPatternClient {

  public static void main(String[] args) {

    BikeBuilder heroBikeBuilder = new HeroBike();
    heroBikeBuilder.assembleWheel();
    heroBikeBuilder.assembleEngine();
    heroBikeBuilder.estimateCost();
    heroBikeBuilder.setName();

    // Get Hero Bike
    System.out.println(heroBikeBuilder.getBike().toString());

    BikeBuilder enfieldBike = new RoyalEnfield();
    enfieldBike.assembleWheel();
    enfieldBike.assembleEngine();
    enfieldBike.estimateCost();
    enfieldBike.setName();

    // Get Royal Enfield Bike
    System.out.println("\n" + enfieldBike.getBike().toString());

  }
}
