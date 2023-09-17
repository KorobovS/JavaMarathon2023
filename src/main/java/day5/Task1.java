package day5;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setYear(2001);
        lada.setColor("blue");
        lada.setModel("vaz-2110");
        System.out.println("Год выпуска - " + lada.getYear());
        System.out.println("Цвет - " + lada.getColor());
        System.out.println("Модель - " + lada.getModel());
    }
}
