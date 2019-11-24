package by.epam.ayem.javafundamentals.main;

import java.util.Scanner;

//2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

/**
 * @author Aleh Yemelyanchyk on 11/8/2019.
 */


public class Task02 {
    public static void main(String[] args) {
        System.out.println("Enter arguments:");
        Scanner scanner = new Scanner(System.in);
        String revertedArgs = revertArgs(scanner.nextLine());
        System.out.println(revertedArgs);

    }

    private static String revertArgs(String args) {
        StringBuilder revertedArgs = new StringBuilder();
        String[] arrayArgs = args.split(" ");
        String[] reverted = new String[arrayArgs.length];
        for (int j = reverted.length - 1; j >= 0; j--) {
            revertedArgs.append(arrayArgs[j] + " ");
        }
        return revertedArgs.toString();
    }
}
