package prometheus.olimpiatasks.number08;

public class Main {

    public static void main(String[] args) {
        Country[] countries = new Country[]{
                new Country("Ukraine", 41_000_000, 603_700),
                new Country("USA", 333_000_000, 9_833_520),
                new Country("China", 1_411_000_000, 9_596_961),
                new Country("India", 1_269_000_000, 3_287_263),
                new Country("Japan", 125_000_000, 377_975)
        };

        Country countryWithTheBiggestDensity = countries[0];
        for (Country country : countries) {
            if (country.density > countryWithTheBiggestDensity.density) {
                countryWithTheBiggestDensity = country;
            }
        }

        System.out.println("Country with the biggest density is " + countryWithTheBiggestDensity.name);
    }
}