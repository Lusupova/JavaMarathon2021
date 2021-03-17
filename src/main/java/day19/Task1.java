package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {

        File file_dushi = new File("src/main/resources/dushi.txt");

        HashMap<String, Integer> wordsOccur = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file_dushi);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");

            while (scanner.hasNext()) {
                String textString = scanner.next();

                textString.toLowerCase();
                if (wordsOccur.containsKey(textString)) {
                    wordsOccur.put(textString, wordsOccur.get(textString) + 1);
                } else {
                    wordsOccur.put(textString, 1);
                }
            }

            List<Map.Entry<String, Integer>> list = (new LinkedList<>(wordsOccur.entrySet()))
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .limit(100)
                    .collect(Collectors.toList());

            System.out.println(list);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}

