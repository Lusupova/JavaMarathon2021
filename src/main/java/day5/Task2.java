package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(2020, "Green", "Suzuki");
        System.out.println("Год выпуска мотоцикла: " + motorbike.getYear());
        System.out.println("Цвет мотоцикла: " + motorbike.getColor());
        System.out.println("Модель мотоцикла: " + motorbike.getModel());
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;


    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
