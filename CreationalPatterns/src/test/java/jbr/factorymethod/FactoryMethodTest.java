package jbr.factorymethod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactoryMethodTest {
  private StateFactory stateFactory;

  @Before
  public void setUp() throws Exception {
    stateFactory = new StateFactory();
  }

  @Test
  public void test() {
    Assert.assertEquals("Hindi", stateFactory.getState("Delhi").language());
    Assert.assertEquals("Kannada", stateFactory.getState("Karnataka").language());
  }

}
