import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                  ✧･ﾟ: *✧･ﾟ:*  УРА, МЕТОДЫ! *:･ﾟ✧*:･ﾟ✧\n" +
                "                             ♪♪ヽ(^。^)ノ♪♪");
        System.out.println("\t\t\t\t\t\tЗадание 1");
        System.out.println("Написать метод, который создает массив из N случайных чисел в диапазоне от min до max и возвращает этот массив.");
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        System.out.println("Введите минимальный диапазон числа для заполнения массива");
        int min = scanner.nextInt();
        System.out.println("Введите максимальный диапазон числа для заполнения массива");
        int max = scanner.nextInt();
//        System.out.println(Arrays.toString(task1(n, min, max)));
        //Если нужно использовать 1 массив на всех, то его надо сохранить и использовать переменную и вставим ее вместо метода
        //int [] array = task1(n,min,max);
        for (int a : task1(n, min, max)) {
            System.out.print(a + " ");
        }
        System.out.println("\t\t\t\t\t\tЗадание 2\nНаписать метод, который принимает массив и выводит все его элементы на экран в одну строку через пробел.");
        //Создадим массив, который будет принимать метод, я передумала, с тем что первый заполнили интереснее, он всегда разный
        int[] array = {1, 15, -30, 10};
        task2(task1(n, min, max));
        System.out.println("\t\t\t\t\t\tЗадание 3\nНаписать метод, который принимает массив и возвращает сумму всех его элементов.");
        System.out.println("Сумма всех элементов = " + task3(task1(n, min, max)));//распечатаем сразу результат так как у нас вернется сразу результат
        System.out.println("\t\t\t\t\t\tЗадание 4\nНаписать метод, который принимает массив и возвращает количество положительных элементов в нем.");
        System.out.println("В массиве " + task4(task1(n, min, max)) + " положительных элементов");
        System.out.println("\t\t\t\t\t\tЗадание 5\nНаписать метод, который принимает массив и возвращает максимальный элемент.");
        System.out.println("Максимальный элемент массива = " + task5(task1(n, min, max)));
        System.out.println("\t\t\t\t\t\tЗадание 6\nНаписать метод, который принимает массив и возвращает минимальный элемент.");
        System.out.println("Минимальный элемент в массиве = " + task6(task1(n, min, max)));
        System.out.println("\t\t\t\t\t\tЗадание 7\nНаписать метод, который принимает массив и возвращает среднее арифметическое всех элементов.");
        System.out.println("Среднее арифметическое число = " + task7(task1(n, min, max)));
        System.out.println("\t\t\t\t\t\tЗадание 8\nНаписать метод, который принимает массив и возвращает количество четных чисел в нем.");
        System.out.println("В массиве находится " + task8(task1(n, min, max)) + " чётных чисел");
        System.out.println("\t\t\t\t\t\tЗадание 9\nНаписать метод, который принимает массив и возвращает индекс максимального элемента.");
        System.out.println("Индекс максимального элемента массива = " + task9(task1(n, min, max)));
        System.out.println("\t\t\t\t\t\tЗадание 10\nНаписать метод, который принимает массив и выводит только положительные элементы на экран.");
        task10(task1(n, min, max));
        System.out.println();
        System.out.println("\t\t\t\t\t\tЗадание 11\nНаписать метод, который принимает массив и возвращает новый массив в обратном порядке.");
        for (int a : task11(task1(n, min, max))) {
            System.out.print(a + " ");
        }
        System.out.println("\t\t\t\t\t\tЗадание 12\nНаписать метод, который принимает массив и число, возвращает количество элементов равных этому числу.");
        System.out.println("Введите необходимое число:");
        int number = scanner.nextInt();
        System.out.println("Ваше число встретилось - " + task12(task1(n, min, max), number) + " раз");
        System.out.println("\t\t\t\t\t\tЗадание 13\nНаписать метод, который принимает массив и заменяет все отрицательные элементы на нули.");
        for (int a : task13(task1(n, min, max))) {
            System.out.print(a + " ");
        }
        System.out.println("\t\t\t\t\t\t\nЗадание 14\nНаписать метод, который принимает два массива и возвращает true, если их суммы элементов равны, иначе false.");
        System.out.println(task14(task1(n, min, max), task1(n, min, max)));
        System.out.println("\t\t\t\t\t\tЗадание 15\nНаписать метод, который принимает массив и возвращает разницу между максимальным и минимальным элементом.");
        System.out.println("Разница между максимальным и минимальным значением в массиве = " + task15(task1(n, min, max)));
    }

    public static int randomize(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }

    public static int[] task1(int n, int min, int max) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomize(min, max);
        }
        return array;
    }

    public static void task2(int[] array) {
        System.out.println("Массив:");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static int task3(int[] array) {
        System.out.println("Массив:");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        return sum;
    }

    public static int task4(int[] array) {
        System.out.println("Массив:");
        int countPositive = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] > 0) {
                countPositive++;
            }
        }
        System.out.println();
        return countPositive;
    }

    public static int task5(int[] array) {
        task2(array);//Немного автоматизируем процесс
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int task6(int[] array) {
        task2(array);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double task7(int[] array) {
        task2(array);
        int sredneeArifmet = 0;
        for (int i = 0; i < array.length; i++) {
            sredneeArifmet += array[i];
        }
        return (double) sredneeArifmet / array.length;
    }

    public static int task8(int[] array) {
        task2(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int task9(int[] array) {
        task2(array);
        int index = 0;
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }//вопрос : почему это работает только в паре? почему, если я пишу без max = array[i]; то мне не выдается индекс?
        }
        return index;
    }

    public static void task10(int[] array) {//тут не указано, что он что-то возвращает, просто выводит, значит танцы с бубном отменяются ＼(٥⁀▽⁀ )／
        task2(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int[] task11(int[] array) {
        task2(array);//тут мы просто смотрим на то, как выглядит наш массив изначально
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[array.length - 1 - i];
        }
        System.out.println("Новый:");
        return temp;
    }

    public static int task12(int[] array, int num) {
        task2(array);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int[] task13(int[] array) {
        task2(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static boolean task14(int[] array, int[] array2) {
        task2(array);
        task2(array2);
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        if (sum1 == sum2) {
            return true;
        }
        return false;
    }

    public static int task15(int[] array) {
        task2(array);
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        int result = max - min;
        return result;
    }
}
