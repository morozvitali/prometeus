package prometheus.olimpiatasks.number25;

public class Main {
    public static void main(String[] args) {
        InputService inputService = new InputServiceProxyProfiler();

        int input = inputService.getInteger();
        System.out.printf("Input: %d", input);
    }
}

