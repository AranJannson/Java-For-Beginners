package task7;

import java.util.ArrayList;

/**
 * An example for task7
 *
 * <p>Objects
 *
 * @author Aran Jannson
 */
public class task7_example {

    // ArrayList to store instances of the House class.
    private ArrayList<House> listOfHouses = new ArrayList<>();

    /**
     * Default constructor for task7_example.
     */
    public task7_example(){
        super();
    }

    /**
     * Creates a new House and adds it to the list of houses.
     *
     * @param ownerName The name of the owner of the house.
     * @param numberOfRooms The number of rooms in the house.
     * @param address The address of the house.
     */
    public void createAHouse(String ownerName, int numberOfRooms, String address){
        // Creating a new House object with the provided parameters.
        House currentHouse = new House(ownerName, numberOfRooms, address);

        // Adding the new House object to the list of houses.
        listOfHouses.add(currentHouse);
    }

    /**
     * Gets the list of houses.
     *
     * @return An ArrayList containing instances of the House class.
     */
    public ArrayList<House> getListOfHouses(){
        return listOfHouses;
    }
}
