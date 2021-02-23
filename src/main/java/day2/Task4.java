package day2;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число x:");
        Scanner number = new Scanner(System.in);
        double x = number.nextDouble();

        if (x >= 5) {
            System.out.println((pow(x, 2) - 10) / (x + 7));
        } else if (x > -3 && x < 5) {
            System.out.println((x + 3) * (pow(x, 2) - 2));
        } else {
            System.out.println("420");
        }
    }
}
