package prometheus.olimpiatasks.number10;

public class Main {

    public static void main(String[] args) {
        CustomLogger customLogger = new CustomLogger("test.b.Main class", CustomLogger.DEBUG_MODE);

        customLogger.debug("debug message");
        customLogger.info("info message");
        customLogger.warn("warn message");
        customLogger.error("error message");
    }
}