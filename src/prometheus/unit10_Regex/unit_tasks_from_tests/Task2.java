package prometheus.unit10_Regex.unit_tasks_from_tests;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        // PUT YOUR CODE HERE
        Scanner scanner = new Scanner (System.in);
        String inputText = scanner.nextLine();
        String text = "\\+\\d{1}-\\d{3}-\\d{3}-\\d{4}";   // +1-123-456-7890
        Pattern compiledPattern = Pattern.compile(text);
        Matcher matcher = compiledPattern.matcher(inputText);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

/*
 Завдання 10.2
         0/7 points (graded)

         Оголосіть стрічку inputText і надайте їй значення, використовуючи Scanner.
         Врахуйте, що стрічка може складатися з кількох слів.
         Використовуючи регулярні вирази, знайти всі номери телефонів у форматі "+1-123-456-7890" і виведіть їх на консоль.

         Приклад виконання:
         Для введеного тексту:
         Anna: +1-123-456-7890, Olena: +1-123-456-7891
         На екран має вивестися:
         +1-123-456-7890
         +1-123-456-7891

         Увага! Не змінюйте код у вікні. Своє рішення набирайте під коментарем //PUT YOUR CODE HERE

         Початковий код:
         Якщо Ви випадково видалили початковий код з вікна, ось він:

         import java.util.Scanner;
         import java.util.regex.Matcher;
         import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // PUT YOUR CODE HERE
    }
}

:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
Ось regex-вираз, який можна використовувати для відфільтрування номера телефону у форматі +1-123-456-7890:

Copy code
\+\d{1}-\d{3}-\d{3}-\d{4}
Ось як цей вираз розбивається:

\+ - означає "+", це символ плюса, який повинен бути в початку номера.
\d{1} - означає одну цифру. Тут \d позначає будь-яку цифру, а {1} позначає, що ми очікуємо саме одну цифру.
- - означає дефіс, який розділяє перший блок цифр.
\d{3} - означає три цифри після першого дефісу.
- - знову дефіс, розділяючий другий блок цифр.
\d{3} - ще три цифри.
- - ще один дефіс, розділяючий третій блок цифр.
\d{4} - чотири останні цифри номера.
Цей вираз впіймає будь-який номер телефону, який відповідає цьому шаблону, наприклад, +1-123-456-7890.


 */