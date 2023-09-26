package day9.Task2;

public class Rectangle extends Figure {
    private final double a;
    private final double h;

    public Rectangle(int a, int h, String color) {
        super(color);
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return this.a * this.h;
    }

    @Override
    public double perimeter() {
        return (this.a + this.h) * 2;
    }
}
