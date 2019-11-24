package by.epam.ayem.javafundamentals.main;

import java.util.Scanner;

//1. Приветствовать любого пользователя при вводе его имени через командную строку.
//New line

/**
 * @author Aleh Yemelyanchyk on 11/8/2019.
 */

public class Task01 {

    public static void main(String[] args) {
        System.out.println("Enter user's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
}
