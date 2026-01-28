package LessonTwentySix;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/*
1)      Задание 1: Класс Box (Коробка)
        Создайте generic-класс Box<T>, который хранит один элемент любого типа.
        class Box<T> {
             создайте приватное поле item типа T
             создайте конструктор, который принимает T item
             создайте метод getItem() который возвращает item
             создайте метод setItem(T item) который устанавливает item
        }

2)      Задание 2: Метод печати массива
        Напишите generic-метод printArray, который печатает любой массив.


3)      Задание 3: Метод получения первого элемента
        Напишите generic-метод getFirst, который возвращает первый элемент из списка.

		public static <T> T getFirst(List<T> list) {
       // проверьте, что список не пустой
       // верните первый элемент
        }


4) 		Задание 4: Метод проверки содержания элемента
		Напишите generic-метод contains, который проверяет, есть ли элемент в массиве.


5)		Задание 5: Класс Pair для двух элементов
        Создайте generic-класс Pair<F, S>, который хранит два элемента разных типов (First и Second).

		class Pair<F, S> {
             // создайте два приватных поля: first типа F и second типа S
             // создайте конструктор
             // создайте геттеры getFirst() и getSecond()
		}
 */
public class Box <T>{
   private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
    static <T> void printArray (T [] array){
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
        System.out.println("----------------");
    }
    public static <T> T getFirst(List<T> list) {
        // проверьте, что список не пустой
        // верните первый элемент
        if (list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.get(0);
    }
    static <T> boolean contains (T [] array, T value){
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)){
                return true;
            }
        }
        return false;
    }

}
class Pair<F, S> {
    // создайте два приватных поля: first типа F и second типа S
    private F first;
    private S second;
    // создайте конструктор

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    // создайте геттеры getFirst() и getSecond()

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}