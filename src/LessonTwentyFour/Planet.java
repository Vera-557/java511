package LessonTwentyFour;

import static java.lang.Math.pow;

/*
Задание 5: Планеты и их масса
Создай enum Planet с несколькими планетами (например, MERCURY, VENUS, EARTH).
Добавь в него поле mass (масса) и конструктор для его инициализации.
Напиши метод getMass(), возвращающий массу планеты.
 */
public enum Planet {
    MERCURY("Меркурий", ( 3.3 * pow(10, 23))) {
        @Override
        double getMass() {
            return MERCURY.mass;
        }
    },
    VENUS("Венера", (4.8675 * pow(10, 24))) {
        @Override
        double getMass() {
            return VENUS.mass;
        }
    },
    EARTH("Земля", (5.9722 * pow(10, 24))) {
        @Override
        double getMass() {
            return EARTH.mass;
        }
    };
    final String planet;
    private final double mass;
    abstract double getMass();

    Planet(String planet, double mass) {
        this.planet = planet;
        this.mass = mass;
    }
}
