package LessonTwentyFour;
/*
Задание 4: Цвета светофора
Создай enum TrafficLight с элементами RED, YELLOW, GREEN.
Реализуй метод getNext(), который возвращает следующий цвет светофора в стандартной последовательности: RED → GREEN → YELLOW → RED и так далее.
 */
public enum TrafficLight {
    RED("Red"){
        @Override
        TrafficLight getNext(){
            return GREEN;
        }
    },
    YELLOW("Yellow"){
        @Override
        TrafficLight getNext(){
            return RED;
        }
    },
    GREEN("Green"){
        @Override
        TrafficLight getNext(){
            return YELLOW;
        }
    };
    abstract TrafficLight getNext();
    final String colour;
    TrafficLight(String colour){
        this.colour = colour;
    }
}
