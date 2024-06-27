package prometheus.unit10_Regex.unit_tasks_from_tests;

import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {
        // PUT YOUR CODE HERE
        Scanner scanner = new Scanner (System.in);
        String inputStr = scanner.nextLine();
        String text = "\\d{3}";
        Pattern compiledPattern = Pattern.compile(text);
        Matcher matcher = compiledPattern.matcher(inputStr);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}




/*
 Завдання 10.1
        0/5 points (graded)

        Оголосіть стрічку inputStr і надайте їй значення, використовуючи Scanner.
        Врахуйте, що стрічка може складатися з кількох слів.
        Використовуючи регулярні вирази, визначте чи містить рядок групу символів, що складаються із 3 цифр (наприклад, "123" або "456").
        Виведіть всі знайдені групи символів у консоль.

        Приклад виконання:
        Для введеного тексту:
        abc123def456gh789
        На екран має вивестися:
        123
        456
        789

        Увага! Не змінюйте код у вікні. Своє рішення набирайте під коментарем //PUT YOUR CODE HERE

        Початковий код:
        Якщо Ви випадково видалили початковий код з вікна, ось він:

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

        public class test.b.Main {

            public static void main(String[] args) {
                // PUT YOUR CODE HERE
            }

        }
 */