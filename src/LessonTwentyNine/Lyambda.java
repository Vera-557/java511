package LessonTwentyNine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Lyambda {
    public static void main(String[] args) {
          /*
    Задание 1: Приветствия
Создайте функциональный интерфейс Greetable с методом void greet(). Напишите программу, которая создает 4 разных лямбда-выражения:
Выводит "Hello!" "Good morning!" "Привет!"текущую дату + приветствие
     */
        Greetable greet1 = () -> System.out.println("Hello!");
        Greetable greet2 = () -> System.out.println("Good morning!");
        Greetable greet3 = () -> System.out.println("Привет!!");
        Greetable greet4 = () -> System.out.println(LocalDateTime.now() + "  Hello!");
        greet1.greet();
        greet2.greet();
        greet3.greet();
        greet4.greet();
     /* Задание 2: Строковые операции
Создайте функциональный интерфейс StringOperation с методом String apply(String s). Напишите программу с 5 лямбда-выражениями для строки:
Перевести в верхний регистр, Перевести в нижний регистр, Перевернуть строку задом наперед, Удалить все пробелы, Добавить в начало и конец строки символ "*"
Протестируйте каждую лямбду на строке "Hello World".
     */
        StringOperation stringOp1 = (rama) -> rama.toUpperCase();
        StringOperation stringOp2 = (rama) -> rama.toLowerCase();
        StringOperation stringOp3 = (rama) -> {
            String newStr = "";
            for (int i = rama.length() - 1; i >= 0; i--) {
                newStr = newStr + rama.charAt(i);
            }
            return newStr;
        };
        StringOperation stringOp4 = (rama) -> rama.replaceAll(" ", "");
        StringOperation stringOp5 = (rama) -> {
            StringBuilder stringBuilder = new StringBuilder(rama);
            stringBuilder.insert(0, "*");
            stringBuilder.append("*");
            String ramo = stringBuilder.toString();
            return ramo;
        };
        System.out.println(stringOp1.apply("Hello World"));
        System.out.println(stringOp2.apply("Hello World"));
        System.out.println(stringOp3.apply("Hello World"));
        System.out.println(stringOp4.apply("Hello World"));
        System.out.println(stringOp5.apply("Hello World"));
        /*
        Задание 3: Фильтрация списка
Создайте функциональный интерфейс StringChecker с методом boolean test(String s).
Создайте ArrayList со строками: "Java", "Python", "JavaScript", "C++", "Ruby", "Go", "Kotlin"
Напишите метод filter(List<String> list, StringChecker checker), который возвращает новый список строк, прошедших проверку.
Создайте лямбда-выражения для фильтрации:
Строк длиной больше 4 символов
Строк, начинающихся с "J"
Строк, содержащих букву "a"
Строк, которые НЕ содержат букву "y"
Строк длиной ровно 6 символов
         */
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C++");
        list.add("Ruby");
        list.add("Go");
        list.add("Kotlin");

        System.out.println("Исходный список: " + list);

        System.out.println("Языки с названием длиннее 4 символов:");
        List<String> longNames = filter(list, s -> s.length() > 4);
        System.out.println(longNames);
        System.out.println("Языки, начинающиеся на 'J':");
        List<String> startsWithJ = filter(list, s -> s.startsWith("J"));
        System.out.println(startsWithJ);
        System.out.println("Языки, содержат букву а:");
        List<String> containsA = filter(list, s -> s.contains("a"));
        System.out.println(containsA);
        List<String> containsU = filter(list, s -> !s.contains("y"));
        System.out.println(containsU);
        System.out.println("Языки с длиной ровно 6 символов:");
        List<String> soLong = filter(list, s -> s.length() == 6);
        System.out.println(soLong);
    }

    static List<String> filter(List<String> list, StringChecker checker) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (checker.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
