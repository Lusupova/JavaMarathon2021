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

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}

