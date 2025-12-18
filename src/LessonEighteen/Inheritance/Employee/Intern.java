package LessonEighteen.Inheritance.Employee;

public class Intern extends Employee{
    double hours;
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
   public void calculateSalary() {
        double fullSalary = salary * hours;
        System.out.println("Стажёр отработал " + hours + " часов, зарплата = " + fullSalary);
    }

    public void setHours(double hours) {
        if (hours > 0) {
            this.hours = hours;
        }
    }
}
