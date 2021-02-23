package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите перове число :");
        Scanner firstNumber = new Scanner(System.in);
        int a = firstNumber.nextInt();

        System.out.println("Введите второе число :");
        Scanner secondNumber = new Scanner(System.in);
        int b = secondNumber.nextInt();

        int i = a + 1;
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            } else if (a >= b) {
                System.out.println("Некорректный ввод");
            }
            i++;
        }
    }
}
