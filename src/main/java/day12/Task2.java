package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        for (int j = 300; j <= 350; j++) {
            if (j % 2 == 0) {
                evenNumbers.add(j);
            }
        }

        System.out.println(evenNumbers);


    }
}
