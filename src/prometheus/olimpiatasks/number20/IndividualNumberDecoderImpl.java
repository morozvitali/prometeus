package prometheus.olimpiatasks.number20;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class IndividualNumberDecoderImpl implements IndividualNumberDecoder {
    private static final Pattern INDIVIDUAL_NUMBER_FORMAT = Pattern.compile("^\\d{10}$");
    private static final LocalDate START_DATE = LocalDate.of(1899, 12, 31);

    @Override
    public PersonalInformation decodeIndividualNumber(String individualNumber) {
        if (!validateIndividualNumber(individualNumber)) {
            return null;
        }

        LocalDate dateOfBirth = parseDateOfBirth(individualNumber);
        Integer number = parseNumber(individualNumber);
        PersonalInformation.Sex sex = parseSex(individualNumber);

        return new PersonalInformation(dateOfBirth, number, sex);
    }

    private Integer parseNumber(String individualNumber) {
        String numberSubstring = individualNumber.substring(5, 9);
        return Integer.parseInt(numberSubstring);
    }

    private PersonalInformation.Sex parseSex(String individualNumber) {
        String sexSubstring = individualNumber.substring(8, 9);
        int sexInteger = Integer.parseInt(sexSubstring);
        return sexInteger % 2 == 0
                ? PersonalInformation.Sex.WOMAN
                : PersonalInformation.Sex.MAN;
    }

    private LocalDate parseDateOfBirth(String individualNumber) {
        String birthSubstring = individualNumber.substring(0, 5);
        int daysFromStartDate = Integer.parseInt(birthSubstring);
        return START_DATE.plusDays(daysFromStartDate);
    }

    private boolean validateIndividualNumber(String individualNumber) {
        boolean isCorrectFormat = INDIVIDUAL_NUMBER_FORMAT.matcher(individualNumber).find();
        if (!isCorrectFormat) {
            return false;
        }

        int[] individualNumberDigits = new int[10];
        for(int i = 0; i < 10; i++) {
            String digit = individualNumber.substring(i, i+1);
            individualNumberDigits[i] = Integer.parseInt(digit);
        }
        int controlSum = individualNumberDigits[0]*(-1)
                + individualNumberDigits[1] * 5
                + individualNumberDigits[2] * 7
                + individualNumberDigits[3] * 9
                + individualNumberDigits[4] * 4
                + individualNumberDigits[5] * 6
                + individualNumberDigits[6] * 10
                + individualNumberDigits[7] * 5
                + individualNumberDigits[8] * 7;
        controlSum %= 11;
        controlSum %= 10;
        return controlSum == individualNumberDigits[9];
    }
}

