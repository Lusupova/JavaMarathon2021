package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
//В папке resources находится файл numbers19.txt. Этот файл содержит в себе 500.000 случайных целых чисел от 1 до миллиарда (каждое число находится на новой строке).
// Вам необходимо прочитать этот файл и, используя структуру данных HashSet, подсчитать, сколько чисел из файла лежат в диапазоне от 500.000.000 до 600.000.000 включительно.
// Количество таких чисел необходимо вывести в консоль. Вы можете попробовать решить эту задачу с помощью ArrayList’а и убедиться,
// что с помощью этой структуры данных задача не решается за разумное время. Поэтому, необходимо использовать структуру данных HashSet,
// которая позволяет мгновенно проверять наличие конкретного элемента внутри себя благодаря процедуре хэширования (см. урок про устройство HashMap).

        File file_numbers = new File("src/main/resources/numbers19.txt");

        Set<Integer> numbersSet = new HashSet<>();

        try {
            Scanner scanner = new Scanner(file_numbers);

            while (scanner.hasNext()) {
                String num = scanner.next();
                numbersSet.add(Integer.parseInt(num));
            }
            //       System.out.println(numbersSet);
            int count = 0;

            for (int n : numbersSet) {
                if (n >= 500000000 && n <= 600000000) {
                    // System.out.println(n);
                    count++;
                }
            }

            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

