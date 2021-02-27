package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car(2008, "green", "BMW");
        car.getInfo();
        int diff = car.yearDifference(2000);
        System.out.println(diff);

        Motorbike motorbike = new Motorbike(2007, "red", "kawasaki");
        motorbike.getInfo();
        motorbike.yearDifference(1990);
        int diff2 = motorbike.yearDifference(1990);
        System.out.println(diff2);
    }
}
