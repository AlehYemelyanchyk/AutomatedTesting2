package by.epam.ayem.javacollections.optionaltask1;

import by.epam.ayem.javacollections.reader.FileService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

/**
 * @author Aleh Yemelyanchyk on 11/13/2019.
 */
public class OptionalTask1Run {
    private static FileService fileService = new FileService();
    private static final String FILE_NAME = "List of Strings.txt";

    public static void main(String[] args) {
        List<String> list = fileService.readObjectsFromFile(FILE_NAME);
        Collections.reverse(list);
        fileService.writeObjectsToFile(list, FILE_NAME);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
