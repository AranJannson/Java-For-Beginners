package task9;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * JUnit test for task9_example
 *
 * @author Aran Jannson
 */
public class task9_exampleTest {

  /** Test method to filter cars by a specific brand. */
  @Test
  public void testFilterCarsByBrand() {
    // Given a list of cars
    List<Car> cars = new ArrayList<>();

    // Create cars with the given details.
    cars.add(new Car(FuelType.DIESEL, 25000.0, 2022, Brand.ACar));
    cars.add(new Car(FuelType.PETROL, 30000.0, 2023, Brand.SuperMotor));
    cars.add(new Car(FuelType.DIESEL, 27000.0, 2021, Brand.HydroCars));

    // Filter the list of cars by the given brand.
    task9_example example = new task9_example();
    List<Car> filteredCars = example.filterCarsByBrand(cars, Brand.SuperMotor);

    // Ensure that the list is 1 car long
    assertEquals(1, filteredCars.size()); // 1 car with Brand.SuperMotor should be found
  }

  /** Test method to calculate the total price of a list of cars. */
  @Test
  public void testCalculateTotalPrice() {
    // Given a list of cars
    List<Car> cars = new ArrayList<>();

    // Create cars with the given details.
    cars.add(new Car(FuelType.DIESEL, 25000.0, 2022, Brand.ACar));
    cars.add(new Car(FuelType.PETROL, 30000.0, 2023, Brand.SuperMotor));
    cars.add(new Car(FuelType.DIESEL, 27000.0, 2021, Brand.HydroCars));

    // Calculate the total price of the cars.
    task9_example example = new task9_example();
    double totalPrice = example.calculateTotalPrice(cars);

    // Ensure that the values are correct
    assertEquals(82000.0, totalPrice, 0.01); // Total price should be 82000.0
  }

  /** Test method to find cars manufactured after a given year. */
  @Test
  public void testFindCarsManufacturedAfterYear() {
    // Given a list of cars
    List<Car> cars = new ArrayList<>();

    // Create cars with the given details.
    cars.add(new Car(FuelType.DIESEL, 25000.0, 2022, Brand.ACar));
    cars.add(new Car(FuelType.PETROL, 30000.0, 2023, Brand.SuperMotor));
    cars.add(new Car(FuelType.DIESEL, 27000.0, 2021, Brand.HydroCars));

    // Filter the list of cars by the given year.
    task9_example example = new task9_example();
    List<Car> filteredCars = example.findCarsManufacturedAfterYear(cars, 2022);

    // Ensure that the list is 1 car long
    assertEquals(1, filteredCars.size());
    // Ensure that the car is the correct car
    assertEquals(2023, (long) filteredCars.get(0).getModelYear());
  }

  /** Test method to set the price and get the fuel type of a car. */
  @Test
  public void testSetPriceAndGetFuel() {
    // Create a car using the provided parameters.
    Car car = new Car(FuelType.DIESEL, 25000.0, 2022, Brand.ACar);

    // Testing setPrice() and getPrice()
    car.setPrice(26000.0);
    assertEquals(26000.0, car.getPrice(), 0.01); // Ensure price is set correctly

    // Testing getFuel()
    assertEquals(FuelType.DIESEL, car.getFuel()); // Ensure correct fuel type is retrieved
  }
}
