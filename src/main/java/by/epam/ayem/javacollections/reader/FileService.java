package by.epam.ayem.javacollections.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * @author Aleh Yemelyanchyk on 11/13/2019.
 */
public class FileService {

    public void writeObjectsToFile(List<String> list, String fileName) {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            for (String str : list) {
                out.writeObject(str);
            }
        } catch (IOException e) {
            System.out.println("File was not created");
        }
    }

    public List<String> readObjectsFromFile(String fileName) {
        List<String> list = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
            boolean endOfFile = false;
            while (!endOfFile) {
                String str = (String) in.readObject();
                if (str != null) {
                    list.add(str);
                } else {
                    endOfFile = true;
                }
            }
        } catch (EOFException e) {
            System.out.println("File has been ended");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Class not found", e);
        } catch (IOException e) {
            throw new UncheckedIOException("File not found", e);
        }
        return list;
    }

    public Set<String> readUniqueWordsFromFile(String fileName) {
        Set<String> set = new HashSet<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String c;
            while ((c = bufferedReader.readLine()) != null) {
                String[] words = c.split("[\\W&&[^']]");
                for (String word : words) {
                    set.add(word.toLowerCase());
                }
            }
        } catch (IOException e) {
            throw new UncheckedIOException("File not found", e);
        }
        return set;
    }
}
