package prometheus.olimpiatasks.number09.variant1;

public class Main {

    public static void main(String[] args) {
        TriangleReader triangleReader = new TriangleReader();
        TriangleService triangleService = new TriangleService();

        Triangle triangle = triangleReader.readTriangle();

        double area = triangleService.calculateArea(triangle);

        System.out.println("Area of triangle with side 'a' = " + triangle.sideA + ", 'b' = " + triangle.sideB
                + ", 'c' = " + triangle.sideC + " is " + area);
    }
}

