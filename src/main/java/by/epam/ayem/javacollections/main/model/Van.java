package by.epam.ayem.javacollections.main.model;

/**
 * @author Aleh Yemelyanchyk on 11/11/2019.
 */
public class Van extends TaxiCar {
    private final VanTypes type;

    public Van(String model, int seatsAmount, int price, double fuelConsumptionPer100miles,
               int speed, FuelType fuelType, double priceToOrder, double pricePerMile, VanTypes type) {
        super(model, seatsAmount, price, fuelConsumptionPer100miles, speed, fuelType, priceToOrder, pricePerMile);
        this.type = type;
    }

    public VanTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ". " + type;
    }
}
