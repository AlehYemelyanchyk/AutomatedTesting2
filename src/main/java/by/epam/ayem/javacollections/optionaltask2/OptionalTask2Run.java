package by.epam.ayem.javacollections.optionaltask2;

//8. Задан файл с текстом на английском языке. Выделить все различные слова.
//Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.


import by.epam.ayem.javacollections.reader.FileService;

import java.util.Arrays;
import java.util.Set;

/**
 * @author Aleh Yemelyanchyk on 11/13/2019.
 */
public class OptionalTask2Run {
    private static FileService fileService = new FileService();
    private static final String FILE_NAME = "Poem.txt";

    public static void main(String[] args) {
       Set<String> words = getList();
        System.out.println(Arrays.toString(words.toArray()));
    }

    private static Set<String> getList() {
        return fileService.readUniqueWordsFromFile(FILE_NAME);
    }

}
