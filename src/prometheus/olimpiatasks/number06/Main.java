package prometheus.olimpiatasks.number06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array's size: ");
        int size = scanner.nextInt();

        int[][] array = new int[size][size];

        System.out.println("Generating array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (Math.random() * 101);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Snaked array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    System.out.print(array[i][j] + "\t");
                } else {
                    System.out.print(array[i][size - j - 1] + "\t");
                }
            }
        }
    }
}