package prometheus.olimpiatasks.number14;

public class Main {
    public static void main(String[] args) {
        ShapeService shapeService = new ShapeService();
        Shape[] shapes = new Shape[] {
                new Circle(1),
                new Rectangle(2, 4),
                new Triangle(3, 4, 5)
        };

        double summarySquare = shapeService.calculateSummarySquare(shapes);
        double summaryPerimeter = shapeService.calculateSummaryPerimeter(shapes);

        System.out.println("Summary square: " + summarySquare + ", summary perimeter: " + summaryPerimeter);
    }
}

