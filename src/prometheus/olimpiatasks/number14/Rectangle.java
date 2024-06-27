package prometheus.olimpiatasks.number14;

public class Rectangle extends Shape {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateSquare() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB;
    }
}
