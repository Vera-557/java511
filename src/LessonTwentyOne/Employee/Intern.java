package LessonTwentyOne.Employee;

public class Intern extends Employee{
    public Intern(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
