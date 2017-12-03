package jbr.singleton;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SingletonTest {

  private Singleton singleton1;
  private Singleton singleton2;

  private SampleJava sampleJava1;
  private SampleJava sampleJava2;

  @Before
  public void setUp() throws Exception {
    // Create a instance for the Singleton class
    singleton1 = Singleton.getSingletonInstance();
    sampleJava1 = new SampleJava();
    // Create another instance
    singleton2 = Singleton.getSingletonInstance();
    sampleJava2 = new SampleJava();
  }

  @Test
  public void testSingleton() {
    Assert.assertEquals(singleton1, singleton2);
    // Testcase passed.
  }

  @Test
  public void testNonSingleton() {
    Assert.assertEquals(sampleJava1, sampleJava2);
    // Testcase failed.
  }

}
