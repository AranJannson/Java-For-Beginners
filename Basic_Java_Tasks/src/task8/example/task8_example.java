package task8.example;

import java.util.ArrayList;


/**
 * An example for task8
 *
 * <p>Interfaces and Polymorphism
 *
 * @author Aran Jannson
 */
public class task8_example {

  // Local Variables
  ArrayList<Market> marketList; // Managing list of markets

  // Default Constructor
  public task8_example() {
    marketList = new ArrayList<>();
  }

  /**
   * A new SuperMarket Object implementing Market interface
   *
   * @param name Name of the market
   * @param location Location of the market
   * @return GroceryMarket object implementing Market interface
   */
  public SuperMarket newMarket(String name, String location) {
    SuperMarket newMarket = new SuperMarket(name, location);
    marketList.add(newMarket); // Add the market to the list of markets
    return newMarket;
  }

  /**
   * A method that return's all market objects created
   *
   * @return markets ArrayList containing Market objects
   */
  public ArrayList<Market> getListOfMarkets() {
    return marketList;
  }
}
