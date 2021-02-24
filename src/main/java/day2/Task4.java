package day2;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число x:");
        Scanner number = new Scanner(System.in);
        double x = number.nextDouble();

        double y = 0;
        if (x >= 5) {
            y = ((pow(x, 2) - 10) / (x + 7));
        } else if (x > -3 && x < 5) {
            y = ((x + 3) * (pow(x, 2) - 2));
        } else {
            y = 420;
        }
        System.out.println(y);
    }
}
