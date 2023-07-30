package log;

import java.time.LocalDateTime;

public interface Logger {
    static void log(String string) {
        System.err.printf("%n%s : %s%n", LocalDateTime.now(), string);
    }
}
