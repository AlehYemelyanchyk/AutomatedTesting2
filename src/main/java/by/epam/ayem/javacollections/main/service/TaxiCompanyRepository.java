package by.epam.ayem.javacollections.main.service;

import by.epam.ayem.javacollections.main.model.TaxiCar;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleh Yemelyanchyk on 11/12/2019.
 */
public class TaxiCompanyRepository {

    public void writeObjects(List<TaxiCar> taxiCars, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            for (TaxiCar car : taxiCars) {
                out.writeObject(car);
            }
        } catch (IOException e) {
            System.out.println("File can not be opened.");
        }
    }

    public List<TaxiCar> readObjects(String fileName) {
        List<TaxiCar> taxiCars = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            boolean endOfFile = false;
            while (!endOfFile) {
                TaxiCar car = (TaxiCar) in.readObject();
                if (car != null) {
                    taxiCars.add(car);
                } else {
                    endOfFile = true;
                }
            }
        } catch (EOFException e) {
            System.out.println("File has been ended");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class not found", e);
        } catch (IOException e) {
            throw new UncheckedIOException("File not found", e);
        }
        return taxiCars;
    }
}
