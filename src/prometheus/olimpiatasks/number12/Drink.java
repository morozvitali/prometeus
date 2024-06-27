package prometheus.olimpiatasks.number12;

public class Drink extends MenuItem {
    public Drink() {}

    public Drink(String name, int cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
