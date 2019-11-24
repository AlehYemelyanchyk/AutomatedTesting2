package by.epam.ayem.javacollections.main.model;

import java.io.Serializable;

/**
 * @author Aleh Yemelyanchyk on 11/10/2019.
 */
public class Car implements Serializable {
    private final String model;
    private final int seatsAmount;
    private int price;
    private final double fuelConsumptionPer100miles;
    private final int speed;
    private FuelType fuelType;

    public Car(String model, int seatsAmount, int price, double fuelConsumptionPer100miles, int speed, FuelType fuelType) {
        this.model = model;
        this.seatsAmount = seatsAmount;
        this.price = price;
        this.fuelConsumptionPer100miles = fuelConsumptionPer100miles;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getModel() {
        return model;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFuelConsumptionPer100miles() {
        return fuelConsumptionPer100miles;
    }

    public int getSpeed() {
        return speed;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return model + ": " + seatsAmount + " seats. " + price + "$. " + speed + " m/h. "
                + fuelType + ". Consumption: " + fuelConsumptionPer100miles;
    }
}
