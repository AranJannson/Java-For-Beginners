package task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class task4_JUnit {

  /**
   * JUnit test for task4
   *
   * @author Aran Jannson
   */
  @Test
  public void test() {

    // Task4 Object, will give an error until task4 code is correctly written
    private task4 task4Object = new task4(21, "John");

    assertEquals("21 John", task4Object.nameAndAge());
  }
}
