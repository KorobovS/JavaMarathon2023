package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane kuku = new Airplane("USSR", 1947, 12, 3400);
        Airplane kuk = new Airplane("RUS", 2001, 13, 3600);
        Airplane.compareAirplanes(kuku, kuk);
    }
}