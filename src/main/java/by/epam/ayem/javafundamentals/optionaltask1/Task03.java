package by.epam.ayem.javafundamentals.optionaltask1;

//3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам,
// а также длину.

/**
 * @author Aleh Yemelyanchyk on 11/9/2019.
 */
public class Task03 {

    public void printNumbersWithLengthShorterThenAverage(String[] arrayStr) {
        int averageLength = getAverageNumberLength(arrayStr);
        System.out.println("Numbers are shorter than the average length (" + averageLength + "): ");

        for (String str : arrayStr) {
            if (str.length() < averageLength) {
                System.out.print(str + "(" + str.length() + ") ");
            }
        }
        System.out.println("");
    }

    public void printNumbersWithLengthLongerThenAverage(String[] arrayStr) {
        int averageLength = getAverageNumberLength(arrayStr);
        System.out.println("Numbers are longer than the average length (" + averageLength + "): ");

        for (String str : arrayStr) {
            if (str.length() > averageLength) {
                System.out.print(str + "(" + str.length() + ") ");
            }
        }
        System.out.println("");
    }

    private int getAverageNumberLength(String[] arrayStr) {
        int lengthSum = 0;

        for (int i = 0; i < arrayStr.length; i++) {
            lengthSum += arrayStr[i].length();
        }
        return lengthSum / arrayStr.length;
    }
}
