package day11.task1;

public class Picker implements Worker {
    //  Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет), get методами для обоих полей, методом toString() и конструктором.

    Warehouse warehouse;
    private int salary;
    private boolean isPayed;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary = salary + 80;

        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() == 10000) {
            salary = salary + 70000;
            isPayed = true;
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }

    public String toString() {
        return " ";

    }
}
