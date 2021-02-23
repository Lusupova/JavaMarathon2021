package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите количество этажей:");
        Scanner stage = new Scanner(System.in);
        int inputedStage = stage.nextInt();

        if (inputedStage >= 1 && inputedStage <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (inputedStage >= 5 && inputedStage <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (inputedStage >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}
