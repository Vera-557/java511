package LessonEighteen.Inheritance.Vehicle;

public class Car extends Vehicle{
    int dors;
    public Car(String mark, int year, int speed) {
        super(mark, year, speed);
    }
    public void move () {
        System.out.println("Автомобиль - " + getMark() + " " + getYear() + " года выпуска, едет со скоростью " + getSpeed());
    }
    public void openDors () {
        System.out.println("У автомобиля " + dors + " дверей");
        System.out.println("Открыть все двери!");
    }

    public void setDors(int dors) {
        if (dors > 0 ) {
            this.dors = dors;
        }
    }

    public int getDors() {
        return dors;
    }
}
