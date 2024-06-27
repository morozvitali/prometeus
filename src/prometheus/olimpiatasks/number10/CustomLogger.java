package prometheus.olimpiatasks.number10;


import java.util.Date;

public class CustomLogger {
    static int DEBUG_MODE = 0;
    static int INFO_MODE = 1;
    static int WARN_MODE = 2;
    static int ERROR_MODE = 3;

    String loggerName;
    int mode;

    CustomLogger(String loggerName, int mode) {
        this.loggerName = loggerName;
        this.mode = mode;
    }

    void debug(String message) {
        if (mode <= DEBUG_MODE) {
            System.out.println(loggerName + "\t" + "DEBUG\t" + message);
        }
    }

    void info(String message) {
        if (mode <= INFO_MODE) {
            log(message, INFO_MODE);
        }
    }

    void warn(String message) {
        if (mode <= WARN_MODE) {
            log(message, WARN_MODE);
        }
    }

    void error(String message) {
        if (mode <= ERROR_MODE) {
            log(message, ERROR_MODE);
        }
    }

    void log(String message, int mode) {
        String modeName;
        if (mode == DEBUG_MODE) {
            modeName = "DEBUG";
        } else if (mode == INFO_MODE) {
            modeName = "INFO";
        } else if (mode == WARN_MODE) {
            modeName = "WARN";
        } else if (mode == ERROR_MODE) {
            modeName = "ERROR";
        } else {
            System.out.println("There is no such mode: " + mode);
            return;
        }

        System.out.println(new Date() + "\t[" + loggerName + "]\t" + modeName + "\t: " + message);
    }
}