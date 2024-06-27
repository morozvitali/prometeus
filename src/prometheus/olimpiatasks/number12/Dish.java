package prometheus.olimpiatasks.number12;

public class Dish extends MenuItem {
    public Dish() {}

    public Dish(String name, int cost, int weight) {
        super(name, cost);
        this.weight = weight;
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
