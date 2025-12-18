package LessonEighteen.Inheritance.Employee;

public class Developer extends Employee{
    int projects;
    public Developer(String name, double salary) {
        super(name, salary);
    }
   public void calculateSalary(){
        double ofProgects = salary + (projects * (salary * 0.05));
        System.out.println("Зарплата разработчика = " + ofProgects + " в месяце было " + projects + " проектов");
    }

    public void setProjects(int projects) {
        if (projects > 0) {
            this.projects = projects;
        }
    }
}
