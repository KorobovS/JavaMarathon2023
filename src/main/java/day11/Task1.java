package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);
        for (int i = 0; i < 1_500; i++) {
            picker.doWork();
//            System.out.println("Зарплата сборщика: " + picker.getSalary());
//            System.out.println("Количество на скалде: " + warehouse.getCountOrder());
        }
        for (int i = 0; i < 1_000; i++) {
            courier.doWork();
//            System.out.println("Зарплата доставщика: " + courier.getSalary());
//            System.out.println("Баланс склада: " + warehouse.getBalance());
        }
    }
}
