package task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class task3_JUnit {

  /**
   * JUnit test for task3
   *
   * @author Aran Jannson
   */
  @Test
  public void fullNameTest() {

    // task3 Object
    task3 task3Object = new task3();

    // Expected Value "John Smith"
    assertEquals("John Smith", task3Object.fullName());
  }
}
