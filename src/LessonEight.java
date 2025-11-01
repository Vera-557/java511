import java.util.Scanner;

public class LessonEight {
    /*

//1. Четные числа
//Напишите программу, которая считывает число N и выводит все четные числа от 1 до N.

//2. Не четные числа
//Напишите программу, которая считывает число N и выводит все не четные числа от 1 до N.

//3. Количество не четных чисел
//Напишите программу, которая считывает число N и выводит Количество не четных чисел от 1 до N.

//4. Количество четных чисел
//Напишите программу, которая считывает число N и выводит Количество четных чисел от 1 до N.

//5. Сумма положительных
//Программа считывает N-N чисел (Где начало и конец вводит пользователь). Найдите сумму только положительных чисел.

//6. Сумма отрицательных
//Программа считывает N-N чисел (Где начало и конец вводит пользователь). Найдите сумму только отрицательных чисел.
//
//7. Таблица умножения
//Считайте число N и выведите таблицу умножения для этого числа (от 1 до 10).

//8. Сумма положительных
//Программа считывает N-N чисел (Где начало и конец вводит пользователь). Найдите количество
//-положительных
//-отрицательных
//-четных
//-не четных
//-числа которые делятся на 3 и на 4 без остатка
//-числа которые делятся на 4 и на 5 без остатка
//-числа которые делятся на 2 и на 7 без остатка
//-числа которые делятся на 3 или на 4 без остатка
//-числа которые делятся на 5 или на 7 без остатка

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение N, мы выведем на экран все четные числа от 1 до N");
        int n1 = scanner.nextInt();
        isEven(n1);
        System.out.println("Введите значение N, мы выведем на экран все нечетные числа от 1 до N");
        int n2 = scanner.nextInt();
        isUneven(n2);
        System.out.println("Введите значение N, мы выведем на экран количество четных чисел от 1 до N");
        int n3 = scanner.nextInt();
        isEvenCount(n3);
        System.out.println("Введите значение N, мы выведем на экран количество нечетных чисел от 1 до N");
        int n4 = scanner.nextInt();
        isUnevenCount(n4);
        System.out.println("Введите значение N начало и N конец, мы выведем на экран сумму только положительных чисел");
        int n5 = scanner.nextInt();
        int n6 = scanner.nextInt();
        summPositiveNumbers(n5,n6);
        System.out.println("Введите значение N начало и N конец, мы выведем на экран сумму только отрицательных чисел");
        int n7 = scanner.nextInt();
        int n8 = scanner.nextInt();
        summNegativeNumbers(n7,n8);
        System.out.println("Введите число для расчёта в таблице умножения");
        int n9 = scanner.nextInt();
        tablicaUmnogenija(n9);
        System.out.println("-----Второй способ решения задачи -----");
        tablicaUmnogenijaVtorojSposob(n9);
        System.out.println("Введите значение N начало и N конец, мы выведем на экран количество чисел каждого сегмента: отрицательных, положительных, чётных, нечётных ");
        int n10 = scanner.nextInt();
        int n11 = scanner.nextInt();
        if (n11 < n10) {
            System.out.println("Ошибка: конечное значение должно быть больше начального!");
            return;
        }
        summOfAllSections(n10, n11);
    }
    static void isEven (int n) {
     for (int i = 1; i <= n; i ++) {
         if (i % 2 == 0) {
             System.out.print(i + " ");
         }
     }
        System.out.println();
    }
    static void isUneven (int n) {
        for (int i = 1; i <= n; i ++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    static void isEvenCount (int n) {
        int count = 0;
        for (int i = 1; i <= n; i ++) {
            if (i % 2 == 0) {
               count ++;
            }
        }
        System.out.println(count + " четных чисел от 1 до N");
    }
    static void isUnevenCount (int n) {
        int count = 0;
        for (int i = 1; i <= n; i ++) {
            if (i % 2 != 0) {
                count ++;
            }
        }
        System.out.println(count + " нечетных чисел от 1 до N");
    }
    static void summPositiveNumbers (int n1, int n2) {
        int summ = 0;
        for (int i = n1; i <= n2; i ++) {
            if (i > 0){
               summ += i;
            }

        }
        System.out.println("Сумма положительных чисел: " + summ);
    }
    static void summNegativeNumbers (int n1, int n2) {
        int summ = 0;
        for (int i = n1; i <= n2; i ++) {
            if (i < 0){
                summ += i;
            }

        }
        System.out.println("Сумма отрицательных чисел: " + summ);
    }
    static void tablicaUmnogenija (int n){
        System.out.println("N * 1 = " + n * 1 + " " +
                "\nN * 2 = " + n * 2 + " " +
                "\nN * 3 = " + n * 3 + " " +
                "\nN * 4 = " + n * 4 + " " +
                "\nN * 5 = " + n * 5 + " " +
                "\nN * 6 = " + n * 6 + " " +
                "\nN * 7 = " + n * 7 + " " +
                "\nN * 8 = " + n * 8 + " " +
                "\nN * 9 = " + n * 9 + " " +
                "\nN * 10 = " + n * 10 + " " );

    }
    static void tablicaUmnogenijaVtorojSposob (int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
    static void summOfAllSections (int n1, int n2){
        int countNegative = 0;
        int countPositive = 0;
        int countEven = 0;
        int countUneven = 0;
        int countDivBy3And4 = 0;
        int countDivBy4And5 = 0;
        int countDivBy2And7 = 0;
        int countDivBy3Or4 = 0;
        int countDivBy5Or7 = 0;
        for (int i = n1; i < n2; i ++){
            if (i < 0) {
                countNegative++;
            }
            if (i > 0) {
                countPositive++;
            }
            if (i % 2 == 0) {
                countEven++;
            } else countUneven++;
            if (i % 3 == 0 && i % 4 == 0) countDivBy3And4++;
            if (i % 4 == 0 && i % 5 == 0) countDivBy4And5++;
            if (i % 2 == 0 && i % 7 == 0) countDivBy2And7++;
            if (i % 3 == 0 || i % 4 == 0) countDivBy3Or4++;
            if (i % 5 == 0 || i % 7 == 0) countDivBy5Or7++;
        }
        System.out.println("Количество отрицательных чисел: " + countNegative + ", количество положительных чисел: " +
                countPositive + ", количество чётных чисел: " + countEven + ", количество нечётных чисел: " + countUneven);
        System.out.println("Делятся на 3 и 4: " + countDivBy3And4);
        System.out.println("Делятся на 4 и 5: " + countDivBy4And5);
        System.out.println("Делятся на 2 и 7: " + countDivBy2And7);
        System.out.println("Делятся на 3 или 4: " + countDivBy3Or4);
        System.out.println("Делятся на 5 или 7: " + countDivBy5Or7);
    }
}
