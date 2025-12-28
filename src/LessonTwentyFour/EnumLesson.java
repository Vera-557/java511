package LessonTwentyFour;
public class EnumLesson {
    public static void main(String[] args) {
        System.out.println("\n\nજ⁀➴જ⁀➴જ⁀➴*ੈ\uD804༘⋆\uD83D\uDCA3\t\t\t\t\tЗадание 1:\n\n");
        System.out.println("У нас выходной? " + DayOfWeek.MONDAY.dayOfWeekInRussian + " " + DayOfWeek.MONDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.TUESDAY.dayOfWeekInRussian + " " + DayOfWeek.TUESDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.WEDNESDAY.dayOfWeekInRussian + " " + DayOfWeek.WEDNESDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.THURSDAY.dayOfWeekInRussian + " " + DayOfWeek.THURSDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.FRIDAY.dayOfWeekInRussian + " " + DayOfWeek.FRIDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.SATURDAY.dayOfWeekInRussian + " " + DayOfWeek.SATURDAY.isWeekend());
        System.out.println("У нас выходной? " + DayOfWeek.SUNDAY.dayOfWeekInRussian + " " + DayOfWeek.SUNDAY.isWeekend());
        System.out.println("\n\nજ⁀➴જ⁀➴જ⁀➴*ੈ\uD804༘⋆\uD83D\uDCA3\t\t\t\t\tЗадание 2:\n\n");
        System.out.println(Operation.ADD.apply + " " + Operation.ADD.apply(4, 8.5));
        System.out.println(Operation.SUBTRACT.apply + " " + Operation.SUBTRACT.apply(4, 8.5));
        System.out.println(Operation.MULTIPLY.apply + " " + Operation.MULTIPLY.apply(4, 8.5));
        System.out.println(Operation.DIVIDE.apply + " " + Operation.DIVIDE.apply(4, 8.5));
        System.out.println("\n\nજ⁀➴જ⁀➴જ⁀➴*ੈ\uD804༘⋆\uD83D\uDCA3\t\t\t\t\tЗадание 3:\n\n");
        System.out.println("Статус заказа: " + OrderStatus.NEW.status + (OrderStatus.NEW.isCompleted()? " : завершен" : " : не завершен"));
        System.out.println("Статус заказа: " + OrderStatus.PROCESSING.status + (OrderStatus.PROCESSING.isCompleted()? " : завершен" : " : не завершен"));
        System.out.println("Статус заказа: " + OrderStatus.DELIVERED.status + (OrderStatus.DELIVERED.isCompleted()? " : завершен" : " : не завершен"));
        System.out.println("Статус заказа: " + OrderStatus.CANCELLED.status + (OrderStatus.CANCELLED.isCompleted()? " : завершен" : " : не завершен"));
        System.out.println("\n\nજ⁀➴જ⁀➴જ⁀➴*ੈ\uD804༘⋆\uD83D\uDCA3\t\t\t\t\tЗадание 4:\n\n");
        System.out.println(TrafficLight.GREEN.colour + " " + TrafficLight.GREEN.getNext());
        System.out.println(TrafficLight.RED.colour + " " +TrafficLight.RED.getNext());
        System.out.println(TrafficLight.YELLOW.colour + " " + TrafficLight.YELLOW.getNext());
        System.out.println("\n\nજ⁀➴જ⁀➴જ⁀➴*ੈ\uD804༘⋆\uD83D\uDCA3\t\t\t\t\tЗадание 5:\n\n");
    }
}
