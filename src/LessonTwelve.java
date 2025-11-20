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
        int[] array = {1, 25, 3, 14, 5, 12, 10, 3};
        System.out.println("Массив : " + Arrays.toString(array) + ", число : " + n + ", результат: " + ifXbiggerest(array, n));
        System.out.println("⋆｡°✩ Задание 4 ✩°｡⋆\nНаписать рекурсивный метод, который выводит числа от N до 1 в обратном порядке (каждое на новой строке).");
        reverce(n);
        System.out.println("\"⋆｡°✩ Задание 5 ✩°｡⋆\nНаписать перегруженные методы printInfo, один принимает строку и выводит её, второй принимает строку и число и выводит строку N раз.");
        String hi = "Hello, World!";
        printInfo(hi);
        System.out.println("Метод с количеством значений для распечатки");
        printInfo(hi, n);
        System.out.println("⋆｡°✩ Задание 6 ✩°｡⋆\nНаписать рекурсивный метод, который принимает массив и индекс, и возвращает сумму всех элементов массива начиная с этого индекса до конца.");
        System.out.println("Сумма всех элементов массива = " + summArrayFromIndex(array, a));
        System.out.println("⋆｡°✩ Задание 7 ✩°｡⋆\nНаписать метод, который принимает два числа A и B, и возвращает их произведение используя только операцию сложения (без использования *).");
        System.out.println("Произведение 2 чисел = " + multiplyRecurs(a, b));
        System.out.println("\"⋆｡°✩ Задание 8 ✩°｡⋆\nНаписать рекурсивный метод, который принимает массив и индекс, и возвращает максимальный элемент в массиве начиная с этого индекса.");
        System.out.println("Максимальный элемент массива от введенного индекса = " + maxFrom(array, a));
        System.out.println("\"⋆｡°✩ Задание 9 ✩°｡⋆\nНаписать перегруженные методы calculate: один складывает два числа, второй вычитает второе из первого, третий принимает три числа и возвращает их среднее арифметическое.");
        System.out.println("Сложение = " + calculate(a, b) + ", вычитание = " + calculate(c, d) + ", среднее арифметическое = " + calculate(a, b, n));
        System.out.println("⋆｡°✩ Задание 10 ✩°｡⋆\nНаписать рекурсивный метод, который вычисляет степень числа: возводит число A в степень N (A^N)");
        System.out.println("Число " + a + " степень " + b + " = " + power(a, b));
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
    public static boolean ifXbiggerest(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > num) {
                return true;
            }
        }
        return false;
    }

    //    Написать рекурсивный метод, который выводит числа от N до 1 в обратном порядке (каждое на новой строке).
    public static void reverce(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        reverce(n - 1);

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
    public static int summArrayFromIndex(int[] array, int a) {
        if (a >= array.length) {
            return 0;
        }
        return array[a] + summArrayFromIndex(array, a + 1);
    }

    //    Написать метод, который принимает два числа A и B, и возвращает их произведение используя только операцию сложения (без использования *).
    public static int multiplyRecurs(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        if (b < 0) {
            return -multiplyRecurs(a, -b);
        }
        return a + multiplyRecurs(a, b - 1);

    }

    //    Написать рекурсивный метод, который принимает массив и индекс, и возвращает максимальный элемент в массиве начиная с этого индекса.
    public static int maxFrom(int[] array, int index) {
        if (index == array.length - 1) {
            return array[index];
        }
        if (index < 0) {
            return 0;
        }
        int max = maxFrom(array, index + 1);
        if (array[index] > max) {
            return array[index];
        }
        return max;
    }

    //    Написать перегруженные методы calculate: один складывает два числа, второй вычитает второе из первого, третий принимает три числа и возвращает их среднее арифметическое.
    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a - b;
    }

    public static double calculate(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    //    Написать рекурсивный метод, который вычисляет степень числа: возводит число A в степень N (A^N).
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;// любое число в степени 0 равно 1
        }

        if (n == 1) {
            return a;// любое число в степени 1 равно самому числу
        }

        return a * power(a, n - 1);
    }
}
