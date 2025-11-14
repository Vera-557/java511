package S1po11;

import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t✧~ ༼ つ ◕_◕ ༽つ ~♡ Задача 1");
        System.out.println("Введите цену товара и процент скидки");
        double price = scanner.nextDouble();
        int discount = scanner.nextInt();
        discountCounter(price,discount);
        System.out.println("\n\t\t✧~ ༼ つ ◕_◕ ༽つ ~♡ Задача 2");
        System.out.println("\nВведите 3 оценки для рассчета среднего балла");
        int marks = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();
        System.out.printf("Ваш средний балл равен - %.2f \n", srednijBal(marks, marks2,marks3));

         /* Если бы я объявила сканер полем класса, можно было бы сделать такой метод.
        Это еще один способ решения задачи.
        int marks = 0;
        for (int i = 0; i <3; i ++){
            marks += scanner.nextInt();
        }
       double middleMarks = (double) marks / 3;
        System.out.println(middleMarks);

         */
        System.out.println("\t\t✧~ ༼ つ ◕_◕ ༽つ ~♡ Задача 3");
        System.out.println("Введите число, проверим делится ли оно на 2,3,5?");
        int a = scanner.nextInt();
        ifDiv(a);
        System.out.println("\t\t✧~ ༼ つ ◕_◕ ༽つ ~♡ Задача 4");
        System.out.println("Введите число, мы проверим - чётное оно или нечётное:");
        int value = scanner.nextInt();
        evenOrOdd(value);
        System.out.println("\n\t\t✧~ ༼ つ ◕_◕ ༽つ ~♡ Задача 5");
        variables();
        System.out.println("\n\t\t✧~ ༼ つ ◕_◕ ༽つ ~♡ Задача 6");
        System.out.println("Введите 2 числа - делимое и делитель ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        twoValues(first,second);
    }

    static void discountCounter (double price, int discount){
        //Задача 1: Скидка на товар
        //Напишите программу, которая запрашивает у пользователя цену товара и процент скидки,
        //затем выводит финальную цену с использованием printf
        if (price > 0 && discount > 0) {
       double discountSumm = price/100 * discount;
       double finalPrice = price - discountSumm;
       System.out.printf("Изначальная цена покупки: %.2f рублей, цена с учетом скидки в %d процента = %.2f рублей, сумма скидки составила: %.2f рублей", price,discount, finalPrice, discountSumm);
         }else System.out.println("Значение скидки и цены должно быть больше 0");
    }
    static double srednijBal (int a, int b, int c) {
        //Задача 2:
        //Пользователь вводит 3 оценки. Вычислите средний балл используя явное преобразование типов.
        return (double) (a + b + c) / 3;
    }
    static void ifDiv(int a) {
        //Задача 3
        //Напишите программу, которая запрашивает число у пользователя и проверяет:
        //Делится ли оно на 2?
        //Делится ли оно на 3?
        //Делится ли оно на 5?
        //Используйте printf для вывода результатов.
//        if (a % 2 == 0) {
//            System.out.println(a + " делится на 2");
//        } else System.out.println(a + " не делится на 2");
//        if (a % 3 == 0) {
//            System.out.println(a + " делится на 3");
//        } else System.out.println(a + " не делится на 2");
//        if (a % 5 == 0) {
//            System.out.println(a + " делится на 5");
//        } else System.out.println(a + " не делится на 2");
//        System.out.println("");
        //не дочитала задание, надо все в принтф, используем тернальный оператор
        System.out.printf("Число %d: на 2 - %s, на 3 - %s, на 5 - %s",
                a,
                (a % 2 == 0) ? "делится" : "не делится",
                (a % 3 == 0) ? "делится" : "не делится",
                (a % 5 == 0) ? "делится" : "не делится");
        System.out.println();
    }
    static void evenOrOdd (int value){
        //Задача 4
        //Создайте программу, которая проверяет число которое ввел пользователь,
        //является ли число четным или нечетным.
        if (value == 0){
            System.out.println("Число не должно быть равно нулю");
            return;
        }
        System.out.printf("Число %d - %s", value,(value%2==0? "чётное":"нечётное"));
    }
    static void variables (){
        //Задача 5:
        //Создайте переменные:
        //String name = "Иван"
        //int age = 25
        //double height = 1.78
        //char group = 'A'
        //boolean isStudent = true
        //Выведите их используя printf
        String name = "Иван";
        int age = 25;
        double height = 1.78;
        char group = 'A';
        boolean isStudent = true;
        System.out.printf("Имя - %s, возраст - %d лет, рост - %.2f, группа - %c, является студентом? - %b", name,age,height,group,isStudent);
    }
    static void twoValues (int a, int b){
        //Задача 6:
//Напишите программу, которая:
//Запрашивает два числа у пользователя
//Выводит результат деления
//Выводит остаток от деления
//
//  Пример
//  Введите 1-ое число : 25
//  Введите 2-ое число : 4
//  Результат деления : 6
//  Остаток : 1
        double number = (double) a / (double) b;
        double ostatok = (number - (int)number) * 10;
        System.out.printf("Первое число - %d делить на второе число - %d", a,b);
        System.out.printf("%n%d - целая часть, %d - остаток %n", (int)number, (int)ostatok);
        //Как-то так, надеюсь, я правильно поняла задание
    }
}
