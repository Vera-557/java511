package S1po11;

import java.util.Random;

public class LessonNine {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        System.out.println("(ノ°∀°)ノ⌒･*:.｡. .｡.:*･゜ﾟ･*☆ ОЧЕНЬ ПРОСТЫЕ");
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
        System.out.println("(ノ°∀°)ノ⌒･*:.｡. .｡.:*･゜ﾟ･*☆ ПРОСТЫЕ");
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
        System.out.println("(ノ°∀°)ノ⌒･*:.｡. .｡.:*･゜ﾟ･*☆ СРЕДНИЕ");
        System.out.println("\n◠◡✦✧Задание 13✧✦◡◠");
        tasks.task13(new int[12]);
        System.out.println("\n◠◡✦✧Задание 14✧✦◡◠");
        tasks.task14(new int[15]);
        System.out.println("\n◠◡✦✧Задание 15✧✦◡◠");
        tasks.task15(new int[16]);
        System.out.println("\n◠◡✦✧Задание 16✧✦◡◠");
        tasks.task16(new int[14]);
        System.out.println("\n◠◡✦✧Задание 17✧✦◡◠");
        tasks.task17(new int[12]);
        System.out.println("\n◠◡✦✧Задание 18✧✦◡◠");
        tasks.task18(new int[13]);
        System.out.println("\n◠◡✦✧Задание 19✧✦◡◠");
        tasks.task19(new int[20]);
        System.out.println("\n◠◡✦✧Задание 20✧✦◡◠");
        tasks.task20(new int[11]);
        System.out.println("(ノ°∀°)ノ⌒･*:.｡. .｡.:*･゜ﾟ･*☆ СЛОЖНЫЕ");
        System.out.println("\n◠◡✦✧Задание 21✧✦◡◠");
        tasks.task21(new int[18]);
        System.out.println("\n◠◡✦✧Задание 22✧✦◡◠");
        tasks.task22(new int[22]);
        System.out.println("\n◠◡✦✧Задание 23✧✦◡◠");
        tasks.task23(new int[8]);
        System.out.println("\n◠◡✦✧Задание 24✧✦◡◠");
        tasks.task24(new int[15]);
        System.out.println("\n◠◡✦✧Задание 25✧✦◡◠");
        tasks.task25(new int[20]);
        System.out.println("\n◠◡✦✧Задание 26✧✦◡◠");
        tasks.task26(new int[16]);
        System.out.println("\n◠◡✦✧Задание 27✧✦◡◠");
        tasks.task27(new int[25]);
        System.out.println("\n◠◡✦✧Задание 28✧✦◡◠");
        tasks.task28(new int[18]);
        System.out.println("\n◠◡✦✧Задание 29✧✦◡◠");
        tasks.task29(new int[12]);
        System.out.println("\n◠◡✦✧Задание 30✧✦◡◠");
        tasks.task30(new int[20]);
    }
}


class Tasks {
    Random random = new Random();

    // Заполнить массив из 15 элементов случайными числами от -50 до 50 и вывести его на экран.
    void task1(int[] array) {
        System.out.println("Заполнить массив из 15 элементов случайными числами от -50 до 50 и вывести его на экран.");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 51);
            System.out.print(array[i] + " ");
        }
    }

    //Создать массив из 12 случайных чисел от -30 до 30 и найти длину этого массива.
    void task2(int[] array) {
        System.out.println("Создать массив из 12 случайных чисел от -30 до 30 и найти длину этого массива.");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-30, 31);
            System.out.print(array[i] + " ");
        }
        System.out.println(array.length);
    }

    //Заполнить массив из 10 случайных чисел от -40 до 40 и вывести первый элемент массива.
    void task3(int[] array) {
        System.out.println("Заполнить массив из 10 случайных чисел от -40 до 40 и вывести первый элемент массива.");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-40, 41);
            System.out.print(array[i] + " ");
        }

        System.out.println(array[0]);
    }

    //Создать массив из 14 случайных чисел от -25 до 25 и вывести последний элемент массива.
    void task4(int[] array) {
        System.out.println("Создать массив из 14 случайных чисел от -25 до 25 и вывести последний элемент массива.");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-25, 26);
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }

    //Заполнить массив из 10 случайных чисел от -15 до 15 и найти сумму всех элементов массива.
    void task5(int[] array) {
        System.out.println("Заполнить массив из 10 случайных чисел от -15 до 15 и найти сумму всех элементов массива.");
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
        System.out.println("Создать массив из 20 случайных чисел от -30 до 30 и подсчитать, сколько в нем положительных чисел.");
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
        System.out.println("Заполнить массив из 18 случайных чисел от -40 до 40 и подсчитать количество отрицательных чисел.");
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
        System.out.println("Создать массив из 16 случайных чисел от -25 до 25 и подсчитать, сколько в нем четных чисел.");
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
        System.out.println("Заполнить массив из 14 случайных чисел от -35 до 35 и подсчитать количество нечетных чисел.");
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
        System.out.println("Создать массив из 25 случайных чисел от -10 до 10 и подсчитать, сколько в нем нулей.");
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
        System.out.println("Заполнить массив из 15 случайных чисел от -60 до 60 и найти максимальный элемент.");
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
        System.out.println("Создать массив из 17 случайных чисел от -70 до 70 и найти минимальный элемент");
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

    //Заполнить массив из 12 случайных чисел от -20 до 20 и вывести массив в обратном порядке (задом наперед).
    void task13(int[] array) {
        System.out.println("Заполнить массив из 12 случайных чисел от -20 до 20 и вывести массив в обратном порядке (задом наперед)");
        System.out.println("Изначальный вид массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-20, 21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Перевернутый массив:");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    //Создать массив из 15 случайных чисел от -25 до 25 и вывести только положительные элементы.
    void task14(int[] array) {
        System.out.println("Создать массив из 15 случайных чисел от -25 до 25 и вывести только положительные элементы.");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-25, 26);
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    //Заполнить массив из 16 случайных чисел от -35 до 35 и вывести только отрицательные элементы.
    void task15(int[] array) {
        System.out.println("Заполнить массив из 16 случайных чисел от -35 до 35 и вывести только отрицательные элементы.");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-35, 36);
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    //Создать массив из 14 случайных чисел от -20 до 20 и вывести только четные элементы.
    void task16(int[] array) {
        System.out.println("Создать массив из 14 случайных чисел от -20 до 20 и вывести только четные элементы.");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-20, 21);
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    //Заполнить массив из 12 случайных чисел от -30 до 30 и найти индекс максимального элемента.
    void task17(int[] array) {
        System.out.println("Заполнить массив из 12 случайных чисел от -30 до 30 и найти индекс максимального элемента.");
        int max = array[0];
        int maxIndex = 0;
        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-30, 31);
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение = " + max + ", его индекс = " + maxIndex);

    }

    //Создать массив из 13 случайных чисел от -40 до 40 и найти индекс минимального элемента.
    void task18(int[] array) {
        System.out.println("Создать массив из 13 случайных чисел от -40 до 40 и найти индекс минимального элемента.");
        System.out.println("Изначальный массив:");
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-40, 41);
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Минимальное значение в массиве = " + min + ", его индекс = " + minIndex);
    }

    //Заполнить массив из 20 случайных чисел от -45 до 45 и найти среднее арифметическое всех элементов.
    void task19(int[] array) {
        System.out.println("Заполнить массив из 20 случайных чисел от -45 до 45 и найти среднее арифметическое всех элементов.");
        System.out.println("Изначальный массив:");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-45, 46);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.println("Среднее арифметическое массива = " + ((double)sum / array.length));
    }

    //Создать массив из 11 случайных чисел от -30 до 30 и заменить все отрицательные элементы на их модули (абсолютные значения).
    void task20(int[] array) {
        System.out.println("Создать массив из 11 случайных чисел от -30 до 30 и заменить все отрицательные элементы на их модули (абсолютные значения).");
        System.out.println("Изначальный вид массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-30, 31);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Измененный массив:");
        for (int j = 0; j < array.length; j++) {
            array[j] = Math.abs(array[j]);
            System.out.print(array[j] + " ");
        }
    }
    //Заполнить массив из 18 случайных чисел от -50 до 50 и посчитать отдельно сумму положительных элементов и сумму отрицательных элементов.
    void task21(int[] array) {
        System.out.println("Заполнить массив из 18 случайных чисел от -50 до 50 и посчитать отдельно сумму положительных элементов и сумму отрицательных элементов.");
        System.out.println("Изначальный массив:");
        int sumPositive = 0;
        int sumNegative = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 51);
            if (array[i] > 0) {
                sumPositive += array[i];
            } else if (array[i] < 0) {
                sumNegative += array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Сумма всех положительных = " + sumPositive + ", сумма всех отрицательных = " + sumNegative);
    }
    //Создать массив из 22 случайных чисел от -80 до 80 и найти разницу между максимальным и минимальным элементом.
    void task22(int [] array) {
        System.out.println("Создать массив из 22 случайных чисел от -80 до 80 и найти разницу между максимальным и минимальным элементом.");
        System.out.println("Изначальный массив:");
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-80,81);
            if (array[i] < min){
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Минимальное значение = " + min + ", максимальное значение = " + max + ", разница между ними = " + (max - min));
    }
    //Заполнить массив из 8 случайных чисел от -5 до 5 и найти произведение всех элементов массива.
    void task23 (int [] array) {
        System.out.println("Заполнить массив из 8 случайных чисел от -5 до 5 и найти произведение всех элементов массива.");
        System.out.println("Изначальный массив:");
        int multiply = 1;
        for (int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(-5, 6);
            System.out.print(array[i] + " ");
           multiply *= array[i];
        }
        System.out.println();
        System.out.println("Произведение всех элементов массива = " + multiply);
    }
    //Создать массив из 15 случайных чисел от -40 до 40, найти среднее арифметическое и посчитать, сколько элементов больше среднего значения.
    void task24 (int [] array){
        System.out.println("Создать массив из 15 случайных чисел от -40 до 40, найти среднее арифметическое и посчитать, сколько элементов больше среднего значения.");
        System.out.println("Изначальный массив:");
        int count = 0;
        int sum = 0;
        double sredneeArifmeticheskoe = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-40,41);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        sredneeArifmeticheskoe = (double) sum/array.length;
        for (int i = 0; i< array.length; i++){
            if (array[i] > sredneeArifmeticheskoe){
                count++;
            }
        }

        System.out.println();
        System.out.println("Среднее арифметическое массива = " + sredneeArifmeticheskoe + ", в массиве " + count + " элементов больше среднего арифметического числа");
    }
    //Заполнить массив из 20 случайных чисел от -50 до 50 и найти второй максимальный элемент (второй по величине).
    void task25(int [] array){
        System.out.println("Заполнить массив из 20 случайных чисел от -50 до 50 и найти второй максимальный элемент (второй по величине).");
        System.out.println("Изначальный массив:");
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(-50,51);
            if(array[i] > max1){
                max1 = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальное число = " + max1);
        for (int i = 0; i < array.length; i++){
            if (array[i] > max2){
                if (array[i] == max1){
                    continue;
                }
                max2 = array[i];
            }
        }
        System.out.println();
        System.out.println("Второй максимальный элемент = " + max2);
    }
    //Создать массив из 16 случайных чисел от -30 до 30 и найти сумму элементов, которые стоят на четных позициях (индексы 0, 2, 4, 6...).
    void task26 (int [] array) {
        System.out.println("Создать массив из 16 случайных чисел от -30 до 30 и найти сумму элементов, которые стоят на четных позициях (индексы 0, 2, 4, 6...).");
        System.out.println("Изначальный массив");
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(-30, 31);
            if (i % 2 == 0){
                sum += array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Сумма элементов массива по четным индексам = " + sum);
    }
    //Заполнить массив из 25 случайных чисел от -50 до 50 и подсчитать, сколько элементов находится в диапазоне от -10 до 10 (включительно).
    void task27 (int [] array) {
        System.out.println("Заполнить массив из 25 случайных чисел от -50 до 50 и подсчитать, сколько элементов находится в диапазоне от -10 до 10 (включительно).");
        System.out.println("Изначальный массив");
        int count = 0;
        for (int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(-5, 51);
            if (array[i] >= -10 && array[i] <= 10){
                count ++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Количество элементов в диапазоне от -10 до 10 : " + count + " шт");
    }
    //Создать массив из 18 случайных чисел от -20 до 20, найти максимальный элемент и вывести все индексы, на которых он встречается.
    void task28 (int [] array) {
        System.out.println("Создать массив из 18 случайных чисел от -20 до 20, найти максимальный элемент и вывести все индексы, на которых он встречается.");
        System.out.println("Изначальный массив:");
        int max = 0;
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(-20,21);
            if (array[i] > max){
                max = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Индексы максимальных элементов:");
        for (int i = 0; i < array.length; i ++){
            if (array[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //Заполнить массив из 12 случайных чисел от -10 до 10 и найти произведение только положительных элементов.
    void task29 (int [] array) {
        System.out.println("Заполнить массив из 12 случайных чисел от -10 до 10 и найти произведение только положительных элементов.");
        System.out.println("Изначальный массив:");
        int multiply = 1;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-10,11);
            if (array[i] > 0) {
                multiply *= array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Результат умножения положительных чисел = " + multiply);
    }
    //Создать массив из 20 случайных чисел от -30 до 30 и найти самую длинную последовательность идущих подряд положительных чисел (сколько положительных чисел подряд максимум).
    void task30 (int [] array) {
        System.out.println("Создать массив из 20 случайных чисел от -30 до 30 и найти самую длинную последовательность идущих подряд положительных чисел (сколько положительных чисел подряд максимум).");
        System.out.println("Изначальный массив:");
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(-30, 31);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0 ){
                count++;
            }else {
//                if (count > maxCount){
//                    maxCount = count;
//                }
                count = 0;
            }
            if (count > maxCount){
                maxCount = count;
            }
        }
        System.out.println();
        //System.out.println(count);
        System.out.println("Максимальный цикл положительных переменных = " + maxCount);
    }
}
