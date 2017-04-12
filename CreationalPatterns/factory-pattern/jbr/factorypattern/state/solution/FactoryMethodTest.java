package jbr.factorypattern.state.solution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jbr.factorypattern.common.StateName;

public class FactoryMethodTest {
  private StateFactory stateFactory;

  @Before
  public void setUp() throws Exception {
    stateFactory = new StateFactory();
  }

  @Test
  public void test() {
    Assert.assertEquals("tamil", stateFactory.getState(StateName.TAMILNADU).getLanguage());
    Assert.assertEquals("malayalam", stateFactory.getState(StateName.KERALA).getLanguage());
  }

}
