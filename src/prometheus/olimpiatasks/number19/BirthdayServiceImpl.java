package prometheus.olimpiatasks.number19;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BirthdayServiceImpl implements BirthdayService {
    @Override
    public Duration findDurationTillNextBirthday(LocalDate birthDate, LocalDateTime now) {
        LocalDate nextBirthday = birthDate.withYear(now.getYear());
        if (!nextBirthday.isAfter(now.toLocalDate())) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        return Duration.between(now, nextBirthday.atStartOfDay());
    }
}


