package by.epam.ayem.javafundamentals.optionaltask1;

//1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

/**
 * @author Aleh Yemelyanchyk on 10/31/2019.
 */
public class Task01 {

    public void printShortestNumber(String[] arrayStr) {
        String shortest = arrayStr[0];
        for (int i = 0; i < arrayStr.length; i++) {
            String str = arrayStr[i];
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        System.out.println("The first shortest number is " + shortest + " with length = " + shortest.length());
    }

    public void printLongestNumber(String[] arrayStr) {
        String longest = arrayStr[0];
        for (int i = 0; i < arrayStr.length; i++) {
            String str = arrayStr[i];
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println("The first longest number is " + longest + " with length = " + longest.length());
    }

}
