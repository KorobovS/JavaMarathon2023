package day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1_000);
        if (warehouse.getBalance() % 1_000_000 == 0) {
            this.bonus();
        }
    }

    @Override
    public void bonus() {
        this.salary *= 2;
//        System.out.println("БОНУС доставщика");
    }
}
