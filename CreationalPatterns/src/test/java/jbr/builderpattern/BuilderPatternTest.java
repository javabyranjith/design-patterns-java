package jbr.builderpattern;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BuilderPatternTest {
  private BikeBuilder assembler;
  private BikeFactory bikeFactory;

  @Before
  public void setUp() throws Exception {
    bikeFactory = new BikeFactory();
  }

  @Test
  public void test() {
    assembler = new HeroBike();
    bikeFactory.assemble(assembler);
    Assert.assertEquals("Alloy", assembler.getBike().getWheelType());

    assembler = new RoyalEnfield();
    bikeFactory.assemble(assembler);
    Assert.assertEquals("Diesel", assembler.getBike().getEngineType());
  }

}
