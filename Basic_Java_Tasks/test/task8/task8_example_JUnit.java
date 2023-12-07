package task8;

import org.junit.Before;
import org.junit.Test;
import task8.example.Market;
import task8.example.SuperMarket;
import task8.example.task8_example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * JUnit test for task8_example
 *
 * @author Aran Jannson
 */
public class task8_example_JUnit {

  private task8_example task8example;

  @Before
  public void setUp() {
    task8example = new task8_example();
  }

  /** Test method to create a market and add it to the list of markets. */
  @Test
  public void testNewMarket() {
    // Create a market using the provided parameters.
    SuperMarket newMarket = task8example.newMarket("SuperMart", "Downtown");

    // Ensure that the market is not null
    assertNotNull(newMarket); // Ensure that a Market object is created
  }

  /**
   * Test method to get the list of markets.
   *
   * @return The list of markets.
   */
  @Test
  public void testGetListOfMarkets() {
    // When
    ArrayList<Market> listOfMarkets = task8example.getListOfMarkets();

    // Then
    assertNotNull(listOfMarkets); // Ensure that the list is not null
    assertEquals(0, listOfMarkets.size()); // Ensure that the list is initially empty
  }

  /**
   * Test method to get the list of markets with added markets.
   *
   * @return The list of markets.
   */
  @Test
  public void testGetListOfMarketsWithAddedMarkets()
      throws NoSuchFieldException, IllegalAccessException {
    // Given details for two markets.
    String name1 = "SuperMart";
    String location1 = "Downtown";

    String name2 = "LocalMarket";
    String location2 = "Suburb";

    // When creating two markets with the given details.
    task8example.newMarket(name1, location1);
    task8example.newMarket(name2, location2);

    // Then retrieve the list of markets for further testing.
    ArrayList<Market> listOfMarkets = task8example.getListOfMarkets();

    // Ensure that the list is not null and has two markets
    assertNotNull(listOfMarkets);
    assertEquals(2, listOfMarkets.size()); // Ensure that the list has two markets

    // Use reflection to access private fields in SuperMarket
    for (Market market : listOfMarkets) {
      // Get the class and fields of the market
      Class<?> clazz = market.getClass();
      Field nameField = clazz.getDeclaredField("name");
      Field locationField = clazz.getDeclaredField("location");
      // Set the fields to be accessible
      nameField.setAccessible(true);
      locationField.setAccessible(true);

      // Retrieve the name and location of the market
      String name = (String) nameField.get(market);
      String location = (String) locationField.get(market);

      // Ensure that the name and location are not null
      assertNotNull(name);
      assertNotNull(location);

      // Ensure that the correct details are retrieved
      if (name.equals(name1) && location.equals(location1)) {
        assertEquals(name1, name);
        assertEquals(location1, location);
        // Ensure that the correct details are retrieved
      } else if (name.equals(name2) && location.equals(location2)) {
        assertEquals(name2, name);
        assertEquals(location2, location);
        // Else fail the test
      } else {
        fail("Unknown market details");
      }
    }
  }
}
