package day11.task1;

public class Courier implements Worker {
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Courier(Warehouse warehouse) {

        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 100;

        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() == 10000) {
            salary = salary + 50000;
            isPayed = true;
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Courier with " + "salary : " + salary ;
    }
}
