package by.epam.ayem.javafundamentals.main;

import java.util.Scanner;

//4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
// и вывести результат на консоль.

/**
 * @author Aleh Yemelyanchyk on 11/8/2019.
 */

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        countSum(numbers);
        countMult(numbers);
    }

    private static void countSum(String numbers) {
        String[] array = numbers.split(" ");
        int sum = 0;
        for (String str : array) {
            sum += Integer.valueOf(str);
        }
        System.out.println("Sum of numbers is " + sum);
    }

    private static void countMult(String numbers) {
        String[] array = numbers.split(" ");
        int mult = Integer.valueOf(array[0]);
        for (int i = 1; i < array.length; i++) {
            mult *= Integer.valueOf(array[i]);
        }
        System.out.println("Multiplication of numbers is " + mult);
    }
}
