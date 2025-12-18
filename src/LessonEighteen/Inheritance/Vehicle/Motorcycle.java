package LessonEighteen.Inheritance.Vehicle;

public class Motorcycle extends Vehicle{
   private String type;
   public Motorcycle(String mark, int year, int speed) {
        super(mark, year, speed);
    }
    public void move() {
       System.out.println("Мотоцикл - " + getMark() + " " + getYear() + " года выпуска, едет со скоростью " + getSpeed());
    }
    public void motoInfo(){
        System.out.println("Тип мотоцикла - " + type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
       return type;
    }
}
