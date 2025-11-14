package S1po11;

public class SecondLesson {
    public static void main(String[] args) {
        //1. ПриветствиеСоздай переменную с твоим именем и выведи: "Привет, [имя]!"
        String myName = "Вера";
        //2. Возраст через 5 летСоздай переменную age = 15, посчитай и выведи, сколько тебе будет через 5 лет.
        //Сделаем 5 лет, как константу, например это срок окончания вуза и студенты хотят знать, сколько им будет лет в конце пути
        System.out.println("\t\tЗадание 1 и 2");
        int StudyTime = 5;
        int myAge = 33;
        int myAgeIn5Years = myAge + StudyTime;
        System.out.println("Меня зовут " + myName + ", мне сейчас " + myAge + ", через 5 лет мне будет " + myAgeIn5Years );
        //3. Периметр прямоугольникаДаны стороны a = 5 и b = 8. Посчитай периметр (P = 2×(a+b)).
        //Создадим метод, чтоб код был по-красивее
        System.out.println("\t\tЗадание 3");
        System.out.println("Периметр прямоугольника со значениями 5 и 7 равен: " + findPerimeter(5,7));
        //4. Цена со скидкойЦена товара price = 1000, скидка discount = 15 (процентов). Посчитай финальную цену.
        System.out.println("\t\tЗадание 4");
        discountPriceCalculater(1000, 15);
        //5. Конвертер температурыДано celsius = 25. Переведи в Фаренгейты (F = C × 1.8 + 32).
        System.out.println("\n\t\tЗадание 5");
        int celsius = 25;
        System.out.println("Переведём градусы из Цельсия в Фаренгейт: " + celsius + " градусов по Цельсию = " +
                celsiusToFarengateConverter(celsius) + " по Фаренгейту");
        //6. Среднее арифметическоеДаны три числа: a = 10, b = 20, c = 30. Найди их среднее.
        System.out.println("\t\tЗадание 6");
        sredneeArifmeticheskoe(10,20,30);
        //7. Чётное или нечётноеСоздай переменную number = 7. Выведи остаток от деления на 2 (если 0 — чётное, если 1 — нечётное).
        System.out.println("\n\t\tЗадание 7");
        isEven();
        //8. Обмен значений Даны x = 5 и y = 10. Поменяй их значения местами (используй третью переменную).
        System.out.println("\t\tЗадание 8");
        changeValues(5,10);
        //9. Форматированный выводВыведи:
        //Товар:     Яблоко
        //Цена:      50 руб
        //Количество: 3
        //Используй \t для выравнивания.
        System.out.println("\t\tЗадание 9");
        System.out.println("Товар:\t\t\tЯблоко");
        System.out.println("Цена:\t\t\t50 руб");
        System.out.println("Количество:\t\t3");
        //Вроде так выглядит, надеюсь, я правильно поняла задание ☻
    }
    static int findPerimeter (int a, int b){
        return 2 * (a + b);
    }
    static void discountPriceCalculater(int price, int discount){
        int discountSumm = price / 100 * discount;
        int discountPrice = price - discountSumm;
        System.out.printf("Изначальная цена покупки: %d рублей, цена с учетом скидки: %d рублей, сумма скидки составила: %d рублей", price, discountPrice, discountSumm);
    }
    static double celsiusToFarengateConverter(int celsius){
        return celsius * 1.8 + 32;
    }
    static void sredneeArifmeticheskoe (int a, int b, int c){
        System.out.printf("Среднее арифметическое между %d, %d, %d = " + (a + b + c) / 3, a, b, c);
    }
    static void isEven (){
        int number = 7;
        if (number % 2 == 0){
            System.out.println("Чётное - " + 0);
        } else System.out.println("Нечётное - " + 1);
    }
    static void changeValues (int x, int y) {
        System.out.println("Изначальные значения:");
        System.out.println("X = " + x + "; Y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Поменяем их местами:");
        System.out.println("X = " + x + "; Y = " + y);
    }
}
