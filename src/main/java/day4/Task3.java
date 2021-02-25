package day4;

public class Task3 {
    public static void main(String[] args) {

        int maxSum = 0;
        int maxIndex = 0;
        int[][] matrix = new int[12][8];

        for (int m = 0; m < matrix.length; m++) {
            int sum = 0;
            for (int n = 0; n < matrix[m].length; n++) {
                matrix[m][n] = (int) Math.round((Math.random() * 50));
                sum += matrix[m][n];

                if (sum >= maxSum) {
                    maxSum = sum;
                    maxIndex = m;
                }
            }
        }

        System.out.println();
        System.out.println(maxSum);
        System.out.println(maxIndex);

    }
}
