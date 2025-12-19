package LessonTwentyOne.Transport;

public class Boat extends Transport{

  public   Boat(String brand, int year, int maxSpeed) {
        super(brand, year, maxSpeed);
    }

    @Override
    String move() {
        return "Плывет по воде";
    }

    @Override
    String refuel() {
        return "Заправка дизелем";
    }
}
