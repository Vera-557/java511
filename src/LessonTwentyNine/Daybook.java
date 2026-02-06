package LessonTwentyNine;

import java.io.*;
import java.time.LocalDateTime;
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
public class Daybook {
    Scanner scanner = new Scanner(System.in);
    File file = new File("C:\\Users\\Public\\Documents\\DayBook.txt");
    LocalDateTime now = LocalDateTime.now();

    private void add() throws IOException {
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("\n" + now + "\n" + scanner.nextLine());
    }
    private void showAll () throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        Daybook day = new Daybook();
        day.add();
        day.showAll();
    }
}
