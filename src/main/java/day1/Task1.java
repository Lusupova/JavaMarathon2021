package day1;

import java.util.stream.IntStream;

public class Task1 {
    /*public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.print("JAVA ");
            count++;
        }
    }*/

    // Alternative solution
    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(it -> System.out.println("JAVA "));
    }
}
