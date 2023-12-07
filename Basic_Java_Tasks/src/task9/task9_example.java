package task9;

import java.util.ArrayList;
import java.util.List;

public class task9_example {

  /**
   * An example for task9
   *
   * <p>ENUM's
   *
   * @author Aran Jannson
   */

  /**
   * Method to filter cars by a specific brand.
   *
   * @param cars The list of cars to filter.
   * @param brand The brand to filter by.
   * @return The filtered list of cars.
   */
  public List<Car> filterCarsByBrand(List<Car> cars, Brand brand) {
    // Create a new list to store the filtered cars.
    List<Car> filteredCars = new ArrayList<>();
    // Loop through each car and add it to the list if it matches the given brand.
    for (Car car : cars) {
      // If the car matches the given brand, add it to the list.
      if (car.getCarBrand() == brand) {
        filteredCars.add(car);
      }
    }
    // Return the filtered list of cars.
    return filteredCars;
  }

  /**
   * Method to calculate the total price of a list of cars.
   *
   * @param cars The list of cars to calculate the total price of.
   * @return The total price of the cars.
   */
  public double calculateTotalPrice(List<Car> cars) {
    double totalPrice = 0;
    // Loop through each car and add the price to the total price.
    for (Car car : cars) {
      totalPrice += car.getPrice();
    }
    // Return the total price.
    return totalPrice;
  }

  /**
   * Method to find cars manufactured after a given year.
   *
   * @param cars The list of cars to filter.
   * @param year The year to filter by.
   * @return The filtered list of cars.
   */
  public List<Car> findCarsManufacturedAfterYear(List<Car> cars, int year) {
    List<Car> filteredCars = new ArrayList<>();
    // Loop through each car and add it to the list if it was manufactured after the given year.
    for (Car car : cars) {
      // If the car was manufactured after the given year, add it to the list.
      if (car.getModelYear() > year) {
        filteredCars.add(car);
      }
    }
    // Return the filtered list of cars.
    return filteredCars;
  }
}
