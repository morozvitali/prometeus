package prometheus.unit10_Regex.unit10_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) {

    /*

    Методи класy Matcher:

    find () використовується для знаходження збігів в рядку.
    start () Ta end () використовуються для отримання позицій початку та кінця збігу.
    replaceAll() використовується для заміни всіх збігів.
    replaceFirst () використовується для заміни лише першого збігу

    */
//

        String text = "Hello, Java! Nice to see you!!";
        String pattern = "Java";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        String removedText = matcher.replaceAll("Genya");
        System.out.println("Removed text: " + removedText);

    }
}
