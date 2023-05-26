package task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class task3_example_JUnit {

  /**
   * JUnit test for task3_example
   *
   * @author Aran Jannson
   */

  // task3_example object
  private task3_example task3_exampleObject = new task3_example();

  @Test
  public void simpleAdditionTest() {

    // Value expected is 5
    assertEquals(5, task3_exampleObject.simpleAddition());
  }

  @Test
  public void failedSubtractionTest() {

    // Value expected is -2
    assertEquals(-2, task3_exampleObject.failedSubtration());
  }
}
