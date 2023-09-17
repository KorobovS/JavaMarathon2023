package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %s, длина: %s, вес: %s, количество топлива в баке: %s%n", this.getProducer(), this.getYear(), this.getLength(), this.getWeight(), this.getFuel());
    }

    public void fillUp(int col) {
        this.fuel += col;
    }
}
