package Lections.unit10_Reg.unit10_3;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main2 {


    public static void main(String[] args) {
        String text = "Hello, World! It's you - World!";
        String pattern = "World";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        String replacedText = matcher.replaceAll("Java");
        System.out.println("Replaced text: " + replacedText);



    }
}
