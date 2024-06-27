package prometheus.olimpiatasks.number19;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface BirthdayService {
    Duration findDurationTillNextBirthday(LocalDate birthDate, LocalDateTime now);
}
