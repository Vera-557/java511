package LessonTwentyOne.Transport;
/*
Задание 2: Транспорт
Создайте абстрактный класс Transport с полями:

brand (String) - марка
year (int) - год выпуска
maxSpeed (int) - максимальная скорость

Добавьте:

Конструктор
Конкретный метод displayInfo() - выводит информацию о транспорте
Абстрактный метод move() - описывает как движется транспорт
Абстрактный метод refuel() - описывает как заправляется

Создайте классы-наследники:

Car - move() выводит "Едет по дороге", refuel() выводит "Заправка бензином"
Boat - move() выводит "Плывет по воде", refuel() выводит "Заправка дизелем"

 */

public abstract class Transport {
    private String brand;
    private int year;
    private int maxSpeed;

    Transport(String brand, int year, int maxSpeed) {
        this.brand = brand;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String displayInfo() {
        return "Марка : " + brand + ", год выпуска: " + year + ", максимальная скорость: " + maxSpeed;
    }

    abstract String move();

    abstract String refuel();

}
