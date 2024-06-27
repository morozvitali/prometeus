package prometheus.olimpiatasks.number26;

public class Main {
    public static void main(String[] args) {
        CarNumberParser carNumberParser = new UkrainianCarNumberParser();

        CarNumber carNumber = carNumberParser.parseCarNumber("AE2378FA");

        System.out.println(carNumber);
    }
}