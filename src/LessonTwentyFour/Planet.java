package LessonTwentyFour;

/*
Задание 5: Планеты и их масса
Создай enum Planet с несколькими планетами (например, MERCURY, VENUS, EARTH).
Добавь в него поле mass (масса) и конструктор для его инициализации.
Напиши метод getMass(), возвращающий массу планеты.
 */
public enum Planet {
    MERCURY("Меркурий", 0) {
        @Override
        double getMass() {
            return 0;
        }
    },
    VENUS ("Венера", 0){
        @Override
        double getMass() {
            return 0;
        }
    },
    EARTH("Земля", 0) {
        @Override
        double getMass() {
            return 0;
        }
    };
    final String planet;
    final double mass;

    abstract double getMass();

    Planet(String planet, double mass) {
        this.planet = planet;
        this.mass = mass;
    }
}
