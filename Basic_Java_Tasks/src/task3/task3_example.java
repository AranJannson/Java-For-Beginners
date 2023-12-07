package task3;

public class task3_example {

  /**
   * An example for task3
   *
   * <p>Methods, If Else statements and Unit Testing
   *
   * @author Aran Jannson
   */

  /**
   * How To Run JUnit Tests
   *
   * <p>In the Package Explorer
   *
   * <p>Go To Test > task3
   *
   * <p>Right Click on task3_example_JUnit.java
   *
   * <p>Select Run As > JUnit Test
   *
   * <p>If all tests are run successfully each test will be shown as green If a test failed it will
   * be red, and you can compare your output with the one expected
   *
   * <p>You will learn how to write Unit tests in a later task Each task from here forward will
   * require you to test your code against a Unit Test
   */

  /**
   * Add 2 variables and return the resulting value
   *
   * @return Integer, 5
   */
  public int simpleAddition() {

    // Declare 2 integer variables
    int x = 2;
    int y = 3;

    // Return the addition of x and y
    return (x + y);
  }

  /**
   * Take away 2 variables which does not result in what the test is looking for Causing a failed
   * test
   *
   * @return Integer, 1
   */
  public int failedSubtration() {

    // Declare 2 integer variables
    int x = 4;
    int y = 3;

    // Return the subtraction of x and y
    return (x - y);
  }

  /**
   * Check If A Name Exists
   *
   * @return Integer, 1
   */
  public String ifElseExample(String name) {
    if(name == null){
      return "Name Does Not Exist";
    }else{
      return "Name Exists";
    }
  }
}
