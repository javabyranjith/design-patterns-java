package jbr.singletonpattern;

import org.junit.Before;
import org.junit.Test;

import jbr.singletonpattern.MyJava;
import jbr.singletonpattern.MySingleton;
import jbr.singletonpattern.SampleJava;
import jbr.singletonpattern.Singleton;
import junit.framework.Assert;

public class SingletonTest {

  private Singleton singleton1;
  private Singleton singleton2;

  private SampleJava sampleJava1;
  private SampleJava sampleJava2;

  private MySingleton mySingleton1;
  private MySingleton mySingleton2;

  private MyJava myJava1;
  private MyJava myJava2;

  @Before
  public void setUp() throws Exception {
    // Create a instance for the Singleton class
    singleton1 = Singleton.getSingletonInstance();
    sampleJava1 = new SampleJava();
    mySingleton1 = MySingleton.getInstance();
    myJava1 = new MyJava();

    // Create another instance
    singleton2 = Singleton.getSingletonInstance();
    sampleJava2 = new SampleJava();
    mySingleton2 = MySingleton.getInstance();
    myJava2 = new MyJava();
  }

  @Test
  public void testSingleton() {
    Assert.assertEquals(singleton1, singleton2);
    Assert.assertEquals(mySingleton1, mySingleton2);
    // Testcase passed.
  }

  @Test
  public void testNonSingleton() {
    Assert.assertEquals(sampleJava1, sampleJava2);
    Assert.assertEquals(myJava1, myJava2);
    // Testcase failed.
  }

}
