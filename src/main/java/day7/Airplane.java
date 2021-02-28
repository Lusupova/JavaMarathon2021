package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public void getInfo(){
//        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
//    }
//
//    public void fillUp(int n){
//        this.fuel = n;
//    }

    public static void compareAirplanes(Airplane firstAirplane, Airplane secondAirplane){
        if (firstAirplane.length == secondAirplane.length){
            System.out.println("Длины самолетов равны");
        }else if(firstAirplane.length > secondAirplane.length){
            System.out.println("Первый самолет длиннее");
        }else{
            System.out.println("Второй самолет длиннее");
        }

    }
}
