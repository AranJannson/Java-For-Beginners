package task6;

import static org.junit.Assert.*;

import org.junit.Test;

public class task6_example_JUnit {

  /**
   * An example for task6
   *
   * <p>ArrayLists and HashMaps
   *
   * @author Aran Jannson
   */

  // Local task6_example Object
  private task6_example task6Object = new task6_example();

  @Test
  public void task6ExampleArrayListTest() {
    // Run the arrayListExample Method
    task6Object.arrayListExample();
  }

  @Test
  public void task6ExampleHashMapTest() {
    // Run the hashMapExample Method
    task6Object.hashMapExample();
  }
}
