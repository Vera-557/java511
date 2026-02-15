package LessonThertyTwo;

public class MyThread2 {
    /*
    Условие:
Создай 3 потока, каждый поток представляет студента:
Студент 1
Студент 2
Студент 3

Каждый студент должен вывести в консоль:
Студент [номер] начал решать задачу
Студент [номер] решает... (подожди 2 секунды)
Студент [номер] закончил решать задачу
Требования:

Создай 3 потока
Используй Thread.sleep(2000) для имитации решения задачи
Запусти все 3 потока

Ожидаемый вывод (порядок может быть разным):
Студент 1 начал решать задачу
Студент 2 начал решать задачу
Студент 3 начал решать задачу
Студент 1 решает...
Студент 2 решает...
Студент 3 решает...
Студент 1 закончил решать задачу
Студент 2 закончил решать задачу
Студент 3 закончил решать задачу
     */
    public static void main(String[] args) {
        System.out.println("Задача 2: Три студента решают задачи \uD83D\uDC68\u200D\uD83C\uDF93\uD83D\uDC69\u200D\uD83C\uDF93\uD83D\uDC68\u200D\uD83C\uDF93" +
                "\n---------------------------------------------------------");
        for (int i = 1; i <= 3; i++) {
            Thread student = new Thread(new Student(i));
            student.start();
        }
    }
}
class Student implements Runnable {
    private int studentNumber;

    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public void run() {
        try {
            System.out.println("Студент " + studentNumber + " начал решать задачу");
            System.out.println("Студент " + studentNumber + " решает...");
            Thread.sleep(2000);
            System.out.println("Студент " + studentNumber + " закончил решать задачу");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}