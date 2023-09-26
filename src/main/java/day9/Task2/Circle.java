package day9.Task2;

public class Circle extends Figure {
    private final double r;

    public Circle(int r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * this.r;
    }
}
