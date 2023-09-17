package day6;

public class Task1 {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.setYear(2001);
        lada.setColor("blue");
        lada.setModel("vaz-2110");
        System.out.println("Год выпуска - " + lada.getYear());
        System.out.println("Цвет - " + lada.getColor());
        System.out.println("Модель - " + lada.getModel());
        lada.info();
        System.out.println(lada.yearDifference(2023));

        System.out.println("***********************************");

        Motorbike voshod = new Motorbike(1988, "orange", "3m-01");
        System.out.println("Год выпуска - " + voshod.getYear());
        System.out.println("Цвет - " + voshod.getColor());
        System.out.println("Модель - " + voshod.getModel());
        voshod.info();
        System.out.println(voshod.yearDifference(2023));
    }
}
