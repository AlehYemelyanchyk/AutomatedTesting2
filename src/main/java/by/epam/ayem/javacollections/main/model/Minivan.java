package by.epam.ayem.javacollections.main.model;

/**
 * @author Aleh Yemelyanchyk on 11/11/2019.
 */
public class Minivan extends TaxiCar {
    private final String platform;

    public Minivan(String model, int seatsAmount, int price, double fuelConsumptionPer100miles,
                   int speed, FuelType fuelType, double priceToOrder, double pricePerMile, String platform) {
        super(model, seatsAmount, price, fuelConsumptionPer100miles, speed, fuelType, priceToOrder, pricePerMile);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        return super.toString() + ". " + platform;
    }
}
