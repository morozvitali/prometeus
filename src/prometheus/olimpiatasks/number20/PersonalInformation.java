package prometheus.olimpiatasks.number20;

import java.time.LocalDate;

public class PersonalInformation {
    private final LocalDate dateOfBirth;
    private final Integer number;
    private final Sex sex;

    public PersonalInformation(LocalDate dateOfBirth, Integer number, Sex sex) {
        this.dateOfBirth = dateOfBirth;
        this.number = number;
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumber() {
        return number;
    }

    public Sex getSex() {
        return sex;
    }

    public enum Sex {
        MAN("M"),
        WOMAN("W");

        private final String shortForm;

        Sex(String shortForm) {
            this.shortForm = shortForm;
        }

        public String getShortForm() {
            return shortForm;
        }
    }
}