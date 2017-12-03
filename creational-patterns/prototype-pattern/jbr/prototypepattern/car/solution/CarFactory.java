package jbr.prototypepattern.car.solution;

public class CarFactory {

  public Car getCar(Car car) {
    return car.assembleCar();
  }

}
