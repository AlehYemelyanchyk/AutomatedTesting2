package by.epam.ayem.javacollections.main.model;

/**
 * @author Aleh Yemelyanchyk on 11/11/2019.
 */
public class TaxiCar extends Car {
    private double priceToOrder;
    private double pricePerMile;

    public TaxiCar(String model, int seatsAmount, int price, double fuelConsumptionPer100miles,
                   int speed, FuelType fuelType, double priceToOrder, double pricePerMile) {
        super(model, seatsAmount, price, fuelConsumptionPer100miles, speed, fuelType);
        this.priceToOrder = priceToOrder;
        this.pricePerMile = pricePerMile;
    }

    public double getPriceToOrder() {
        return priceToOrder;
    }

    public void setPriceToOrder(double priceToOrder) {
        this.priceToOrder = priceToOrder;
    }

    public double getPricePerMile() {
        return pricePerMile;
    }

    public void setPricePerMile(double pricePerMile) {
        this.pricePerMile = pricePerMile;
    }

    @Override
    public String toString() {
        return super.toString() + ". Price to order: " + priceToOrder + ". Price per mile: " + pricePerMile;
    }
}
