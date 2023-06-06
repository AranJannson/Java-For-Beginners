package task6;

import static org.junit.Assert.*;

import org.junit.Test;

public class task6_JUnit {

  /**
   * JUnit test for task6
   *
   * @author Aran Jannson
   */

  // Local task6 Object
  private task6 task6Object = new task6();

  @Test
  public void arrayListTest() {
    // Check that output is '6'
    assertEquals(9, task6Object.arrayList());
  }

  @Test
  public void hashMapTest() {
    // Check that output is 'Bob'
    assertEquals("Bob", task6Object.hashMap());
  }
}
