package LessonTwentyOne.Transport;

public class Car extends Transport{
   public Car(String brand, int year, int maxSpeed) {
        super(brand, year, maxSpeed);
    }

    @Override
    String move() {
        return "Едет по дороге";
    }

    @Override
    String refuel() {
        return "Заправка бензином";
    }

}
