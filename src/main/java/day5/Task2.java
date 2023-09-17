package day5;

public class Task2 {
    public static void main(String[] args) {
        Motobike voshod = new Motobike(1988, "orange", "3m-01");
        System.out.println("Год выпуска - " + voshod.getYear());
        System.out.println("Цвет - " + voshod.getColor());
        System.out.println("Модель - " + voshod.getModel());
    }
}
