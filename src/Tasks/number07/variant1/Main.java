package Tasks.number07.variant1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter count of elements: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        InfinityArray infinityArray = new InfinityArray();
        for (int i = 0; i < number; i++) {
            infinityArray.add(i * i);
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Element with number " + i + " equals " + infinityArray.get(i));
        }
            System.out.println("Element with number -3 equals " + infinityArray.get(-3));
    }
}