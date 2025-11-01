import java.util.Random;

public class LessonNine {
    /*
    ### Задание 1
Заполнить массив из 15 элементов случайными числами от -50 до 50 и вывести его на экран.

### Задание 2
Создать массив из 12 случайных чисел от -30 до 30 и найти длину этого массива.

### Задание 3
Заполнить массив из 10 случайных чисел от -40 до 40 и вывести первый элемент массива.

### Задание 4
Создать массив из 14 случайных чисел от -25 до 25 и вывести последний элемент массива.

### Задание 5
Заполнить массив из 10 случайных чисел от -15 до 15 и найти сумму всех элементов массива.
    */
    public static void main(String[] args) {
        System.out.println("◠◡✦✧Задание 1✧✦◡◠");
        Random random = new Random();
        int [] array1 = new int[15];
        for (int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(-50,51);
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n◠◡✦✧Задание 2✧✦◡◠");
        int [] array2 = new int[12];
        for (int i  = 0; i < array2.length; i++){
            array2[i] = random.nextInt(-30,31);
            System.out.print(array2[i] + " ");
        }
        System.out.println(array2.length);
        System.out.println("\n◠◡✦✧Задание 3✧✦◡◠");
        int [] array3 = new int[10];
        for (int i = 0; i < array3.length; i++){
            array3[i] = random.nextInt(-40,41);
        }
        System.out.println(array3[0]);
        System.out.println("\n◠◡✦✧Задание 4✧✦◡◠");
        int [] array4 = new int[14];
        for (int i = 0; i < array4.length; i ++){
            array4[i] = random.nextInt(-25, 26);
        }
        System.out.println(array4[13]);
        System.out.println("◠◡✦✧Задание 5✧✦◡◠");
        int [] array5 = new int[10];
        for (int i = 0; i < array5.length; i++){
            array5[i] = random.nextInt(-15,16);
            array5[i] += i;
            System.out.print(array5[i] + " ");
        }
        System.out.println("\n◠◡✦✧Задание 6✧✦◡◠");
        int [] array6 = new int[20];
        int count = 0;
        for (int i = 0; i < array6.length; i++) {
            array6[i] = random.nextInt(-30,31);
            System.out.print(array6[i] + " ");
            if (array6[i] > 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Положительных значений в массиве - " + count + " шт");
        /*
        ## УРОВЕНЬ 2: ЛЕГКИЕ (Подсчет элементов)

### Задание 6
Создать массив из 20 случайных чисел от -30 до 30 и подсчитать, сколько в нем положительных чисел.

---

### Задание 7
Заполнить массив из 18 случайных чисел от -40 до 40 и подсчитать количество отрицательных чисел.

---

### Задание 8
Создать массив из 16 случайных чисел от -25 до 25 и подсчитать, сколько в нем четных чисел.

---

### Задание 9
Заполнить массив из 14 случайных чисел от -35 до 35 и подсчитать количество нечетных чисел.

---

### Задание 10
Создать массив из 25 случайных чисел от -10 до 10 и подсчитать, сколько в нем нулей.

---

### Задание 11
Заполнить массив из 15 случайных чисел от -60 до 60 и найти максимальный элемент.

---

### Задание 12
Создать массив из 17 случайных чисел от -70 до 70 и найти минимальный элемент.

---
         */
    }

}
