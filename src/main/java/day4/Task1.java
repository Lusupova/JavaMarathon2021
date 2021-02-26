package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        int countAboveEight = 0;
        int equalsOne = 0;
        int countEvenNumbers = 0;
        int counterOddNumbers = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = (int) Math.round((Math.random() * 10));
            sum += numbers[i];
            if (numbers[i] > 8) {
                countAboveEight++;
            }
            if (numbers[i] % 2 == 0) {
                countEvenNumbers++;
            }else if(numbers[i] % 2 != 0) {
                counterOddNumbers++;
            }
            if (numbers[i] == 1) {
                equalsOne++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("");
        System.out.println("Длинна массива: " + numbers.length);
        System.out.println("");
        System.out.println("Количество элементов больше чем 8: " + countAboveEight);
        System.out.println("");
        System.out.println("Количество четных элементов:  " + countEvenNumbers);
        System.out.println("");
        System.out.println("Количество нечетных элементов: " + counterOddNumbers);
        System.out.println("");
        System.out.println("Количество элементов равных 1: " + equalsOne);
        System.out.println("");
        System.out.println("Сумма всех эллементов массива: " + sum);
    }
}
