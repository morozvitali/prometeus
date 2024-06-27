package prometheus.olimpiatasks.number03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program to solve an equation Ax^2 + B*x + C = 0");
        System.out.print("Please, enter A: ");
        double a = scanner.nextDouble();
        System.out.print("Please, enter B: ");
        double b = scanner.nextDouble();
        System.out.print("Please, enter C: ");
        double c = scanner.nextDouble();
        //PUT YOUR CODE HERE

        int countOfSolutions; //-1 if infinity;
        double x1 = 0, x2 = 0;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    countOfSolutions = -1;
                } else {
                    countOfSolutions = 0;
                }
            } else {
                countOfSolutions = 1;
                x1 = -c / b;
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d < 0) {
                countOfSolutions = 0;
            } else if (d == 0) {
                countOfSolutions = 1;
                x1 = -b / (2 * a);
            } else {
                countOfSolutions = 2;
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
            }
        }

        String result = "Equation " + a + "x^2 + " + b + "*x + " + c + " = 0 has ";
        switch (countOfSolutions) {
            case -1: {
                System.out.println(result + "infinity solutions.");
                break;
            }
            case 0: {
                System.out.println(result + "zero solutions.");
                break;
            }
            case 1: {
                System.out.println(result + "one solution: x = " + x1);
                break;
            }
            case 2: {
                System.out.println(result + "two solutions: x1 = " + x1 + ", x2 = " + x2);
                break;
            }
        }
    }
}
