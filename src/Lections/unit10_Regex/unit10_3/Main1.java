package Lections.unit10_Regex.unit10_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    /*
    Деякі методи класу Matcher:
    ::::::::::::::::::::::::::::::::::
    find () - пошук збігів
    start () - end () для отримання позицій початку та кінця збігу
    replaceAll () використовується для заміни всіх збігів
    replaceFirst () для заміни дише першого збігу
     */

    public static void main(String[] args) {
        String text = "The cat is black. The hat is red";
        String pattern = "cat";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Match found at position " + matcher.start() + " " + (matcher.end() - 1 ));
        }
    }
}
