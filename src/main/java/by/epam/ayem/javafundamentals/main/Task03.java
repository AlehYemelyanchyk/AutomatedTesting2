package by.epam.ayem.javafundamentals.main;

import java.util.Random;
import java.util.Scanner;

//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

/**
 * @author Aleh Yemelyanchyk on 11/8/2019.
 */

public class Task03 {

    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Enter amount of numbers:");
        Scanner scanner = new Scanner(System.in);
        int numbersAmount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <= numbersAmount; i++) {
            System.out.println(random.nextInt() + " ");
        }

        for (int i = 0; i <= numbersAmount; i++) {
            System.out.print(random.nextInt() + " ");
        }
    }
}
