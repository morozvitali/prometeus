package prometheus.olimpiatasks.number04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please, enter current day of week: ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();

        int daysToFriday = switch (day) {
            case "mon", "monday" -> 4;
            case "tue", "tuesday" -> 3;
            case "wed", "wednesday" -> 2;
            case "thu", "thursday" -> 1;
            case "fri", "friday" -> 0;
            case "sat", "saturday" -> 6;
            case "sun", "sunday" -> 5;
            default -> -1;
        };

        if (daysToFriday == -1) {
            System.out.println("There is no such week day - '" + day + "'");
        } else if (daysToFriday == 0){
            System.out.println("It's Friday today!");
        } else if (daysToFriday == 1) {
            System.out.println("It's Friday tomorrow!");
        } else {
            System.out.println("Only " + daysToFriday + " days left until Friday!");
        }
    }
}
