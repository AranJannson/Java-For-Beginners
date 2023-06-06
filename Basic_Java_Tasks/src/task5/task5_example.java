package task5;

public class task5_example {

  /**
   * An example for task5
   *
   * <p>Loops and Arrays
   *
   * @author Aran Jannson
   */

  // Creating a Local Array Variable of type Integer
  int[] array;

  /** Default Constructor */
  public task5_example() {
    // Will be explained in a later task
    super();

    /**
     * An array in Java has a fixed size on initialisation This means that the array can't grow or
     * shrink in size after being set An array starts from index 0
     */

    // Initialise the array to a size of 5
    this.array = new int[5];
  }

  /**
   * An Example Of A For Loop The loop gets the current value of i which starts from 0 and adds it
   * into the array The Loop continues until it hits the max "length" of the array
   */
  private void forLoopExample() {

    // Create a for loop starting from "i = 0" incrementing until 'i' reaches the largest index in
    // the array
    for (int i = 0; i < array.length; i++) {
      // Add the value 'i' into the array at position 'i'
      this.array[i] = i;
      // Print the current value at position 'i' in the array
      System.out.println(array[i]);
      // Loop back and do it again until the end case is reached
    }
  }

  /**
   * An example of a While Loop and Calling an internal method in another method The Loop goes until
   * a end case is reached The Loop does not increment it self unlike a for loop
   *
   * @return String, "0, 1, 2, 3, 4, "
   */
  public String whileLoopExample() {

    // Initialise a count variable
    int count = 0;

    // Create a String variable
    String buffer = "";

    /**
     * Call the local forLoopExample() method in order to initialise the array
     *
     * <p>The Code written in forLoopExample() will be executed
     */
    forLoopExample();

    // Loop through the array
    while (count != array.length) {

      // Add the current array value into the string in format "integer, "
      buffer = buffer + array[count] + ", ";

      // Increment Count
      count++;
    }

    // Return the String buffer
    return buffer;
  }
}
