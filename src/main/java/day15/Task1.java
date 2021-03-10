package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/main/resources/shoes.csv");

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");
                if (Integer.parseInt(shoes[2]) == 0) {
                    pw.println(shoes[0] + ";" + shoes[1] + ";" + shoes[2]);
                }
            }
            scanner.close();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

}
