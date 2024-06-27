package prometheus.olimpiatasks.number12;

public class Menu {
    public Menu() {}

    public Menu(Drink[] drinks, Dish[] dishes) {
        this.drinks = drinks;
        this.dishes = dishes;
    }

    private Drink[] drinks;
    private Dish[] dishes;

    public Dish[] getDishes() {
        return dishes;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }
}
