package LessonTwentyOne.Employee;

public class Developer extends Employee{
    Developer(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return 0;
    }
}
