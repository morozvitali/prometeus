package prometheus.olimpiatasks.number16;

import java.util.Scanner;

public class SuperScannerTest {
    public static void main(String[] args) {
        SuperScanner superScanner1 = SuperScanner.getInstance();
        SuperScanner superScanner2 = SuperScanner.getInstance();

        System.out.println("Are superScanner1 and superScanner2 the same objects: " + (superScanner1 == superScanner2));

        String input = superScanner1.readLine();
        System.out.println("Your input is " + input);
    }
}


