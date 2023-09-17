package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane kukuruznik = new Airplane("SSSR", 1947, 12, 3400);
        kukuruznik.info();
        kukuruznik.setLength(13);
        kukuruznik.setWeight(3600);
        kukuruznik.fillUp(150);
        kukuruznik.info();
        kukuruznik.fillUp(50);
        kukuruznik.info();
    }
}
