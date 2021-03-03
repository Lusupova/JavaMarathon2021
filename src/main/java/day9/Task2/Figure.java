package day9.Task2;

public abstract class Figure {
//    //        Создайте абстрактный класс Фигура (англ. Figure). Этот класс будет являться абстрактным представлением геометрической фигуры в нашей программе.
////У всех фигур в нашей программе есть цвет, поэтому в классе Фигура есть строковое поле color. Создайте конструктор и геттер для этого поля.
////У класса Фигура определены два абстрактных метода:
////public abstract double area();
////public abstract double perimeter();
////Реализация первого метода должна возвращать площадь фигуры, а реализация второго метода должна возвращать периметр фигуры.

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();
}
