package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("boeing", 1990, 20000, 60000);
        airplane.setYear(2010);
        airplane.setLength(440);
        airplane.fillUp(500);
        airplane.fillUp(900);
        airplane.getInfo();
    }
}
