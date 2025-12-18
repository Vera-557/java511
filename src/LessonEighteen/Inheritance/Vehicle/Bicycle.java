package LessonEighteen.Inheritance.Vehicle;

public class Bicycle extends Vehicle{
    int transmission;
    public Bicycle(String mark, int year, int speed) {
        super(mark, year, speed);
    }
    public void move () {
        System.out.println("Велосипед - " + getMark() + " " + getYear() + " года выпуска, едет со скоростью " + getSpeed());
    }
    public void putTransmission(){
        System.out.println("Мы установили - " + transmission + " передач");
    }
    public void setTransmission(int transmission){
        if (transmission > 0) {
            this.transmission = transmission;
        }
    }
    public int getTransmission (){
        return transmission;
    }
}
