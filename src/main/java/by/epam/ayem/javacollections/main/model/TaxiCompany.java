package by.epam.ayem.javacollections.main.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleh Yemelyanchyk on 11/11/2019.
 */
public class TaxiCompany {

    private List<TaxiCar> taxiCars = new ArrayList<>();

    public List<TaxiCar> getTaxiCars() {
        return taxiCars;
    }

    public void setTaxiCars(List<TaxiCar> taxiCars) {
        this.taxiCars = taxiCars;
    }
}
