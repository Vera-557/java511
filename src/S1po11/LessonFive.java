package S1po11;

import java.util.Scanner;

public class LessonFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int numNedeli = scanner.nextInt();
        System.out.println(denNedeli(numNedeli));
        System.out.println("Введите оценку от 1 до 5");
        int ocenka = scanner.nextInt();
        System.out.println(ocenka(ocenka));
        System.out.println("Введите цвет светофора");
        String signal = scanner.next().toLowerCase();
        svetofor(signal);
        System.out.println("Укажите номер месяца (1-12), чтоб узнать количество дней");
        int nomerMesyaca = scanner.nextInt();
        System.out.println("В " + nomerMesyaca + " месяце " + kolichestvoDnei(nomerMesyaca));
        System.out.println("Вычислим значение на калькуляторе.");
        System.out.println("Введите 2 числа и операцию над ними / * - +");
        System.out.println("Первое число");
        int a = scanner.nextInt();
        System.out.println("Второе число");
        int b = scanner.nextInt();
        System.out.println("Символ операции (/ * - +)");
        char c = scanner.next().charAt(0);
        System.out.println(kalkulator(a,b, c));
//Средние
        System.out.println("Введите номер дня недели (1-7), чтоб узнать рабочий это день или выходной");
        int numberOfDay = scanner.nextInt();
        isWorkDay(numberOfDay);
        System.out.println("Укажите возраст для распределения его по категориям");
        int age = scanner.nextInt();
        whatCategory(age);
        System.out.println("Введите номер месяца, чтоб узнать квартал");
        int month = scanner.nextInt();
        whatQuartal(month);
        //Сложное. Калькулятор дат. Для решения этой задачи необходима формула для вычисления. Я нашла эту формулу в интернете,
       // называется формула Зеллера. Она выглядит h = (q + [(13*(m+1))/5] + K + [K/4] + [J/4] - 2*J) mod 7, будем работать
        System.out.println("Введите желаемую дату вычисления дня недели");
        System.out.println("Введите число");
        int dayDate = scanner.nextInt();
        System.out.println("Введите номер месяца");
        int monthDay = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        dayOfWeekCalculator(dayDate, monthDay, year);
    }

    static String denNedeli(int num) {
        if (num > 0 && num < 8) {
            switch (num) {
                case 1:
                    return "Понедельник";
                case 2:
                    return "Вторник";
                case 3:
                    return "Среда";
                case 4:
                    return "Четверг";
                case 5:
                    return "Пятница";
                case 6:
                    return "Суббота";
                case 7:
                    return "Воскресенье";
            }
        }
        return "Неправильный день";

    }

    static String ocenka(int num) {
        if (num > 0 && num < 6) {
            switch (num) {
                case 1:
                    return "Очень плохо";
                case 2:
                    return "Плохо";
                case 3:
                    return "Удовлетворительно";
                case 4:
                    return "Хорошо";
                case 5:
                    return "Отлично";
            }
        }
        return "Не правильный ввод";
    }

    static String svetofor(String signal) {
        if (signal.equals("red") || signal.equals("yellow") || signal.equals("green") || signal.equals("красный") || signal.equals("желтый") || signal.equals("зеленый")) {
            switch (signal) {
                case "red", "красный":
                    return "Стоп";
                case "yellow", "желтый":
                    return "Приготовься";
                case "green", "зеленый":
                    return "Иди";
            }
        }
        return "Такого цвета нет";
    }

    static String kolichestvoDnei(int nomerMesyaca) {
        return switch (nomerMesyaca) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 день";
            case 4, 6, 9, 11 -> "30 дней";
            case 2 -> "28 или 29 дней";
            default -> "";
        };
    }

    static int kalkulator(int a, int b, char c) {
        //Мне хотелось максимально использовать мои знания в данном упражнении, чтоб предотвратить ошибки ввода
        // Но знаний пока хватает только на это. Знаю, что не все учтено.
        try {
            return switch (c) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> a / b;
                default ->
                        throw new IllegalStateException("Вы ввели несуществующую операцию \"" + c + "\" попробуйте / * - +");
            };
        } catch (ArithmeticException e) {
            System.out.print("Вы пытались разделить на ");
            return 0;
        }
    }

    static String isWorkDay(int numberOfDay) {
        if (numberOfDay > 0 && numberOfDay < 8) {
            return switch (numberOfDay) {
                case 1, 2, 3, 4, 5 -> "Рабочий день";
                case 6 -> "Выходной";
                default -> "";
            };
        } else return "Не правильный ввод";
    }

    static String whatCategory(int age) {
        if (age > 0 && age < 18) {
            switch (age) {
                case 0, 1, 2:
                    return "Младенец";
                case 3, 4, 5, 6:
                    return "Дошкольник";
                case 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17:
                    return "Школьник";
            }
        } else if (age > 17 && age < 60) {
            return "Взрослый";
        } else if (age > 59) {
            return "Пенсионер";
        }
        return "Возраст не может быть отрицательным";
    }

    static String whatQuartal (int month){
        return switch (month){
            case 1,2,3 -> "1 квартал";
            case 4,5,6 -> "2 квартал";
            case 7,8,9 -> "3 квартал";
            case 10,11,12 -> "4 квартал";
            default -> "Такого месяца нет";
        };
    }
    static void dayOfWeekCalculator (int dayDate, int monthDay, int year){
        /*
        Для удобства продублирую сюда формулу
        h = (q + [(13*(m+1))/5] + K + [K/4] + [J/4] - 2*J) mod 7
        где: h — день недели
             q — число месяца (день)
             m — месяц (3 = март, 4 = апрель, ..., 12 = декабрь, 13 = январь, 14 = февраль).
             K — год столетия (year mod 100).
             J — нулевое столетие (фактически [year/100]).
             [ ] — означает целую часть числа (отбрасываем дробь).
         */
        if (monthDay == 1){
            monthDay = 13;
        }else if (monthDay == 2){
            monthDay = 14;
        }
        int yearFirstPart = year % 100;
        int yearLastPart = year / 100;
        //Представим по частям. (13*(monthDay+1) первый, далее делим на 5 по формуле.
        // Можно прописать частями уравнение, если не получится.
        int h = (dayDate + ((13*(monthDay+1))/5) + yearFirstPart + (yearFirstPart/4) + (yearLastPart/4) - 2*yearLastPart) % 7;
        switch (h){
            case 0:
                System.out.println("Суббота");
                break;
            case 1:
                System.out.println("Воскресенье");
                break;
            case 2:
                System.out.println("Понедельник");
                break;
            case 3 :
                System.out.println("Вторник");
                break;
            case 4:
                System.out.println("Среда");
                break;
            case 5:
                System.out.println("Четверг");
                break;
            case 6:
                System.out.println("Пятница");
                break;
        }
        //По формуле подставила свой ДР и родителей, по идее работает правильно.
        //Теперь, сколько дней прошло от начала года
        //Найдем нужный месяц и до него посчитаем сумму уже прожитых дней
        int january = 31;
        int february = 28;
        if (year % 4 == 0){
            february = 29;
        }
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int september = 30;
        int october = 31;
        int november = 30;
        //декабрь нам никогда не понадобится полностью,  так как он последний и мы будем считать его текущие дни.
        // если бы мы прошли массивы, можно было бы считать сумму в массиве до необходимого индекса месяца, пока пользуемся
        //инструментами без массивов.

        switch (monthDay){
            case 13: System.out.println("От начала года прошло " + dayDate + " дней");
                break;
            case 14: System.out.println("От начала года прошло " + (january + dayDate) + " дней");
                break;
            case 3: System.out.println("От начала года прошло " + (january + february + dayDate) + " дней");
                break;
            case 4: System.out.println("От начала года прошло " + (january + february + march + dayDate) + " дней");
                break;
            case 5: System.out.println("От начала года прошло " + (january + february + march + april + dayDate) + " дней");
                break;
            case 6: System.out.println("От начала года прошло " + (january + february + march + april + may + dayDate) + " дней");
                break;
            case 7:  System.out.println("От начала года прошло " + (january + february + march + april + may + june + dayDate) + " дней");
                break;
            case 8: System.out.println("От начала года прошло " + (january + february + march + april + may + june + july + dayDate) + " дней");
                break;
            case 9: System.out.println("От начала года прошло " + (january + february + march + april + may + june + july + august + dayDate) + " дней");
                break;
            case 10: System.out.println("От начала года прошло " + (january + february + march + april + may + june + july + august + september + dayDate) + " дней");
                break;
            case 11: System.out.println("От начала года прошло " + (january + february + march + april + may + june + july + august + september + october + dayDate) + " дней");
                break;
            case 12: System.out.println("От начала года прошло " + (january + february + march + april + may + june + july + august + september + october + november + dayDate) + " дней");
                break;
        }

    }
}
