package day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
        if (warehouse.getCountOrder() % 1500 == 0 ) {
            this.bonus();
        }
    }

    @Override
    public void bonus() {
        this.salary *= 3;
//        System.out.println("БОНУС сборщика");
    }
}
