package LessonTwentyOne.Employee;
/*
Задание 3: Сотрудники компании
Создайте абстрактный класс Employee с полями:

name (String) - имя
id (int) - ID сотрудника
baseSalary (double) - базовая зарплата

Добавьте:

Конструктор
Абстрактный метод calculateSalary() - возвращает итоговую зарплату
Конкретный метод getInfo() - выводит информацию о сотруднике

Создайте классы-наследники:

Manager - зарплата = baseSalary + 20% бонус
Developer - зарплата = baseSalary + 1000 за каждый завершенный проект (добавьте поле completedProjects)
Intern - зарплата = baseSalary (без надбавок)
 */
public abstract class Employee {
    private String name;
    private int id;
    double baseSalary;

     Employee(String name, int id, double baseSalary) {
        setName(name);
        setId(id);
        setBaseSalary(baseSalary);
    }
    public abstract double calculateSalary();

   public String getInfo(){
        return "Имя: " + name + ", ID : " + id + ", зарплата : " + baseSalary;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
        this.name = name;}
    }

    public void setId(int id) {
        if (id > 0 && id < 5001){
            this.id = id;
        }
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 10000){
        this.baseSalary = baseSalary;}
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
