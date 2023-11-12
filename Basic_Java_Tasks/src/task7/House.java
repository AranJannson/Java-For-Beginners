package task7;

/**
 * An example for task7
 *
 * <p>Objects
 *
 * @author Aran Jannson
 */
public class House {


  /**
   * This file is an example of an object
   * We will be using this object in task8, An object is a singular instance of a class.
   * An object can have local variables and a local variable is unique to each instance of an object.
   * A local variable can be accessed using a getter method a getter method is a method that returns the value of a local variable.
   * A getter method is a public method
   */


  // Private variables to store information about the house.
  private int numberOfRooms;
  private String address;
  private String owner;

  // Constructor to initialize the House object with the given parameters.
  public House(String owner, int numberOfRooms, String address) {
    super();

    // Initializing the instance variables with the provided values.
    this.address = address;
    this.numberOfRooms = numberOfRooms;
    this.owner = owner;
  }

  // Getter method to retrieve the number of rooms in the house.
  public int getNumberOfRooms() {
    return numberOfRooms;
  }

  // Getter method to retrieve the address of the house.
  public String getAddress() {
    return address;
  }

  // Getter method to retrieve the owner of the house.
  public String getOwner() {
    return owner;
  }
}
