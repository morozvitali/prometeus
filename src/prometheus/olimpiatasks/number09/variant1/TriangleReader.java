package prometheus.olimpiatasks.number09.variant1;

import java.util.Scanner;

public class TriangleReader {
    Scanner scanner = new Scanner(System.in);

    public Triangle readTriangle() {
        double[] array = new double[3];

        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.printf("Please enter size of side '%c': ", i + 97);
                double value = scanner.nextDouble();
                if (value <= 0) {
                    System.out.println("Triangle side should be a positive number, please try again");
                } else {
                    array[i] = value;
                    break;
                }
            }
        }

        double a = array[0];
        double b = array[1];
        double c = array[2];

        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("The sum of any two sides should be greater than the third side, please try again");
            readTriangle();
        }
        return new Triangle(a, b, c);
    }
}