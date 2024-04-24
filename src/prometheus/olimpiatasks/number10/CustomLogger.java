package prometheus.olimpiatasks.number10;

import java.util.Date;

public class CustomLogger {

    //PUT YOUR CODE HERE

    public static final int DEBUG_MODE = 0;
    public static final int INFO_MODE = 1;
    public static final int WARN_MODE = 2;
    public static final int ERROR_MODE = 3;

    private final String loggerName;
    private final int logLevel;


    CustomLogger (String logerName, int logLevel) {
        this.loggerName = logerName;
        this.logLevel = logLevel;
    }

    private void log(String level, String message) {
        System.out.println(new Date() + "\t[" + loggerName + "]\t" + level + "\t\t: " + message);
    }


    public void debug (String message) {
        if (logLevel <= DEBUG_MODE) {
            log("DEBUG", message);
        }
    }

    public void info (String message) {
        if (logLevel <= INFO_MODE) {
            log("INFO", message);
        }
    }

    public void warn (String message) {
        if (logLevel <= WARN_MODE) {
            log("WARN", message);
        }
    }

    public void error (String message) {
        if (logLevel <= ERROR_MODE) {
            log("ERROR", message);
        }
    }
}


/*
import java.util.Date;

public class CustomLogger {
    public static final int DEBUG_MODE = 0;
    public static final int INFO_MODE = 1;
    public static final int WARN_MODE = 2;
    public static final int ERROR_MODE = 3;

    private final String loggerName;
    private final int logLevel;

    public CustomLogger(String loggerName, int logLevel) {
        this.loggerName = loggerName;
        this.logLevel = logLevel;
    }

    private void log(String level, String message) {
        System.out.println(new Date() + "\t[" + loggerName + "]\t" + level + "\t\t: " + message);
    }

    public void debug(String message) {
        if (logLevel <= DEBUG_MODE) {
            log("DEBUG", message);
        }
    }

    public void info(String message) {
        if (logLevel <= INFO_MODE) {
            log("INFO", message);
        }
    }

    public void warn(String message) {
        if (logLevel <= WARN_MODE) {
            log("WARN", message);
        }
    }

    public void error(String message) {
        if (logLevel <= ERROR_MODE) {
            log("ERROR", message);
        }
    }
}
 */