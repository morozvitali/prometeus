package prometheus.olimpiatasks.number14;

public class ShapeService {
    public double calculateSummaryPerimeter(Shape[] shapes) {
        double sumPerimeter = 0;
        for (Shape shape : shapes) {
            sumPerimeter += shape.calculatePerimeter();
        }
        return sumPerimeter;
    }

    public double calculateSummarySquare(Shape[] shapes) {
        double sumPerimeter = 0;
        for (Shape shape : shapes) {
            sumPerimeter += shape.calculateSquare();
        }
        return sumPerimeter;
    }
}
