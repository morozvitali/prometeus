package Lections.unit10_Regex.unit10_5;

/*
Hello! We need the ability to add a new client by email address.
It also should be validated to avoid fake or corrupted emails.

VET CLINIC 2.2

https://www.youtube.com/watch?v=55po4S0bLWQ&t=2s

 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String PASSWORD = "default";
    static Scanner SCANNER = new Scanner(System.in);
    static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._%-]+\\.[a-zA-Z]{2,}$";


    public static void main(String[] args) {
        run();
    }

    static void run() {
        if (auth()) {
            registerNewClient();
        }
    }

    static boolean auth() {
        boolean accepted = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Password: ");
            String input = SCANNER.nextLine();

            if (PASSWORD.equals(input)) {
                accepted = true;
                break;
            } else {
                System.out.println("Access denied. Please check your password.");
            }
        }

        System.out.println(accepted ? "Welcome to the Magic Vet!" : "Application has been blocked.");

        return accepted;
    }

    static void registerNewClient() {
        System.out.println("Please provaide client details ");
        System.out.println("Email: ");
        String email = SCANNER.nextLine();

        if (isEmailValid(email)) {
            Client2 client = buildClient(email);
            System.out.println("New clien: " + client.firstName + " " + client.lastName + " " + client.email);
        } else {
            System.out.println("Provided client is invalid");
        }
    }

    static boolean isEmailValid (String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    static Client2 buildClient (String email) {
        Client2 client = new Client2();
        client.email = email;

        System.out.println("First name ");
        client.firstName = SCANNER.nextLine();

        System.out.println("Last name ");
        client.lastName = SCANNER.nextLine();

        return client;
    }
}


class Client {
    String firstName;
    String lastName;
    String email;
}
