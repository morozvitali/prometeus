package prometheus.olimpiatasks.number25;

import java.time.Duration;
import java.time.LocalDateTime;

public class InputServiceProxyProfiler extends ConsoleInputService {
    @Override
    public Integer getInteger() {
        LocalDateTime start = LocalDateTime.now();
        try {
            return super.getInteger();
        } finally {
            LocalDateTime end = LocalDateTime.now();
            Duration duration = Duration.between(start, end);
            System.out.printf("Waiting %.3f seconds for user input%n", duration.toMillis() / 1000.0);
        }
    }
}

