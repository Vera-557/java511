package LessonSeventeen;

public class Employee {
    //Задание 5: Класс "Сотрудник" (Employee)
//Что нужно сделать:
//
//Создайте класс Employee с полями: name, position (должность), salary, experience (стаж в годах), department (отдел)
//Создайте несколько конструкторов с делегированием
//Создайте метод giveRaise(double percent) для повышения зарплаты
//Создайте метод promote(String newPosition) для повышения должности
//Создайте метод celebrateAnniversary() который увеличивает стаж на 1 год
//В main создайте отдел из 7 сотрудников и найдите сотрудника с максимальной зарплатой
    private String name;
    private String position;
    private double salary;
    private int experience;
    private String department;

    public Employee(String name, String position, double salary, int experience, String department) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
        this.department = department;
    }

    public Employee(String name, String position, double salary, String department) {
        this(name, position, salary, 0, department);
    }

    public Employee(String name, String position) {
        this(name, position, 50000, 0, "Не назначен");
    }

    public void giveRaise(double percent) {
        if (percent <= 0) {
            System.out.println("Процент повышения должен быть положительным числом");
            return;
        }
        double oldSalary = salary;
        salary += salary * (percent / 100);
    }

    public void promote(String newPosition) {
        if (newPosition == null || newPosition.trim().isEmpty()) {
            System.out.println("Новая должность не может быть пустой");
            return;
        }
        System.out.println(name + " повышен с должности " + position + " на должность " + newPosition);
        position = newPosition;
    }

    public void celebrateAnniversary() {
        experience++;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Зарплата не может быть отрицательной");
            return;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "имя='" + name  +  "  должность " + position +  ", зарплата=" + salary + ", стаж=" + experience + ", отдел='" + department + '}';
    }

    public static void main(String[] args) {
        Employee[] department = new Employee[7];
        department[0] = new Employee("Иван Петров", "Менеджер", 80000, 3, "Продажи");
        department[1] = new Employee("Мария Сидорова", "Разработчик", 120000, 5, "IT");
        department[2] = new Employee("Алексей Иванов", "Бухгалтер", 70000, 7, "Финансы");
        department[3] = new Employee("Ольга Николаева", "Дизайнер", 90000, 2, "Дизайн");
        department[4] = new Employee("Дмитрий Смирнов", "Аналитик", 95000, 4, "Аналитика");
        department[5] = new Employee("Екатерина Козлова", "Тестировщик", 75000, 1, "IT");
        department[6] = new Employee("Сергей Федоров", "Директор", 200000, 10, "Руководство");

        for (Employee emp : department){
            System.out.println(emp.toString());
        }

        int maxSalaryIndex = 0;
        for (int i = 1; i < department.length; i++) {
            if (department[i].getSalary() > department[maxSalaryIndex].getSalary()) {
                maxSalaryIndex = i;
            }
        }

        Employee richestEmployee = department[maxSalaryIndex];
        System.out.println("Максимальная зарплата: " + richestEmployee.getSalary() + " руб.");
        System.out.println("СОТРУДНИК С МАКСИМАЛЬНОЙ ЗАРПЛАТОЙ: " + richestEmployee.getName() );
    }
}
