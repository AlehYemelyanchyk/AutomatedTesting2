package by.epam.ayem.javacollections.main.service;

import by.epam.ayem.javacollections.main.model.TaxiCar;
import by.epam.ayem.javacollections.main.model.TaxiCompany;

import java.util.Scanner;

/**
 * @author Aleh Yemelyanchyk on 11/11/2019.
 */
public class TaxiCompanyService {

    private Scanner scanner = new Scanner(System.in);

    public void addTaxi(TaxiCompany taxiCompany, TaxiCar taxiCar) {
        taxiCompany.getTaxiCars().add(taxiCar);
    }

    public void removeTaxi(TaxiCompany taxiCompany, TaxiCar taxiCar) {
        taxiCompany.getTaxiCars().remove(taxiCar);
    }

    public void countCostAllTaxi(TaxiCompany taxiCompany) {
        int cost = 0;
        for (TaxiCar car : taxiCompany.getTaxiCars()) {
            cost += car.getPrice();
        }
        System.out.println("Total cost of the taxi park is " + cost);
    }

    private void showAllTaxi(TaxiCompany taxiCompany) {
        for (TaxiCar car : taxiCompany.getTaxiCars()) {
            System.out.println(car);
        }
    }

    public void sortByFuelConsumption(TaxiCompany taxiCompany) {
        boolean quit = false;

        while (!quit) {
            quit = true;

            for (int i = 1; i < taxiCompany.getTaxiCars().size(); i++) {
                TaxiCar car = taxiCompany.getTaxiCars().get(i);
                TaxiCar carPrevious = taxiCompany.getTaxiCars().get(i - 1);
                if (car.getFuelConsumptionPer100miles() < carPrevious.getFuelConsumptionPer100miles()) {
                    taxiCompany.getTaxiCars().set(i - 1, car);
                    taxiCompany.getTaxiCars().set(i, carPrevious);
                    quit = false;
                }
            }
        }
        showAllTaxi(taxiCompany);
    }

    public void findBySpeed(TaxiCompany taxiCompany) {
        System.out.println("Speed from: ");
        int speedFrom = readInt();
        System.out.println("Speed to: ");
        int speedTo = readInt();
        for (TaxiCar car : taxiCompany.getTaxiCars()) {
            int speed = car.getSpeed();
            if (speed >= speedFrom && speed <= speedTo) {
                System.out.println(car);
            }
        }
    }

    private int readInt() {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }
}
