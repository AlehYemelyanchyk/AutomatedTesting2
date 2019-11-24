package by.epam.ayem.javafundamentals.optionaltask1;

//Для успешного выполнения задания достаточно реализовать 2-4 пункта.
//
//        Задание. Ввести n чисел с консоли.
//
//        1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
//        2. Вывести числа в порядке возрастания (убывания) значений их длины.
//        3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем
//        числам, а также длину.
//        4. Найти число, в котором количество различных цифр минимально. Если таких чисел
//        несколько, найти первое
//        из них.

import java.util.Scanner;

/**
 * @author Aleh Yemelyanchyk on 11/9/2019.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        String[] arrayStr = scanner.nextLine().split(" ");

        System.out.println("Task 01:");
        Task01 task01 = new Task01();
        task01.printShortestNumber(arrayStr);
        task01.printLongestNumber(arrayStr);

        System.out.println("Task 02:");
        Task02 task02 = new Task02();
        task02.printNumbersDecreasingOrderByLength(arrayStr);
        task02.printNumbersIncreasingOrderByLength(arrayStr);

        System.out.println("Task 03:");
        Task03 task03 = new Task03();
        task03.printNumbersWithLengthLongerThenAverage(arrayStr);
        task03.printNumbersWithLengthShorterThenAverage(arrayStr);

        System.out.println("Task 04:");
        Task04 task04 = new Task04();
        task04.printFirstNumberWithLeastUniqueDigits(arrayStr);
    }
}
