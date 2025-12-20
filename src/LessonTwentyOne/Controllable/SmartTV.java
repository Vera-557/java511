package LessonTwentyOne.Controllable;

public class SmartTV implements Controllable, Dimmable{
    private boolean isOn = true;
    private int level;
    @Override
    public boolean turnOn() {
        return isOn = true;
    }

    @Override
    public boolean turnOff() {
        return isOn = false;
    }

    @Override
    public void getStatus() {
        if (!isOn){
            System.out.println("Телевизор выключен");
        }else System.out.println("Телевизор включен");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Установите значение яркости экрана от 0 до 100");
        if (level >= 0 && level <= 100){
            this.level = level;
        }
    }

    @Override
    public String getBrightness() {
        return "Яркость установлена на " + level;
    }
}
