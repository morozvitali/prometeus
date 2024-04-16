package Tasks.number09.variant1;

public class TriangleService {
    //PUT YOUR CODE HERE
    public double calculateArea(Triangle triangle) {


        double a = triangle.sideA;
        System.out.println(a);

        double b = triangle.sideB;
        System.out.println(b);

        double c = triangle.sideC;
        System.out.println(c);

        double p = (a+b+c) / 2;
        System.out.println(p);

        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("площа трикутника " + s);
        return s;
    }
}