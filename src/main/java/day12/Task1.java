package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Nissan");
        cars.add("VW");
        cars.add("Suzuki");
        System.out.println(cars);

        cars.add(3, "Volvo");
        cars.remove(0);

        System.out.println(cars);
    }
}
