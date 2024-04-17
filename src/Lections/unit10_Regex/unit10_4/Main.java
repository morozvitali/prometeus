package Lections.unit10_Regex.unit10_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /*
    Define a pattern to validate mobile numbers by the format +380xxxxxxxxx.
    Expected result:
            "+380123456789", "+380987654321" - should be valid;
            "1234567890", "+38812345" should be invalid.
     */

    static String mobileNumberPottern = "^\\+380\\d{9}$";

    public static void main(String[] args) {
        String[] mobileNumbers = {"+380123456789", "+380987654321", "1234567898", "+38812345"};
            for (String number : mobileNumbers) {
                boolean valid = validateMobileNumber (number);

                System.out.println(number + " is " + (valid ? "valid" : "invalid"));
            }
        }

        private static boolean validateMobileNumber (String number) {

        Pattern compiledPattern  = Pattern.compile(mobileNumberPottern);
        Matcher matcher = compiledPattern.matcher(number);

            return matcher.matches();

        }

}
