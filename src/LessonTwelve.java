import java.util.Arrays;
import java.util.Scanner;

public class LessonTwelve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 27;
        double c = 7.3;
        double d = 8.2;
        int n = 15;
        System.out.println("⋆｡°✩ Задание 1 ✩°｡⋆\nНаписать перегруженные методы multiply, которые могут умножать два int числа, два double числа, три int числа, или int и double число.");
        System.out.println("Умножим 2 инта: " + multiply(a, b) + "; Умножим 2 дабл: " + multiply(c, d) + "; Умножим 3 числа: " + multiply(a, b, 15) + "; Умножим инт и дабл: " + multiply(c, b));
        System.out.println("⋆｡°✩ Задание 2 ✩°｡⋆\nНаписать рекурсивный метод, который вычисляет сумму чисел от 1 до N.");
//            System.out.println("Введите нужное значение: ");
//            int n = scanner.nextInt();
        System.out.println("Сумма чисел от 1 до " + n + " равна " + task2(n));
        System.out.println("⋆｡°✩ Задание 3 ✩°｡⋆\nНаписать метод, который принимает массив и число X, и возвращает true если в массиве есть элемент больше X, иначе false.");
        int[] array = {1, 25, 3, 14, 5};
        System.out.println("Массив : " + Arrays.toString(array) + ", число : " + n + ", результат: " + task3(array, n));
        System.out.println("⋆｡°✩ Задание 4 ✩°｡⋆\nНаписать рекурсивный метод, который выводит числа от N до 1 в обратном порядке (каждое на новой строке).");
        task4(n);
        System.out.println("\"⋆｡°✩ Задание 5 ✩°｡⋆\nНаписать перегруженные методы printInfo, один принимает строку и выводит её, второй принимает строку и число и выводит строку N раз.");
        String hi = "Hello, World!";
        printInfo(hi);
        System.out.println("Метод с количеством значений для распечатки");
        printInfo(hi, n);
        System.out.println("⋆｡°✩ Задание 6 ✩°｡⋆\nНаписать рекурсивный метод, который принимает массив и индекс, и возвращает сумму всех элементов массива начиная с этого индекса до конца.");
    }

    //    Написать перегруженные методы multiply, которые могут умножать два int числа, два double числа, три int числа, или int и double число.
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, int b) {
        return a * b;
    }

    //    Написать рекурсивный метод, который вычисляет сумму чисел от 1 до N.
    public static int task2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + task2(n - 1);
        }
    }

    //    Написать метод, который принимает массив и число X, и возвращает true если в массиве есть элемент больше X, иначе false.
    public static boolean task3(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                return true;
            }
        }
        return false;
    }

    //    Написать рекурсивный метод, который выводит числа от N до 1 в обратном порядке (каждое на новой строке).
    public static void task4(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        task4(n - 1);

        System.out.println(n + 1);
        //не пойму, возможно я не правильно понимаю задание...
    }

    //    Написать перегруженные методы printInfo, один принимает строку и выводит её, второй принимает строку и число и выводит строку N раз.
    public static void printInfo(String hi) {
        System.out.println(hi);
    }

    public static void printInfo(String hi, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(hi);
        }
    }

    //    Написать рекурсивный метод, который принимает массив и индекс, и возвращает сумму всех элементов массива начиная с этого индекса до конца.
    public static void task6(int[] array, int a) {
        int sum = 0;
        for (int i = a; i < array.length; i++) {
            sum += array[i];
        }

    }
//    Задание 7
//    Написать метод, который принимает два числа A и B, и возвращает их произведение используя только операцию сложения (без использования *).
//    Задание 8
//    Написать рекурсивный метод, который принимает массив и индекс, и возвращает максимальный элемент в массиве начиная с этого индекса.
//    Задание 9
//    Написать перегруженные методы calculate: один складывает два числа, второй вычитает второе из первого, третий принимает три числа и возвращает их среднее арифметическое.
//    Задание 10
//    Написать рекурсивный метод, который вычисляет степень числа: возводит число A в степень N (A^N).

}
