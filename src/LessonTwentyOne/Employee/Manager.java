package LessonTwentyOne.Employee;

public class Manager extends Employee{
    public Manager(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary = baseSalary + (baseSalary*0.2);
    }
}
