package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        businessProcess(courier);
        businessProcess(picker);

        System.out.println("Количество собранных заказов " + warehouse.getCountPickedOrders() + " Количество доставленных заказов "
                + warehouse.getCountDeliveredOrders() + " Зарплата сборщика " + picker.getSalary() + " Зарплата Курьера  " + courier.getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }


}
