package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0, j = 300; (i <= 30 && j <= 350); i++, j++) {
            if (i % 2 == 0 && j % 2 == 0) {
                evenNumbers.add(i);
                evenNumbers.add(j);
            }
        }

        System.out.println(evenNumbers);


    }
}
