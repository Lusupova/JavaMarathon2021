package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) {

        HashMap<Integer, Point> taxi = new HashMap<>();
        try {
            File file = new File("src/main/resources/taxi_cars.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                int[] taxiCar = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                taxi.put(taxi.hashCode(), new Point(taxiCar[1], taxiCar[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(taxi);

        //
        System.out.println("Введите x1:");
        Scanner x1 = new Scanner(System.in);
        int inputedX1 = x1.nextInt();
        System.out.println("Введите y1:");
        Scanner y1 = new Scanner(System.in);
        int inputedY1 = y1.nextInt();
        System.out.println("Введите x2:");
        Scanner x2 = new Scanner(System.in);
        int inputedX2 = x2.nextInt();
        System.out.println("Введите y2:");
        Scanner y2 = new Scanner(System.in);
        int inputedY2 = y2.nextInt();


        int minX = Math.min(inputedX1, inputedX2);
        int maxX = Math.max(inputedX1, inputedX2);
        int minY = Math.min(inputedY1, inputedY2);
        int maxY = Math.max(inputedY1, inputedY2);


        List<Map.Entry<Integer, Point>> taxies = (new LinkedList<>(taxi.entrySet()))
                .stream()
                .filter(i -> i.getValue().getX() >= minX && i.getValue().getX() <= maxX && i.getValue().getY() >= minY && i.getValue().getY() <= maxY)
                .collect(Collectors.toList());

        System.out.println(taxies);
    }
}

