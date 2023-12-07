package task9;

/**
 * An example for task9
 *
 * <p>ENUM's
 *
 * @author Aran Jannson
 */
public class Car {

  // The fuel type ENUM of the car
  FuelType fuel;
  // The price of the car
  Double price;
  // The model year of the car
  Integer modelYear;
  // The brand of the car
  Brand carBrand;

  /**
   * Constructor for Car
   *
   * @param fuel The fuel type of the car
   * @param price The price of the car
   * @param modelYear The model year of the car
   * @param carBrand The brand of the car
   */
  public Car(FuelType fuel, double price, int modelYear, Brand carBrand) {

    this.fuel = fuel;
    this.price = price;
    this.modelYear = modelYear;
    this.carBrand = carBrand;
  }

  /** Get the price of the car */
  public Double getPrice() {
    return price;
  }

  /** Set the price of the car */
  public void setPrice(Double price) {
    this.price = price;
  }

  /** Get the fuel type of the car */
  public FuelType getFuel() {
    return fuel;
  }

  /** Get the model year of the car */
  public Integer getModelYear() {
    return modelYear;
  }

  /** Get the brand of the car */
  public Brand getCarBrand() {
    return carBrand;
  }
}
