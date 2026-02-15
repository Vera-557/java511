package LessonThertyTwo;
/*
Условие:
Создай поток, который делает обратный отсчёт от 5 до 1, затем выводит "Старт!".
        Между каждым числом должна быть задержка 1 секунда.
        Требования:

Создай 1 поток
Используй цикл for от 5 до 1
Используй Thread.sleep(1000) для задержки
После отсчёта выведи "Старт!"

Ожидаемый вывод:
5
(пауза 1 секунда)
4
(пауза 1 секунда)
3
(пауза 1 секунда)
2
(пауза 1 секунда)
1
(пауза 1 секунда)
Старт!
 */
public class MyThread3 {
    public static void main(String[] args) {
        System.out.println("Задача 3: Обратный отсчёт ⏱️" +
                "\n---------------------------------------------------------");

        Thread countdownThread = new Thread(() -> {
            try {
                for (int i = 5; i >= 1; i--) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
                System.out.println("Старт!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        countdownThread.start();
    }
}
