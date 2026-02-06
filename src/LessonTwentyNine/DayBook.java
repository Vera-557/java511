package LessonTwentyNine;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задание 3: Дневник событий
Создайте программу-дневник:

Добавить запись (формат: дата + описание события)
Показать последние 5 записей
Показать все записи
Найти запись по ключевому слову
Выход
 */
public class DayBook {
    Scanner scanner = new Scanner(System.in);
    File file = new File("C:\\Users\\Public\\Documents\\DayBook.txt");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    String now = LocalDateTime.now().format(formatter);
//Добавить запись (формат: дата + описание события)
    private void add() throws IOException {
        System.out.println("Сделайте запись:");
        if (!file.exists()){
            file.createNewFile();
        }
        String description = scanner.nextLine().trim();
        if (description.isEmpty()) {
            System.out.println("Запись не может быть пустой!");
            return;
        }
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("\n" + now + " " + description);// так будет автоматически записываться дата и время
        //надеюсь, я правильно поняла задачу
        System.out.println("Запись добавлена.");
        fileWriter.flush();
        fileWriter.close();
    }

    private void showAllEntries() throws IOException {
        if (!file.exists() || file.length() == 0) {
            System.out.println("Дневник пуст. Добавьте первую запись.");
            return;
        }

        System.out.println("ВСЕ ЗАПИСИ ДНЕВНИКА");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    System.out.println( line);
                }
            }
        }
        System.out.println("");
    }
    private void showLastFiveEntriesSimple() throws IOException {
        if (!file.exists() || file.length() == 0) {
            System.out.println("Дневник пуст. Добавьте первую запись.");
            return;
        }


        List<String> lastEntries = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    lastEntries.add(line);
                    if (lastEntries.size() > 5) {
                        lastEntries.remove(0);
                    }
                }
            }
        }

        if (lastEntries.isEmpty()) {
            System.out.println("Дневник пуст.");
            return;
        }

        System.out.println("ПОСЛЕДНИЕ 5 ЗАПИСЕЙ");
        for (int i = lastEntries.size(); i > 0; i--) {
            System.out.println((i - 1) + ". " + lastEntries.get(i));
        }
        System.out.println();
    }

    private void searchByKeyword() throws IOException {
        if (!file.exists() || file.length() == 0) {
            System.out.println("Дневник пуст. Добавьте первую запись.");
            return;
        }

        System.out.print("Введите ключевое слово для поиска: ");
        scanner.nextLine();
        String keyword = scanner.nextLine().trim().toLowerCase();

        if (keyword.isEmpty()) {
            System.out.println("Ключевое слово не может быть пустым!");
            return;
        }

        System.out.println("РЕЗУЛЬТАТЫ ПОИСКА");
        System.out.println("Поиск: " + keyword);

        boolean found = false;
        int resultCount = 1;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty() && line.toLowerCase().contains(keyword)) {
                    System.out.println(resultCount + ". " + line);
                    resultCount++;
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Записей с ключевым словом \"" + keyword + "\" не найдено.");
        }
        System.out.println();
    }
    public void start() {
        System.out.println("Добро пожаловать в Дневник:" +
                "1 - Добавить запись" +
                "2 - Показать последние 5 записей" +
                "3 - Показать все записи" +
                "4 - Найти запись по ключевому слову" +
                "5 - Выход");

        while (true) {
            try {
                if (!scanner.hasNextInt()) {
                    System.out.println("Ошибка: введите число от 1 до 5!");
                    scanner.next(); // очистка неверного ввода
                    continue;
                }

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                       add();
                        break;
                    case 2:
                        showLastFiveEntriesSimple(); // или showLastFiveEntries()
                        break;
                    case 3:
                        showAllEntries();
                        break;
                    case 4:
                        searchByKeyword();
                        break;
                    case 5:
                        System.out.println("До свидания! Ваши записи сохранены.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Ошибка: выберите действие от 1 до 5!");
                        break;
                }

            } catch (IOException e) {
                System.out.println("Ошибка работы с файлом: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                scanner.nextLine(); // очистка буфера
            }
        }
    }

    public static void main(String[] args) {
        DayBook dayBook = new DayBook();
        dayBook.start();
    }
}
