package task8.example;

/**
 * An example for task8
 *
 * <p>Interfaces and Polymorphism
 *
 * @author Aran Jannson
 */
public class SuperMarket implements Market {

  private String name, location; // Local variables

  // Constructor for GroceryMarket class
  public SuperMarket(String name, String location) {
    this.name = name;
    this.location = location;
  }

  /**
   * This is a simple implementation of an interface being used. This is at the same time a simple
   * example of polymorphism. Polymorphism is the ability of an object to take on many forms/functionality.
   */

  // Implementing startShoppingSession method from Market interface

  /**
   * The override annotation is used to tell the compiler that the method is overriding a method.
   * If a method marked with @Override fails to correctly override a method in one of its superclasses,
   * the compiler generates an error.
   */
  @Override
  public void startShoppingSession() {
    System.out.println("Start shopping session at " + name + " market in " + location);
  }

  // Implementing endShoppingSession method from Market interface
  @Override
  public void endShoppingSession() {
    System.out.println("End shopping session at " + name + " market in " + location);
  }
}
