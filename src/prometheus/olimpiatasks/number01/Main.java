package prometheus.olimpiatasks.number01;

public class Main {
    public static void main(String... args) {
        int distance = 500;
        int x = 10;

        double fuelPrice = 50.5;
        int hotDogInterval = 100;

        double hotDogPrice = 50.5;
        double coffeePrice = 30.5;

        double fuelCost = x * distance * fuelPrice / 100;

        int hotDogStopsCount = distance / hotDogInterval;
        double hotDogAndCoffeeCost = (coffeePrice + hotDogPrice) * hotDogStopsCount;

        double travelExpenses = fuelCost + hotDogAndCoffeeCost;

        System.out.println("Необхідно витратити " + travelExpenses + " грн на поїздку довжиною " + distance + " км з кавою та хот-догами");
    }
}
