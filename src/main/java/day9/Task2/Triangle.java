package day9.Task2;

public class Triangle extends Figure{

    private int firstCathLength;
    private int secondCathlength;
    private int hypotenuseLength;

    public Triangle(int firstCathLength, int secondCathlength, int hypotenuseLength, String color) {
        super(color);
        this.firstCathLength = firstCathLength;
        this.secondCathlength = secondCathlength;
        this.hypotenuseLength = hypotenuseLength;
    }

    @Override
    public double area() {
        double semiPerimeter = (firstCathLength+secondCathlength+hypotenuseLength)/2;
        return Math.sqrt(semiPerimeter*(semiPerimeter-firstCathLength)*(semiPerimeter-secondCathlength)*(semiPerimeter-hypotenuseLength));
    }

    @Override
    public double perimeter() {
        return (firstCathLength+secondCathlength+hypotenuseLength);
    }
}
