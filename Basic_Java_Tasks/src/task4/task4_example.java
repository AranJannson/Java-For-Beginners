package task4;

public class task4_example {

  /**
   * An example for task4
   *
   * <p>Default and None-Default Constructors In Objects with Local Variables
   *
   * @author Aran Jannson
   */

  /**
   * This is a local variable A Local variable is unique to each instance of an object An Object is
   * a singular instance of a class
   */
  private int number;

  /**
   * This is a Default Constructor
   *
   * <p>A default constructor takes no inputs However may still assign data to a variable on the
   * creation of an object of this class
   */
  public task4_example() {
    // Explained in a later task
    super();
  }

  /**
   * This is a None-Default Constructor
   *
   * <p>This type of constructor takes a parameter as an input
   *
   * @param numberParam
   */
  public task4_example(int numberParam) {
    // Explained in a later task
    super();

    /**
     * this.number is the local variable number assigned outside the constructor We call it using
     * the keyword "this." allowing us to have internal variables of the same name
     *
     * <p>We assign the value of parameter numberParam to the local variable number
     */
    this.number = numberParam;
  }

  /**
   * Example to show the use of the None-Default Constructor
   *
   * @return String, "The Number is: " + the current value of the local variable number
   */
  public String numberOfCurrentObject() {
    return ("The Number is: " + this.number);
  }
}
