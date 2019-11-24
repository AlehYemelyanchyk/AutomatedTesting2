package by.epam.ayem.javafundamentals.optionaltask1;

//2.Вывести числа в порядке возрастания(убывания)значений их длины.

/**
 * @author Aleh Yemelyanchyk on 11/9/2019.
 */
public class Task02 {

    public void printNumbersIncreasingOrderByLength(String[] arrayStr) {
        boolean quit = false;

        while (!quit) {
            quit = true;
            for (int i = 1; i < arrayStr.length; i++) {
                if (arrayStr[i].length() < arrayStr[i - 1].length()) {
                    String temp = arrayStr[i - 1];
                    arrayStr[i - 1] = arrayStr[i];
                    arrayStr[i] = temp;
                    quit = false;
                }
            }
        }
        System.out.println("Numbers are in an increasing order by length: ");
        printArray(arrayStr);
    }

    public void printNumbersDecreasingOrderByLength(String[] arrayStr) {
        boolean quit = false;

        while (!quit) {
            quit = true;
            for (int i = 1; i < arrayStr.length; i++) {
                if (arrayStr[i].length() > arrayStr[i - 1].length()) {
                    String temp = arrayStr[i - 1];
                    arrayStr[i - 1] = arrayStr[i];
                    arrayStr[i] = temp;
                    quit = false;
                }
            }
        }
        System.out.println("Numbers are in a decreasing order by length: ");
        printArray(arrayStr);
    }

    private void printArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println("");
    }
}
