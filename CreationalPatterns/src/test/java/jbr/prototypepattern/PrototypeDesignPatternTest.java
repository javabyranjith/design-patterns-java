package jbr.prototypepattern;

import org.junit.Before;
import org.junit.Test;

public class PrototypeDesignPatternTest {
  private CarFactory carFactory;

  @Before
  public void setUp() throws Exception {
    carFactory = new CarFactory();
  }

  @Test
  public void test() {

    Car maruti = new CarAssembler();
    maruti.setColor("White");
    Car marutiAssembled = carFactory.getCar(maruti);
    System.out.println(marutiAssembled);

    Car honda = new CarAssembler();
    honda.setColor("Blue");
    Car hondaAssembled = carFactory.getCar(honda);
    System.out.println(hondaAssembled);

    System.out.println("Maruti Car Color: " + marutiAssembled.getColor());
    System.out.println("Maruti Car Engine No: " + marutiAssembled.hashCode());

    System.out.println("Honda Car Color: " + hondaAssembled.getColor());
    System.out.println("Honda Car Engine No: " + hondaAssembled.hashCode());
  }

}
