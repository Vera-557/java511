package LessonTwentyFour;

/*
Задание 2: Простой калькулятор операций
Создай enum Operation с элементами ADD, SUBTRACT, MULTIPLY, DIVIDE.
Добавь в него метод apply(double a, double b), который выполняет соответствующую арифметическую операцию над двумя числами и возвращает результат.
 */
public enum Operation {
    ADD("Сложение") {
        @Override
        double apply(double a, double b) {
            return a + b;
        }
    }, SUBTRACT("Вычитание") {
        @Override
        double apply(double a, double b) {
            return a - b;
        }
    }, MULTIPLY("Умножение") {
        @Override
        double apply(double a, double b) {
            return a * b;
        }
    }, DIVIDE("Деление") {
        @Override
        double apply(double a, double b) {
            if (b == 0) {
                System.out.println("Делитель не может быть равен нулю");
                return 0;
            }
            return a / b;
        }
    };
    final String option;

    Operation(String option) {
        this.option = option;
    }

    abstract double apply(double a, double b);
}
