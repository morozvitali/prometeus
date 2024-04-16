package Lections.unit10_Reg.unit10_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    /*
    Pattern використовується для компіляції регулярного виразу в шаблон,
    який далі можна використовувати для пошуку збігів у текстах

    Для компіляції використовуєється static метод compile()

    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    Клас Matcher використовує скомпільований шаблон (з обєкту Pattern)
    для пошуку збігів у тексті

    ініцалізація обєкту матчер відбувається за допомогою методу matcher()
    який належить обєкту класу Pattern

    find() - для пошуку збігів у тексті

    group() - для повертання підрядку який відповідає шаблону

     */

    public static void main(String[] args) {
        String[] texts = {"This cat is black ", "The dog is brown ", "The bird is flying", "The cat is sleeping"};
        String pattern = "cat";

        Pattern compiledPattern = Pattern.compile(pattern);

        for (String text : texts) {
            Matcher matcher = compiledPattern.matcher(text);

            if (matcher.find()) { // find ()
                System.out.println("Match of " + matcher.group() + " found in " + text); // group ()
            }
        }
    }
}
