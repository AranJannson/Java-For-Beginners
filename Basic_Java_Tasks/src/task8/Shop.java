package task8;

/**
 * Interfaces and Polymorphism
 *
 * @author Aran Jannson
 */
public class Shop implements Store {
  private String name, location; // Shop properties

  // Constructor for Shop class
  public Shop(String name, String location) {
    // Setting Shop properties
    this.name = name;
    this.location = location;
  }

  // Getters for Shop properties (name, location)
  // TODO: Add getters for name and location

  // Implementing open method from Store interface
  @Override
  public void open() {
    // TODO: Add specific logic to open the shop (For example print out a message to say stores open)
  }

  // TODO: Implement the close method from the Store interface

}
