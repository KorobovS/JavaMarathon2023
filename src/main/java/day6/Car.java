package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int number) {
        year = number;
    }
    public void setColor(String str) {
        color = str;
    }
    public void setModel(String str) {
        model =  str;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int number) {
        return this.year - number;
    }
}
