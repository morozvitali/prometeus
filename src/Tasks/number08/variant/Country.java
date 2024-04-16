package Tasks.number08.variant;

public class Country {

    //PUT YOUR CODE HERE
    private String country;
    private int population;
    private int area;
    private double wholeness;

    public Country(String country, int population, int area) {
        this.country = country;
        this.population = population;
        this.area = area;
        this.wholeness = population / area;
    }

    public static String calculation(Country[] array) {

        double findValue = array[0].wholeness;
        String findCountry = array[0].country;
        for (Country country : array) {

            if (findValue < country.wholeness) {
                findValue = country.wholeness;
                findCountry = country.country;

            }
        }
        return findCountry;
    }
}