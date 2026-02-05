package LessonTwentyNine;

import java.io.*;
import java.util.Scanner;

/*
Создайте программу с меню:

Записать заметку (стирает старое содержимое файла)
Добавить новую заметку (добавляет в конец файла)
Прочитать все заметки
Выход
 */
public class Notes {
    File file = new File("C:\\Users\\Public\\Documents\\MyNotes.txt");
    Scanner scanner = new Scanner(System.in);
    void writeNote() throws IOException {
        if (!file.exists()){
           file.createNewFile();
        }else {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Здесь мы написали заметки");
            fileWriter.flush();
            fileWriter.close();
        }
    }
    void writeNoteFromUser() throws IOException {
        if (!file.exists()){
            file.createNewFile();
        }else {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(scanner.nextLine());
            fileWriter.close();
        }
    }
    void addNewNodeToExists () throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("\n" + "Здесь мы добавили заметки к заметкам");
        fileWriter.close();
    }
    void addNewNodeToExistsFromUser () throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append("\n" + scanner.nextLine());
        fileWriter.flush();
        fileWriter.close();
    }
    void readAllNotes () throws IOException{
        if (!file.exists() || file.length() == 0) {
            System.out.println("Файл не существует или пуст");
            return;
        }
        FileReader fileReader = new FileReader(file);
        System.out.println("===================");
        char [] read = new char[10000];
        int count = fileReader.read(read);
        for(int i = 0; i < count; i++){
            System.out.print(read[i]);
        }
        System.out.println();
        System.out.println("===================");
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Notes notes = new Notes();
        System.out.println("Меню заметок" +
                "\n1 - сделать запись без сохранения предыдущей" +
                "\n2 - добавить запись к списку" +
                "\n3 = прочитать все записи" +
                "\n4 - выход");
        int input;
//        do {
//            input = scanner.nextInt();
//            switch (input) {
//                case 1:
//                    notes.writeNote();//тут уже готов текст
//                    break;
//                case 2:
//                    notes.addNewNodeToExists();//тут уже готов текст
//                    break;
//                case 3:
//                    notes.readAllNotes();
//                    break;
//                case 4:
//                    System.out.println("Выход");
//                    break;
//                default:
//                    System.out.println("Не правильный ввод");
//            }
//        } while (input != 4);
//            System.out.println("До свидания");
        try {
            while (true) {
                input = scanner.nextInt();
                if (input == 1) {
                    System.out.println("Введите заметку");
                    notes.writeNoteFromUser();
                } else if (input == 2) {
                    System.out.println("Добавьте заметку");
                    notes.addNewNodeToExistsFromUser();
                } else if (input == 3) {
                    notes.readAllNotes();
                } else if (input == 4) {
                    System.out.println("До свидания");
                    break;
                } else System.out.println("Не правильный ввод");
            }
        }catch (IOException e){
            System.out.println("Упс! Ошибочка вышла!");
        }
    }
}
