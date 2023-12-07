package task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class task3_JUnit {

  /**
   * JUnit test for task3
   *
   * @author Aran Jannson
   */

  /**
   * Return the full name of a person by combining 2 variables Expecting the result "John Smith"
   *
   * @return String, John Smith
   */
  @Test
  public void fullNameTest() {

    // task3 Object
    task3 task3Object = new task3();

    // Expected Value "John Smith"
    assertEquals("John Smith", task3Object.fullName());
  }

  /**
   * Check If A Name Exists
   *
   * @return String, "Name Exists" if name is not null, "Name Does Not Exist" if name is null
   */
  @Test
  public void testIfFullName() {
    task3 task3Object = new task3();

    // Test when the name is null
    assertEquals("Name Does Not Exist", task3Object.ifFullName(null));

    // Test when the name is not null
    assertEquals("Name Exists", task3Object.ifFullName("John Doe"));
  }
}
