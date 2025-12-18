package LessonEighteen.Inheritance.Vehicle;

public class Vehicle {
    private String mark;
    private int year;
    private int speed;

    Vehicle(String mark, int year, int speed) {
        this.mark = mark;
        this.year = year;
        this.speed = speed;
    }

    void move () {
        System.out.println("Тут нет логики");
    }

    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
