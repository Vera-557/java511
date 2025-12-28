package LessonTwentyFour;
/*
Задание 1: Базовые дни недели
Создай enum DayOfWeek, представляющий дни недели (MONDAY, TUESDAY, ..., SUNDAY).
Напиши метод isWeekend(), который возвращает true, если день является субботой или воскресеньем.
 */
public enum DayOfWeek {
    MONDAY("Понедельник"){
        @Override
        boolean isWeekend() {
            return false;
        }
    },
    TUESDAY("Вторник"){
        @Override
        boolean isWeekend() {
            return false;
        }
    },
    WEDNESDAY("Среда"){
        @Override
        boolean isWeekend() {
            return false;
        }
    },
    THURSDAY("Четверг"){
        @Override
        boolean isWeekend() {
            return false;
        }
    },
    FRIDAY("Пятница"){
        @Override
        boolean isWeekend() {
            return false;
        }
    },
    SATURDAY("Суббота"){
        @Override
        boolean isWeekend() {
            return true;
        }
    },
    SUNDAY("Воскресенье"){
        @Override
        boolean isWeekend() {
            return true;
        }
    };

    abstract boolean isWeekend();
    String dayOfWeekInRussian;

    DayOfWeek(String dayOfWeekInRussian) {
        this.dayOfWeekInRussian = dayOfWeekInRussian;
    }
}
