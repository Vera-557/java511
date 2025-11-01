import java.util.Random;

public class LessonNine {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        System.out.println("◠◡✦✧Задание 1✧✦◡◠");
        tasks.task1(new int[15]);
        System.out.println("\n\n◠◡✦✧Задание 2✧✦◡◠");
        tasks.task2(new int[12]);
        System.out.println("\n◠◡✦✧Задание 3✧✦◡◠");
        tasks.task3(new int[10]);
        System.out.println("\n◠◡✦✧Задание 4✧✦◡◠");
        tasks.task4(new int[14]);
        System.out.println("\n◠◡✦✧Задание 5✧✦◡◠");
        tasks.task5(new int[10]);
        System.out.println("\n◠◡✦✧Задание 6✧✦◡◠");
        tasks.task6(new int[20]);
        System.out.println("\n◠◡✦✧Задание 7✧✦◡◠");
        tasks.task7(new int[18]);
        System.out.println("\n◠◡✦✧Задание 8✧✦◡◠");
        tasks.task8(new int[16]);
        System.out.println("\n◠◡✦✧Задание 9✧✦◡◠");
        tasks.task9(new int[14]);
        System.out.println("\n◠◡✦✧Задание 10✧✦◡◠");
        tasks.task10(new int[25]);
        System.out.println("\n◠◡✦✧Задание 11✧✦◡◠");
        tasks.task11(new int[25]);
        System.out.println("\n◠◡✦✧Задание 12✧✦◡◠");
        tasks.task12(new int[25]);
    }

}

class Tasks {
    Random random = new Random();

    // Заполнить массив из 15 элементов случайными числами от -50 до 50 и вывести его на экран.
    void task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 51);
            System.out.print(array[i] + " ");
        }
    }

    //Создать массив из 12 случайных чисел от -30 до 30 и найти длину этого массива.
    void task2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-30, 31);
            System.out.print(array[i] + " ");
        }
        System.out.println(array.length);
    }

    //Заполнить массив из 10 случайных чисел от -40 до 40 и вывести первый элемент массива.
    void task3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-40, 41);
            System.out.print(array[i] + " ");
        }

        System.out.println(array[0]);
    }

    //Создать массив из 14 случайных чисел от -25 до 25 и вывести последний элемент массива.
    void task4(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-25, 26);
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }

    //Заполнить массив из 10 случайных чисел от -15 до 15 и найти сумму всех элементов массива.
    void task5(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-15, 16);
            sum += array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println("\nСумма всех элементов: " + sum);
    }

    //Создать массив из 20 случайных чисел от -30 до 30 и подсчитать, сколько в нем положительных чисел.
    void task6(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-30, 31);
            if (array[i] > 0) {
                count++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Положительных значений в массиве - " + count + " шт");
    }

    //Заполнить массив из 18 случайных чисел от -40 до 40 и подсчитать количество отрицательных чисел.
    void task7(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-40, 41);
            if (array[i] < 0) {
                count++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nОтрицательных значений в массиве - " + count + " шт");
    }

    //Создать массив из 16 случайных чисел от -25 до 25 и подсчитать, сколько в нем четных чисел.
    void task8(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-25, 26);
            if (array[i] % 2 == 0) {
                count++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nЧетных значений в массиве - " + count + " шт");
    }

    //Заполнить массив из 14 случайных чисел от -35 до 35 и подсчитать количество нечетных чисел.
    void task9(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-35, 36);
            if (array[i] % 2 != 0) {
                count++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nНечетных значений в массиве - " + count + " шт");
    }

    //Создать массив из 25 случайных чисел от -10 до 10 и подсчитать, сколько в нем нулей.
    void task10(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 11);
            if (array[i] == 0) {
                count++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nНулей в массиве - " + count + " шт");
    }

    //Заполнить массив из 15 случайных чисел от -60 до 60 и найти максимальный элемент.
    void task11(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(-60, 61);
            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nМаксимальное значение : " + max);
    }

    //Создать массив из 17 случайных чисел от -70 до 70 и найти минимальный элемент.
    void task12(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-70, 71);
            if (array[i] < min) {
                min = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nМинимальное значение : " + min);
    }
}
