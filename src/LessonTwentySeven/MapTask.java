package LessonTwentySeven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Задание: Map<String, String[]>
УСЛОВИЕ 1

Добавь в map 2 элемента:

ключ "fruits" → массив {"apple", "banana"}

ключ "colors" → массив {"red", "blue"}



УСЛОВИЕ 2
Выведи на экран все ключи и все элементы массивов.


УСЛОВИЕ 3
если в map есть ключ "fruits" → выведи "Fruits exist"

если нет → "No fruits"
 */
public class MapTask {
    public static void main(String[] args) {
        Map<String, String[]> kart = new HashMap<>();
        String[] fruits =  {"apple", "banana"};
        kart.put("fruits", fruits);
        String[] colours = {"red", "blue"};
        kart.put("colors", colours);
        for(Map.Entry e : kart.entrySet())
        {
            System.out.println("Ключ: " + e.getKey()+", значение: "+ Arrays.toString((String[]) e.getValue()));
        }
        if (kart.containsKey("fruits")) {
            System.out.println("Fruits exist");
        } else {
            System.out.println("No fruits");
        }

    }
}
