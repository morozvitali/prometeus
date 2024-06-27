package prometheus.olimpiatasks.number09;

public class Country {
    String name;
    int population;
    int area;
    double density;

    Country(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;

        this.density = (double) population / area;
    }
}
