package prometheus.olimpiatasks.number26;

import java.util.regex.Pattern;

public class UkrainianCarNumberParser implements CarNumberParser {
    private static final Pattern LETTER_CAR_NUMBER_PART_PATTERN = Pattern.compile("^[ABCEHIKMOPTX]{2}$");
    private static final Pattern NUMBER_CAR_NUMBER_PART_PATTERN = Pattern.compile("^[0-9]{4}$");

    @Override
    public CarNumber parseCarNumber(String number) {
        if (number.length() != 8) {
            throw new CarNumberParserException("Car number should contain 8 symbols");
        }

        String firstPartOfCarNumber = number.substring(0, 2);
        String numberPartOfCarNumber = number.substring(2, 6);
        String secondPartOfCarNumber = number.substring(6, 8);

        if (!LETTER_CAR_NUMBER_PART_PATTERN.matcher(firstPartOfCarNumber).find()) {
            throw new CarNumberParserException("First part of car number should contain 2 symbols from next array: [A, B, C, E, H, I, K, M, O, P, T, X]");
        }
        if (!NUMBER_CAR_NUMBER_PART_PATTERN.matcher(numberPartOfCarNumber).find()) {
            throw new CarNumberParserException("Second part of car number should contain 4 symbols from next array: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
        }
        if (!LETTER_CAR_NUMBER_PART_PATTERN.matcher(secondPartOfCarNumber).find()) {
            throw new CarNumberParserException("Third part of car number should contain 2 symbols from next array: [A, B, C, E, H, I, K, M, O, P, T, X]");
        }
        return new CarNumber(firstPartOfCarNumber, numberPartOfCarNumber, secondPartOfCarNumber);
    }
}