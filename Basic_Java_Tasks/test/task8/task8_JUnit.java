package task8;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

/**
 * JUnit test for task8
 *
 * @author Aran Jannson
 */
public class task8_JUnit {

  /** Test store operations. */
  @Test
  public void testStoreOperations() {
    // Create a new shop
    task8 task8 = new task8();
    Store myShop = task8.newShop("SuperMart", "Main Street");

    // Get the list of stores
    ArrayList<Store> stores = task8.getListOfStores();

    // Ensure the created store exists in the list
    assertEquals("Size of store list should be 1", 1, stores.size());
    assertEquals("The store should be SuperMart", "SuperMart", stores.get(0).getName());
    assertEquals("The location should be Main Street", "Main Street", stores.get(0).getLocation());

    // Testing store opening and closing operations
    for (Store store : stores) {
      store.open(); // Test opening the store
      // Ensure the store is open
      store.close(); // Test closing the store
      // Ensure the store is closed
    }
  }
}
