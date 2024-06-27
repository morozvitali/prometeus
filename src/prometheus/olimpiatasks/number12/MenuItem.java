package prometheus.olimpiatasks.number12;

public class MenuItem {
    public MenuItem() {}

    public MenuItem(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
