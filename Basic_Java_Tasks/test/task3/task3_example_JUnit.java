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

  /**
   * Test simple addition
   *
   * @return int, 5
   */
  @Test
  public void simpleAdditionTest() {

    // Value expected is 5
    assertEquals(5, task3_exampleObject.simpleAddition());
  }

  /**
   * Test failed subtraction
   *
   * @return int, -2
   */
  @Test
  public void failedSubtractionTest() {

    // Value expected is -2
    assertEquals(-2, task3_exampleObject.failedSubtration());
  }

  /**
   * Check If A Name Exists
   *
   * @return String, "Name Exists" if name is not null, "Name Does Not Exist" if name is null
   */
  @Test
  public void testIfFullName() {

    // Test when the name is null
    assertEquals("Name Does Not Exist", task3_exampleObject.ifElseExample(null));

    // Test when the name is not null
    assertEquals("Name Exists", task3_exampleObject.ifElseExample("John Doe"));
  }
}
