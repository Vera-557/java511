package LessonThertyOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessonThertyOne {
    //Реализовать пагинацию
    public static void main(String[] args) {

        List<String> movies = new ArrayList<>();
        int totalMovies = 30;

        for (int i = 1; i <= totalMovies; i++) {
            movies.add("Movie #" + i);
        }
        int filmsOnPage = 3;   // Сколько фильмов показывать на одной странице
        int totalPages = 10;    // Всего страниц

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ПАГИНАЦИЯ ФИЛЬМОВ ===");
        System.out.println("Всего фильмов: " + totalMovies);
        System.out.println("Фильмов на странице: " + filmsOnPage);
        System.out.println("Всего страниц: " + totalPages);
        System.out.println();
        //Мне эти консоли напоминают времена, когда я училась в школе и мы пытались что-то печатать на бэйсик и паскале
        //только мигающей каретки не хватает
        while (true) {
            System.out.println("Доступные страницы: 1 2 3 4 5 6 7 8 9 10");
            System.out.print("Введите номер страницы (1-10) или 0 для выхода:");

            int pageNumber = scanner.nextInt();
            if (pageNumber == 0) {
                System.out.println("Выход.");
                break;
            }
            if (pageNumber < 1 || pageNumber > totalPages) {
                System.out.println("Упс! Страницы " + pageNumber + " не существует.");
                continue;
            }
            int startIndex = (pageNumber - 1) * filmsOnPage;

            System.out.println("СТРАНИЦА " + pageNumber);
            for (int i = 0; i < filmsOnPage; i++) {
                int movieIndex = startIndex + i;
                if (movieIndex < totalMovies) {
                    System.out.println(movies.get(movieIndex));
                }
            }
        }
    }
    //я не поняла на сколько можно было модифиировать ваш предложенный код? ну пришлось немного изменить его, не знаю, правильно ли так...
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