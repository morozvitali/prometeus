package prometheus.olimpiatasks.number15;

import java.util.Scanner;

public class ConsoleUserReader implements UserReader {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public User readUser() {
        System.out.print("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Please enter your last name: ");
        String lastName = scanner.next();
        System.out.print("Please enter your email: ");
        String email = scanner.next();
        return new User(firstName, lastName, email);
    }
}
