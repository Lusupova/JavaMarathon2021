package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("file_day14");
        printResult(file);
    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            int summ = 0;

            for (String nb : numbersString) {
                summ += Integer.parseInt(nb);
            }

            scanner.close();
            double avrg = summ / (float) numbersString.length;
            System.out.println(avrg);
            System.out.printf("%.3f", avrg);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}

