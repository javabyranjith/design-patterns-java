package jbr.prototypepattern;

public class CarFactory {

  public Car getCar(Car car) {
    return car.assembleCar();
  }

}
