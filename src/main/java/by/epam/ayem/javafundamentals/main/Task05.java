package by.epam.ayem.javafundamentals.main;

import java.util.Scanner;

//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
//Осуществить проверку корректности ввода чисел.

/**
 * @author Aleh Yemelyanchyk on 11/8/2019.
 */

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Enter a month number: ");
        Scanner scanner = new Scanner(System.in);

        switch (getNumber(scanner)) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Such month does not exist. Try numbers from 1 to 12.");
        }
    }

    private static int getNumber(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();

    }
}
