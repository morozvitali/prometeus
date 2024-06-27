package prometheus.olimpiatasks.number25;

import java.util.Scanner;

public class ConsoleInputService implements InputService {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public Integer getInteger() {
        return scanner.nextInt();
    }
}