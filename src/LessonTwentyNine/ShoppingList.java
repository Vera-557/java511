package LessonTwentyNine;

import java.io.*;
import java.util.Scanner;

/*
Задание 2: Список покупок
Создайте программу для управления списком покупок в файле "shopping.txt":

Добавить товар
Показать весь список
Удалить все товары (очистить файл)
Подсчитать количество товаров в списке
Выход
 */
public class ShoppingList {
    Scanner scanner = new Scanner(System.in);
    File file = new File("C:\\Users\\Public\\Documents\\shopping.txt");

    //Добавить товар
    private void addProduct() throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("\n").append(scanner.nextLine().trim());
        fileWriter.close();
    }

    void listCounter() throws IOException {
        if (!file.exists() || file.length() == 0) {
            System.out.println("Количество товаров: 0");
            return;
        }

        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }
        }
        System.out.println("Количество товаров в списке: " + count);
    }

    //Показать весь список
    private void showList() throws IOException {
        if (!file.exists() || file.length() == 0) {
            System.out.println("Файл не существует или пуст");
            return;
        }
        char[] shopList = new char[10000];
        FileReader fileReader = new FileReader(file);
        int count = fileReader.read(shopList);
        for (int i = 0; i < count; i++) {
            fileReader.toString().split("\\s");
            System.out.print(shopList[i]);
        }
        System.out.println();
    }

    //Удалить все товары
    private void deleteAllList() throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("");
        System.out.println("Список покупок очищен");
    }

    public void menu() {
        System.out.println("Список покупок" +
                "\n1 - добавить запись" +
                "\n2 -  прочитать все покупки" +
                "\n3 = удалить все покупки" +
                "\n4 = показать количество товаров" +
                "\n5 - выход");
        int input;
        try {
            while (true) {
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                       addProduct();
                        break;
                    case 2:
                        showList();
                        break;
                    case 3:
                        deleteAllList();
                        break;
                    case 4:
                        listCounter();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Нет такой команды");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибочка вышла!");
        }
    }

    public static void main(String[] args) throws IOException {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.menu();
    }
}
