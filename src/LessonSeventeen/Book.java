package LessonSeventeen;
//Задание 1: Класс "Книга" (Book)
//Что нужно сделать:
//Создайте класс Book с полями: title (название), author (автор), year (год издания), pages (количество страниц)
//Создайте 3 конструктора: без параметров, с 2 параметрами (title, author), с всеми параметрами
//Создайте метод print() для вывода информации о книге
//Создайте метод isOld() который возвращает true если книга издана более 50 лет назад
//В main создайте 3 разные книги и выведите их информацию

public class Book {
   private String title;
   private String author;
   private int year;
   private int pages;

    Book(){} // без параметров

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }
    String print(){
        return "Информация о книге - Название: " + title + ", автор: " + author + ", год издания: " + year + ", количество страниц: " + pages;
    }

    boolean isOld(){
        int thisYear = 2025;
        if (thisYear - year > 50){
            return true;
        }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Виктор Франкенштейн", "Мэри Шелли", 1818,400);
        Book book2 = new Book("Кэрри", "Стивен Кинг", 1995, 320);
        Book book3 = new Book("Олеся", "Александ Куприн", 2000, 300);
        Book [] books = {book1,book2,book3};
        for (Book book: books){
            System.out.println(book.print());
            System.out.println("Старая ли эта книга? - " + book.isOld());
        }
    }
}
