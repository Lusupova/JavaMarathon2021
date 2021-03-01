package day8;

public class Task2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        StringBuilder sbNumbers = new StringBuilder();
        for (int i = 0; i <= 20; i++) {
            sbNumbers.append(i).append(" ");

        }
        System.out.println(sbNumbers);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        long start2 = System.currentTimeMillis();
        String stringNumbers = "";
        for (int i = 0; i <= 20; i++) {
            stringNumbers += i + " ";
        }
        System.out.println(stringNumbers);
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);

    }

}


