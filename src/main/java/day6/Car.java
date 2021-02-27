package day6;

public class Car {

        private int year;
        private String color;
        private String model;

    public Car(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;

    }

        public void setYear(int year) {
            this.year = year;
        }

        public void getInfo(){
            System.out.println("This is auto");
        }

        public int yearDifference(int inputYear){
            return Math.abs(inputYear - this.year);
        }

    }
