package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2007);
        car.setColor("Red");
        car.setModel("VW Polo");

        System.out.println("Год выпуска автомобииля: " + car.getYear());
        System.out.println("Цвет автомобиля: " + car.getColor());
        System.out.println("Модель автомобиля: " + car.getModel());

    }
}


