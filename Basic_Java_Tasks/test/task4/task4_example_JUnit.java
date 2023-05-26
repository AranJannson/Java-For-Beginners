package task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class task4_example_JUnit {

  /**
   * JUnit test for task4_example
   *
   * @author Aran Jannson
   */
  @Test
  public void noneDefaultConstructorTest() {
    // Constructor with the value "12" passed into the parameter
    task4_example noneDefaultConstructor = new task4_example(12);

    assertEquals("The Number is: 12", noneDefaultConstructor.numberOfCurrentObject());
  }

  @Test
  public void defaultConstructorTest() {
    // Default Constructor with no values passed into the parameter
    task4_example defaultConstructor = new task4_example();

    assertEquals("The Number is: null", defaultConstructor.numberOfCurrentObject());
  }
}
