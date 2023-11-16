package task8;

import java.util.ArrayList;

/**
 * Interfaces and Polymorphism
 *
 * @author Aran Jannson
 */
public class task8 {
  // Local Variables
  ArrayList<Store> storeList; // Managing list of stores

  // Default Constructor
  public task8() {
    storeList = new ArrayList<>();
  }

  /**
   * Create a new Shop Object implementing Store interface
   *
   * @param name Name of the shop
   * @param location Location of the shop
   * @return Shop object implementing Store interface
   */
  public Shop newShop(String name, String location) {
    // TODO: Add the functionality to create a new Shop object and add it to the storeList
    return null;
  }

  /**
   * A method that return's all store objects created
   *
   * @return stores ArrayList containing Store objects
   */
  public ArrayList<Store> getListOfStores() {
    return storeList;
  }
}
