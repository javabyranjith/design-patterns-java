package jbr.singletonpattern.animal;

import org.junit.Before;
import org.junit.Test;

import jbr.singletonpattern.person.Singleton;
import junit.framework.Assert;

public class AnimalSingletonTest {

  private Singleton singleton1;
  private Singleton singleton2;

  private Bird bird1;
  private Bird bird2;

  private AnimalSingleton animalSingleton1;
  private AnimalSingleton animalSingleton2;

  private Animal animal1;
  private Animal animal2;

  @Before
  public void setUp() throws Exception {
    // Create a instance for the Singleton class
    singleton1 = Singleton.getInstance();
    bird1 = new Bird();
    animalSingleton1 = AnimalSingleton.getInstance();
    animal1 = new Animal();

    // Create another instance
    singleton2 = Singleton.getInstance();
    bird2 = new Bird();
    animalSingleton2 = AnimalSingleton.getInstance();
    animal2 = new Animal();
  }

  @Test
  public void testSingleton() {
    Assert.assertEquals(singleton1, singleton2);
    Assert.assertEquals(animalSingleton1, animalSingleton2);
    // Testcase passed.
  }

  @Test
  public void testNonSingleton() {
    Assert.assertEquals(bird1, bird2);
    Assert.assertEquals(animal1, animal2);
    // Testcase failed.
  }

}
