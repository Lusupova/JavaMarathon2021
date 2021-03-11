package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file_day14");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner  = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");


            if (numbersString.length != 10) {
                throw new Exception();
            }
            int[] numbers = new int[10];
            int counter = 0;
            int summ = 0;

            for (String nb : numbersString) {
                numbers[counter] = Integer.parseInt(nb);
                summ += numbers[counter];

                counter++;
            }
            scanner.close();
            System.out.println(summ);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e1) {
            System.out.println("Некорректный входной файл");
        }

    }
}
