package LessonThertyTwo;
public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Привет! Я работаю в отдельном потоке!");
    }

    public static void main(String[] args) {
          /*
        Условие: Создай поток, который выводит в консоль: Привет! Я работаю в отдельном потоке! Имя потока: [имя потока]
        Требования: Используй любой способ создания потока (extends Thread или Runnable или лямбда) Запусти поток
        В главном потоке выведи: "Главный поток завершён" Ожидаемый вывод: Главный поток завершён Привет! Я работаю в отдельном потоке!
        Имя потока: Thread-0 (порядок может быть разным)
         */
        System.out.println("Задача 1: Приветствие в отдельном потоке \uD83D\uDC4B" +
                "\n---------------------------------------------------------");
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("Поток 1");
        myThread1.start();
        Thread thread1 = Thread.currentThread();
        thread1.setName("Главный поток завершён");
        System.out.println(thread1.getName());
    }
}
