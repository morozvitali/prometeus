package prometheus.olimpiatasks.number16;

import java.util.Scanner;

public final class SuperScanner {
    private static SuperScanner superScanner;

    private final Scanner scanner = new Scanner(System.in);

    private SuperScanner() {}

    public static SuperScanner getInstance() {
        if (superScanner == null) {
            superScanner = new SuperScanner();
        }
        return superScanner;
    }

    public String readLine() {
        System.out.print("Reading..: ");
        return scanner.nextLine();
    }
}
