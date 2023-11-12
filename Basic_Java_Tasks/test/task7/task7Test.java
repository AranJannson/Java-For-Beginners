package task7;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class task7Test {

  private task7 task7Instance;

  @Before
  public void setUp() {
    task7Instance = new task7();
  }

  @Test
  public void testNewCar() {
    // When
    Car newCar = task7Instance.newCar();

    // Then
    assertNotNull(newCar); // Ensure that a Car object is created
  }

  @Test
  public void testGetListOfCars() {
    // When
    ArrayList<Car> listOfCars = task7Instance.getListOfCars();

    // Then
    assertNotNull(listOfCars); // Ensure that the list is not null
    assertEquals(0, listOfCars.size()); // Ensure that the list is initially empty
  }

  @Test
  public void testGetListOfCarsWithAddedCars() {
    // Given details for two cars.
    String brand1 = "ObjecterCars";
    int modelYear1 = 2022;
    int mileage1 = 5000;

    String brand2 = "FireCars";
    int modelYear2 = 2021;
    int mileage2 = 7000;

    // When creating two cars with the given details.
    task7Instance.newCar();
    task7Instance.newCar();

    // Then
    ArrayList<Car> listOfCars = task7Instance.getListOfCars();
    assertNotNull(listOfCars);
    assertEquals(2, listOfCars.size()); // Ensure that the list has two cars

    Car car1 = listOfCars.get(0);
    assertEquals(brand1, car1.getBrand());
    assertEquals(modelYear1, car1.getModelYear());
    assertEquals(mileage1, car1.getMileage());

    Car car2 = listOfCars.get(1);
    assertEquals(brand2, car2.getBrand());
    assertEquals(modelYear2, car2.getModelYear());
    assertEquals(mileage2, car2.getMileage());
  }
}
