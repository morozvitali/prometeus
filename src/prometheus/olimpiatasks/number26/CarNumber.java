package prometheus.olimpiatasks.number26;


public class CarNumber {
    private final String firstLetterPart;
    private final String secondLetterPart;
    private final String numberPart;

    public CarNumber(String firstLetterPart, String numberPart, String secondLetterPart) {
        this.firstLetterPart = firstLetterPart;
        this.secondLetterPart = secondLetterPart;
        this.numberPart = numberPart;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", firstLetterPart, numberPart, secondLetterPart);
    }
}