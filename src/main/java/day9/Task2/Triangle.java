package day9.Task2;

public class Triangle extends Figure {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(int a, int b, int c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        double s = p * (p - this.a) * (p - this.b) * (p - this.c);
        return Math.pow(s, 0.5);
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
