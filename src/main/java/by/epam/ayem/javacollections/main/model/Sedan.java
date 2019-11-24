package by.epam.ayem.javacollections.main.model;

/**
 * @author Aleh Yemelyanchyk on 11/11/2019.
 */
public class Sedan extends TaxiCar {
    private final ComfortTypes type;
    private final SedanTypes style;

    public Sedan(String model, int seatsAmount, int price, double fuelConsumptionPer100miles,
                 int speed, FuelType fuelType, double priceToOrder, double pricePerMile, ComfortTypes type, SedanTypes style) {
        super(model, seatsAmount, price, fuelConsumptionPer100miles, speed, fuelType, priceToOrder, pricePerMile);
        this.type = type;
        this.style = style;
    }

    public ComfortTypes getType() {
        return type;
    }

    public SedanTypes getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return super.toString() + ". " + type + ", " + style;
    }
}
