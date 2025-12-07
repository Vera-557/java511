package S12po16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LessonSixteen {
//Задача 1: Деление на ноль
//Создайте метод safeDivision(int a, int b), который делит два числа и обрабатывает деление на ноль через try-catch.
// Метод должен возвращать результат деления или выводить сообщение об ошибке и возвращать 0.
    static int safeDivision(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            //нам нужно самим написать? Не совсем понятно по заданию. Тогда напишем так:
            //System.out.println("Деление на ноль запрещено!");
            //или отправим в поток ERROR
            //System.err.println("Деление на ноль запрещено!");
            System.out.println("Вы пытаетесь делить на 0");
            return 0;
        }
    }

    //Задача 2: Проверка массива
    //Создайте метод getElement(int[] arr, int index), который возвращает элемент массива по индексу.
    // Обработайте ситуацию, когда индекс выходит за границы массива (ArrayIndexOutOfBoundsException). При ошибке возвращайте -1.
    static int getElement(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    /* Задача 3: Безопасный ввод числа
     Создайте метод inputNumber(), который просит пользователя ввести целое число. Если пользователь вводит не число (буквы, символы),
     программа должна перехватить исключение, вывести сообщение об ошибке и повторить запрос. Метод возвращает корректно введённое число. */
    static int inputNumber() {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int input;
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Введите целое число");
            scanner.nextLine();
            input = scanner.nextInt();
        }
        return input;
    }

    //Задача 4: Конвертер строки в число
    // Создайте метод parseNumber(String str), который преобразует строку в целое число. Обработайте NumberFormatException - если строка не
    // является числом, выведите сообщение об ошибке и верните 0. Протестируйте метод со строками: "123", "abc", "12.5".
    static int parseNumber(String str) {
        int input;
        try {
            input = Integer.parseInt(str);
            return input;
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число: " + str);
            return 0;
        }
    }
    //Задача 5: Калькулятор с исключениями
    //Создайте метод calculate(double a, double b, char operation), который выполняет арифметические операции (+, -, *, /).
    // Обработайте деление на ноль. Если передана неизвестная операция (например, '%'), бросьте исключение IllegalArgumentException
    // с сообщением "Neizvestnaya operaciya".

    static double calculate(double a, double b, char operation) {
        try {
            switch (operation) {
                case '+' -> {
                    return a + b;
                }
                case '-' -> {
                    return a - b;
                }
                case '*' -> {
                    return a * b;
                }
                case '/' -> {
                    if (b == 0) {
                        throw new ArithmeticException("Деление на ноль!");
                    }
                    return a / b;
                }
                default -> throw new IllegalArgumentException("Неизвестная операция");
            }
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль");
            return 0;
        }
    }

//Задача 6: Валидация возраста
//Создайте метод validateAge(int age), который проверяет корректность возраста (должен быть от 0 до 150). Если возраст
// отрицательный или больше 150, бросьте IllegalArgumentException с соответствующим сообщением. В методе main обработайте
// это исключение и выведите сообщение об ошибке.
static void validateAge(int age){
  if (age < 0 || age > 150){
      throw new IllegalArgumentException("Ошибка! Возраст указан некорректно!");
  } else System.out.println("Возраст введен корректно");
}
//Задача 7: Множественные исключения
//Создайте метод processArray(int[] arr, int index, int divisor), который берёт элемент массива по индексу и делит его
// на divisor. Метод должен обрабатывать три типа исключений отдельными catch блоками:
//    NullPointerException - если массив null
//    ArrayIndexOutOfBoundsException - если индекс неверный
//    ArithmeticException - если делитель равен 0
//    При каждой ошибке выводите своё сообщение. Возвращайте результат деления или -1 при ошибке.
    static double processArray(int[] arr, int index, int divisor){
        try{
           return (double) arr[index] / divisor;
        } catch (NullPointerException e){
            System.out.println("Массив пустой");
            return -1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ваш индекс выходит за пределы массива");
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("Вы пытаетесь делить на 0");
            return -1;
        }
    }
public static void main(String[] args) throws IllegalArgumentException {
        int [] array = {1,4,6,1,10,54};
    System.out.println("\t\t\t₍˄·͈༝·͈˄₎◞ ̑̑♥♥ Задание 1");
    System.out.println("Создайте метод safeDivision(int a, int b), который делит два числа и обрабатывает деление на ноль через try-catch.\nМетод должен возвращать результат деления или выводить сообщение об ошибке и возвращать 0.");
    System.out.println("Результат метода: " + safeDivision(2, 0));
    System.out.println();
    System.out.println("\t\t\t₍˄·͈༝·͈˄₎◞ ̑̑̑♥♥ Задание 2");
    System.out.println("Создайте метод getElement(int[] arr, int index), который возвращает элемент массива по индексу.\nОбработайте ситуацию, когда индекс выходит за границы массива (ArrayIndexOutOfBoundsException). При ошибке возвращайте -1.");
    System.out.println("Результат метода: " + getElement(array, 2));
    System.out.println();
    System.out.println("\t\t\t₍˄·͈༝·͈˄₎◞ ̑̑̑♥♥ Задание 3");
    System.out.println("Создайте метод inputNumber(), который просит пользователя ввести целое число. Если пользователь вводит не число (буквы, символы),\n программа должна перехватить исключение, вывести сообщение об ошибке и повторить запрос. Метод возвращает корректно введённое число.");
    System.out.println("Результат метода: " + inputNumber());
    System.out.println();
    System.out.println("\t\t\t₍˄·͈༝·͈˄₎◞ ̑̑̑♥♥ Задание 4");
    System.out.println("Создайте метод parseNumber(String str), который преобразует строку в целое число. Обработайте NumberFormatException - если строка не\nявляется числом, выведите сообщение об ошибке и верните 0. Протестируйте метод со строками: \"123\", \"abc\", \"12.5");
    System.out.println("Результат метода: " + parseNumber("45"));
    System.out.println();
    System.out.println("\t\t\t₍˄·͈༝·͈˄₎◞ ̑̑♥♥ Задание 5");
    System.out.println("Создайте метод calculate(double a, double b, char operation), который выполняет арифметические операции (+, -, *, /).\nОбработайте деление на ноль. Если передана неизвестная операция (например, '%'), бросьте исключение IllegalArgumentException");
    try {
        System.out.println("Результат метода: " + calculate(7, 0, 'щ'));
        System.out.println();
    }catch (IllegalArgumentException e){
        System.out.println("Ошибка: " + e.getMessage());
    }
    System.out.println("\t\t\t₍˄·͈༝·͈˄₎◞ ̑̑♥♥ Задание 6");
    System.out.println("Создайте метод validateAge(int age), который проверяет корректность возраста (должен быть от 0 до 150). Если возраст\nотрицательный или больше 150, бросьте IllegalArgumentException с соответствующим сообщением. В методе main обработайте\n это исключение и выведите сообщение об ошибке.");
    try {
        System.out.print("Результат метода: ");
        validateAge(200);
    } catch (IllegalArgumentException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }
    System.out.println();
    System.out.println("\t\t\t₍˄·͈༝·͈˄₎◞ ̑̑♥♥ Задание 7");
    System.out.println("Создайте метод processArray(int[] arr, int index, int divisor), который берёт элемент массива по индексу и делит его\nна divisor. Метод должен обрабатывать три типа исключений отдельными catch блоками:\nNullPointerException - если массив null\nArrayIndexOutOfBoundsException - если индекс неверный\nArithmeticException - если делитель равен 0\nПри каждой ошибке выводите своё сообщение. Возвращайте результат деления или -1 при ошибке.");
    System.out.println("Результат метода: " + processArray(array,4,2));
}
}
