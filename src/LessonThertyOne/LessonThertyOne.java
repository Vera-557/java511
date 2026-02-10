package LessonThertyOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessonThertyOne {
    //Реализовать пагинацию
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        int totalMovies = 30;

        for (int i = 1; i <= totalMovies; i++) {
            list.add("Movie #" + i);
        }
        int view = 3;   // Сколько фильмов показывать на одной странице
        int pageSize = 10;    // Всего страниц

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ПАГИНАЦИЯ ФИЛЬМОВ ===");
        System.out.println("Всего фильмов: " + totalMovies);
        System.out.println("Фильмов на странице: " + view);
        System.out.println("Всего страниц: " + pageSize);
        System.out.println();
        do {
            System.out.println("Доступные страницы: 1 2 3 4 5 6 7 8 9 10");
            System.out.print("Введите номер страницы (1-10) или 0 для выхода:");

            int page = scanner.nextInt();
            if (page == 0) {
                System.out.println("Выход.");
                break;
            }
            if (page < 1 || page > pageSize) {
                System.out.println("Упс! Страницы " + page + " не существует.");
                continue;
            }
            int startIndex = (page - 1) * view;

            System.out.println("СТРАНИЦА " + page);
            for (int i = 0; i < view; i++) {
                int movieIndex = startIndex + i;
                if (movieIndex < totalMovies) {
                    System.out.println(list.get(movieIndex));
                }
            }
//            list.stream()
//                    .skip(startIndex)          // пропускаем первые startIndex фильмов
//                    .limit(view)               // берем только view фильмов
//                    .forEach(System.out::println);
            //list.stream().limit(10).forEach(System.out::println); // pecataet pravilniy diapazon  ------ Я не поняла -куда это?
        }while (true);
    }
}
/*
int view = 3; // skolko filmov na 1 stranicu
  int pageSize = 10; //  skolko vseqo filmov podskazka totalMovies/view
    int page = 5;  // kakaya stranica



        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int totalMovies = 30;
        for (int i = 1; i <= totalMovies; i++) {
            list.add("Movie #"+i);
        }
        int view = 3; // skolko filmov na 1 stranicu
//        int page = 5;  // kakaya stranica
        int pageSize = 10; //  skolko vseqo filmov podskazka totalMovies/view

        do {
            sc = new Scanner(System.in);
            for(int i = 1; i <= pageSize; i++) {
                System.out.print(i + " ");
            }
            System.out.println();  // Otobrazitsa vozmojnie stranici
            int page = sc.nextInt();
            //choice

            list.stream().limit(10).forEach(System.out::println); // pecataet pravilniy diapazon

            //
        }while(true);
 */