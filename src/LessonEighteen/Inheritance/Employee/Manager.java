package LessonEighteen.Inheritance.Employee;

public class Manager extends Employee {
int bonus;
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
   public void calculateSalary() {
        double cash = salary + bonus;
        System.out.println("Зарплата менеджера = " + cash + " бонус составил " + bonus);
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
