package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        int amountOfElements = 0;
        int sumElements = 0;
        int max = 0;
        int min = 1000;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round((Math.random() * 1000));
        }
        for (int j : numbers) {
            if (j % 10 == 0) {
                amountOfElements++;
                sumElements = sumElements + j;
            }
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
//        int max = Arrays.stream(numbers).max().getAsInt();
//        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + amountOfElements);
        System.out.println("Суммa элементов массива, оканчивающихся на 0: " + sumElements);
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива:" + min);
        System.out.println(Arrays.toString(numbers));

    }

}




