package LessonTwentyOne.Controllable;

public class Fan implements Controllable{
    private boolean isOn = true;
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
            System.out.println("Вентилятор выключен");
        }else System.out.println("Вентилятор включен");
    }
}
