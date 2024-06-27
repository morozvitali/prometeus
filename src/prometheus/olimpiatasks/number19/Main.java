package prometheus.olimpiatasks.number19;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        BirthdayService birthdayService = new BirthdayServiceImpl();

        LocalDate birthDate = LocalDate.of(2003, 6, 23);
        LocalDateTime now = LocalDateTime.now();

        Duration duration = birthdayService.findDurationTillNextBirthday(birthDate, now);

        System.out.printf("To next birthday: days: %d, hours: %d, minutes: %d, seconds: %d",
                duration.toDaysPart(),
                duration.toHoursPart(),
                duration.toMinutesPart(),
                duration.toSecondsPart()
        );
    }
}

