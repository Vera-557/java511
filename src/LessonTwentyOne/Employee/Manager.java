package LessonTwentyOne.Employee;

public class Manager extends Employee{
    public Manager(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double salary = getBaseSalary() + (getBaseSalary() * 0.2);
        return salary;
    }
}
