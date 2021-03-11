package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter out = new PrintWriter("file1.txt");
        Random rand = new Random();
        int count = 0;
        int number = 0;
        while (count != 1000) {
            number = rand.nextInt(100);
            out.print(number + " ");
            count++;
        }
        out.close();

        File file1 = new File("file1.txt");
        createFile2(file1);

        File file2 = new File("file2.txt");
        printResult(file2);

    }


    public static void createFile2(File file) {
        try {
            PrintWriter file2 = new PrintWriter("file2.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            int summ = 0;
            float size = 20F;
            for (int i = 0; i < numbersString.length; i++) {
                summ += Integer.parseInt(numbersString[i]);

                if (i % size == 0) {
                    double avg = summ / size;
                    summ = 0;

                    file2.print(avg + " ");
                }
            }
            scanner.close();
            file2.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not exist");
        }

    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            double summ = 0;
            for (String nb : numbersString) {
                summ += Double.parseDouble(nb);
            }

            scanner.close();
            System.out.println((int) summ);

        } catch (FileNotFoundException e) {
            System.out.println("File is not exist");
        }

    }
}



