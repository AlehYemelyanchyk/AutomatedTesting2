package by.epam.ayem.javafundamentals.optionaltask1;

import java.util.HashSet;
import java.util.Set;

//4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько,
// найти первое из них.

/**
 * @author Aleh Yemelyanchyk on 11/9/2019.
 */
public class Task04 {

    public void printFirstNumberWithLeastUniqueDigits(String[] arrayStr) {
        System.out.println("First number with least of unique numbers: ");
        int min = Integer.MAX_VALUE;
        String number = "";

        for (String str : arrayStr) {
            Set<Character> digits = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                digits.add(str.charAt(i));
            }
            if (digits.size() < min) {
                min = digits.size();
                number = str;
            }
        }
        System.out.println(number);
    }
}
