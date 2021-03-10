package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file = new File("people");

        System.out.println(parseFileToStringList(file));

    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] peopleString = line.split(" ");
                if (Integer.parseInt(peopleString[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }
            scanner.close();

            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e1) {
            System.out.println("Некорректный входной файл");
        }
        return null;

    }
}
