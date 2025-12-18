package LessonEighteen.Inheritance.Employee;

public class Employee {
    String name;
    double salary;
    void calculateSalary(){

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
