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
    task4 task4Object = new task4("John", 21);

    assertEquals("John 21", task4Object.nameAndAge());
  }
}
