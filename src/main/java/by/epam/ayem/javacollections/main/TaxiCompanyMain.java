package by.epam.ayem.javacollections.main;

//Задание. Создать консольное приложение, удовлетворяющее следующим требованиям:
//
//  - Каждый класс должен иметь отражающее смысл название и информативный состав.
//  - Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
//  - Наследование должно применяться только тогда, когда это имеет смысл.
//  - При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//  - Классы должны быть грамотно разложены по пакетам
//  - Консольное меню должно быть минимальным.
//  - Для хранения параметров инициализации можно использовать файлы.
//
//10. Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк.
//Подсчитать стоимость автопарка. Провести сортировку автомобилей парка по расходу топлива.
//Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.

import by.epam.ayem.javacollections.main.model.*;
import by.epam.ayem.javacollections.main.service.TaxiCompanyRepository;
import by.epam.ayem.javacollections.main.service.TaxiCompanyService;

import java.util.Scanner;

/**
 * @author Aleh Yemelyanchyk on 11/10/2019.
 */
public class TaxiCompanyMain {

    private static final int SHOW_FULL_COST = 1;
    private static final int SORT_BY_FUEL_CONSUMPTION = 2;
    private static final int FIND_BY_MAX_SPEED_RANGE = 3;
    private static final int QUIT = 0;

    private final static String FILE_NAME = "TaxiCars.txt";
    private Scanner scanner = new Scanner(System.in);
    private TaxiCompanyService taxiCompanyService = new TaxiCompanyService();
    private TaxiCompany taxiCompany = new TaxiCompany();
    private TaxiCompanyRepository taxiCompanyRepository = new TaxiCompanyRepository();

    public void run() {
        System.out.println("Welcome to the taxi park service!");
        taxiCompany.setTaxiCars(taxiCompanyRepository.readObjects(FILE_NAME));

//        taxiCompanyService.addTaxi(taxiCompany, new Sedan("Toyota", 5, 25000,
//                6.3, 210, FuelType.DIESEL, 5, 1.2,
//                ComfortTypes.COMFORT, SedanTypes.HARDTOP));
//
//        taxiCompanyService.addTaxi(taxiCompany, new Sedan("Toyota", 4, 35000,
//                7.0, 250, FuelType.GASOLINE, 15, 2.5,
//                ComfortTypes.PREMIUM, SedanTypes.FASTBACK));
//
//        taxiCompanyService.addTaxi(taxiCompany, new Sedan("Nissan", 5, 20000,
//                5.4, 200, FuelType.GAS, 3, 1.0,
//                ComfortTypes.COMFORT, SedanTypes.HATCHBACK));
//
//        taxiCompanyService.addTaxi(taxiCompany, new Minivan("Toyota", 6, 30000,
//                5.2, 180, FuelType.DIESEL, 6, 1.2,
//                "Toyota NBC"));
//
//        taxiCompanyService.addTaxi(taxiCompany, new Minivan("Nissan", 6, 30000,
//                5.1, 190, FuelType.GASOLINE, 6, 1.3,
//                "Nissan B"));
//
//        taxiCompanyService.addTaxi(taxiCompany, new Van("Toyota", 11, 50000,
//                7.2, 175, FuelType.GAS, 10, 1.7,
//                VanTypes.FULL_SIZE));
//
//        taxiCompanyService.addTaxi(taxiCompany, new Van("Hyundai", 11, 54000,
//                7.0, 180, FuelType.GAS, 10, 1.6,
//                VanTypes.STEP));

        boolean quit = false;
        while (!quit) {
            System.out.println("Make a choice: \n" +
                    "1. Taxi park full cost. \n" +
                    "2. Sort cars by fuel consumption. \n" +
                    "3. Find car by max speed range. \n" +
                    "0. Quit.");

            int userChoice = readInt();
            switch (userChoice) {
                case SHOW_FULL_COST:
                    taxiCompanyService.countCostAllTaxi(taxiCompany);
                    break;
                case SORT_BY_FUEL_CONSUMPTION:
                    taxiCompanyService.sortByFuelConsumption(taxiCompany);
                    break;
                case FIND_BY_MAX_SPEED_RANGE:
                    taxiCompanyService.findBySpeed(taxiCompany);
                    break;
                case QUIT:
                    taxiCompanyRepository.writeObjects(taxiCompany.getTaxiCars(), FILE_NAME);
                    quit = true;
                    break;

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


