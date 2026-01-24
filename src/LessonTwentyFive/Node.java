package LessonTwentyFive;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/*
LinkedList реализовать методы

1) void addStart(String value);
2) void add(int index,String value);

3)* void reverse(); (НЕ ОБЯЗАТЕЛЬНО)


 */
public class Node {
    String value;
    Node next;
    public Node(String value) {
        this.value = value;
    }
}
class SingleLinkedList{
    private Node head;

    public void add(String value){
        if(head == null){
            head = new Node(value);
        }else {
            Node start = head;
            while(start.next != null){
                start = start.next;
            }
            start.next = new Node(value);
        }
    }
    public int size() {
        Node start = head;
        int count = 0;
        while (start != null) {
            count++;
            start = start.next;
        }

        return count;
    }
    void addStart(String value){
        if (head == null){
            head = new Node(value);
        }else {
            Node newNode = new Node(value);
            newNode.next = head;    // новый узел указывает на старый head
            head = newNode;
        }// head теперь указывает на новый узел
    }


    void add(String value, int index){
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Значение не вписывается в диапазон размера коллекции");
        }
        if (index == 0) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        } else {
            Node start = head;
            for (int i = 0; i < index - 1; i++) {
                start = start.next;
            }
            Node newNode = new Node(value);
            newNode.next = start.next;
            start.next = newNode;
        }
    }

    public String get(int index){
        if(head == null || index < 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node start = head;
        int count = 0;
        while(start.next != null){
            if(count == index){
                return start.value;
            }
            count++;
            start = start.next;
        }

        throw new ArrayIndexOutOfBoundsException("Index out of bounds");
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
//    void reverse() {
//        Node prev = null;
//        Node current = head;
//        Node next = null;
//
//        while (current != null) {// до тех пор, пока существует объект в списке
//            next = current.next;// Сохраняем ссылку на следующий элемент
//            current.next = prev;// Разворачиваем указатель текущего элемента
//            prev = current;// Двигаем указатели вперед
//            current = next;
//        }
//        head = prev;
//        //Идея такого метода основана на интерфейсе итератор
//    }
//
//    public static void main(String[] args) {
//        SingleLinkedList lol = new SingleLinkedList();
//        lol.add("1");
//        lol.add("2");
//        lol.add("3");
//        lol.print();
//        lol.reverse();
//        lol.print();
//    }
}