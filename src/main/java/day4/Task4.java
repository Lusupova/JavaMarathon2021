package day4;

public class Task4 {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        int maxSum = 0;
        int firstElementIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round((Math.random() * 10000));
        }

        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                //int currentSum = numbers[i] + numbers[i + 1] + numbers[i + 2];
                sum += numbers[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                firstElementIndex = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(firstElementIndex);
    }
}

