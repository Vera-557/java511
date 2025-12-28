package LessonTwentyFour;

/*
Задание 2: Простой калькулятор операций
Создай enum Operation с элементами ADD, SUBTRACT, MULTIPLY, DIVIDE.
Добавь в него метод apply(double a, double b), который выполняет соответствующую арифметическую операцию над двумя числами и возвращает результат.

Задание 3: Статус заказа
Создай enum OrderStatus со значениями: NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED.
Напиши метод isCompleted(), который возвращает true, если статус заказа является конечным (т.е. DELIVERED или CANCELLED).

Задание 4: Цвета светофора
Создай enum TrafficLight с элементами RED, YELLOW, GREEN.
Реализуй метод getNext(), который возвращает следующий цвет светофора в стандартной последовательности: RED → GREEN → YELLOW → RED и так далее.

Задание 5: Планеты и их масса
Создай enum Planet с несколькими планетами (например, MERCURY, VENUS, EARTH).
Добавь в него поле mass (масса) и конструктор для его инициализации.
Напиши метод getMass(), возвращающий массу планеты.
 */
public class EnumLesson {
    public static void main(String[] args) {
        System.out.println("જ⁀➴જ⁀➴જ⁀➴*ੈ\uD804༘⋆\uD83D\uDCA3\t\t\t\t\tЗадание 1:");
        System.out.println("У нас выходной? " + DayOfWeek.MONDAY.dayOfWeekInRussian + " " + DayOfWeek.MONDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.TUESDAY.dayOfWeekInRussian + " " + DayOfWeek.TUESDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.WEDNESDAY.dayOfWeekInRussian + " " + DayOfWeek.WEDNESDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.THURSDAY.dayOfWeekInRussian + " " + DayOfWeek.THURSDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.FRIDAY.dayOfWeekInRussian + " " + DayOfWeek.FRIDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.SATURDAY.dayOfWeekInRussian + " " + DayOfWeek.SATURDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.SUNDAY.dayOfWeekInRussian + " " + DayOfWeek.SUNDAY.isWeekend());
    }
}
