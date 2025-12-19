package LessonTwentyOne.Employee;

public class Developer extends Employee{
    private int completedProjects;
    private final int bonus = 1000;
    public Developer(String name, int id, double baseSalary, int completedProjects) {
        super(name, id, baseSalary);
        setCompletedProjects(completedProjects);
    }

    @Override
    public double calculateSalary() {
        return baseSalary += (completedProjects * bonus);
    }

    public void setCompletedProjects(int completedProjects) {
        if (completedProjects > 0) this.completedProjects = completedProjects;
    }
}
