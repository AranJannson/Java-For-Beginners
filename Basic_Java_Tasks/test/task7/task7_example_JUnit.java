package task7;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test for task7_example
 *
 * @author Aran Jannson
 */
public class task7_example_JUnit {

    // Instance of the task7_example class to be tested.
    private task7_example task7ExampleObject;

    // Setup method to initialize the task7Example before each test.
    @Before
    public void setUp() {
        task7ExampleObject = new task7_example();
    }

    /**
     * Test method to create a house and add it to the list of houses.
     *
     * @param ownerName The name of the owner of the house.
     * @param numberOfRooms The number of rooms in the house.
     * @param address The address of the house.
     */
    public void testCreateAHouse(String ownerName, int numberOfRooms, String address) {
        // When creating a house using the provided parameters.
        task7ExampleObject.createAHouse(ownerName, numberOfRooms, address);

        // Then, retrieve the list of houses for further testing.
        ArrayList<House> listOfHouses = task7ExampleObject.getListOfHouses();
    }

    /**
     * Test method to output the list of house owners to the console.
     */
    @Test
    public void testOutputArrayWithMultipleHouses() {
        // Given details for three houses.
        String ownerName = "John Doe";
        int numberOfRooms = 3;
        String address = "123 Main St";

        String ownerName2 = "Jane Doe";
        int numberOfRooms2 = 4;
        String address2 = "456 Main St";

        String ownerName3 = "Jack Doe";
        int numberOfRooms3 = 8;
        String address3 = "977 Main St";

        // When creating houses with the given details.
        testCreateAHouse(ownerName, numberOfRooms, address);
        testCreateAHouse(ownerName2, numberOfRooms2, address2);
        testCreateAHouse(ownerName3, numberOfRooms3, address3);

        // Then, retrieve the list of houses for further testing.
        ArrayList<House> listOfHouses = task7ExampleObject.getListOfHouses();

        // Output the list of house owners to the console.
        System.out.println("List of House Owners:");
        System.out.println("--------------------");
        System.out.println("Name: " + listOfHouses.get(0).getOwner() + " | RoomCount: " + listOfHouses.get(0).getNumberOfRooms() + " | Address: " + listOfHouses.get(0).getAddress());
        System.out.println("Name: " + listOfHouses.get(1).getOwner() + " | RoomCount: " + listOfHouses.get(1).getNumberOfRooms() + " | Address: " + listOfHouses.get(1).getAddress());
        System.out.println("Name: " + listOfHouses.get(2).getOwner() + " | RoomCount: " + listOfHouses.get(2).getNumberOfRooms() + " | Address: " + listOfHouses.get(2).getAddress());
    }
}