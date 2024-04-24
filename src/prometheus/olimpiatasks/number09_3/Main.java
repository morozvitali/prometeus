package prometheus.olimpiatasks.number09_3;

import java.util.Scanner;

public class Main {
    /*
    Read the text entered by the user and output each word individuality,
    ignoring punctuation marks. Each word should be in UPPER CASE
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your text is: ");
        String input = scanner.nextLine();

        String [] words = input.split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toUpperCase();
            System.out.println(word);
        }
    }
}