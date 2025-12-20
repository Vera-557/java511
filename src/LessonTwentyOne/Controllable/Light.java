package LessonTwentyOne.Controllable;

public class Light implements Controllable, Dimmable{
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
            System.out.println("Свет выключен");
        } else System.out.println("Свет включен");
    }

    @Override
    public void setBrightness(int level) {
        System.out.println("Выберите уровень яркости: 1 минимальная, 2 средняя, 3 максимальная");
        if (level > 0 && level <= 3) {
           this.level = level;
        }
    }

    @Override
    public String getBrightness() {
        if (level == 1) {
            return "Установлена минимальная яркость";
        } else if (level == 2) {
            return "Установлена средняя яркость";
        } else return "Установлена максимальная яркость";

    }
}
