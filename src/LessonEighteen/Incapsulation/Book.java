package LessonEighteen.Incapsulation;
/*
Создай класс Book с приватными полями: название, автор, количество страниц, цена.
Сделай поля название и автор доступными только для чтения (только геттеры),
 а цену можно изменять, но только на положительное значение.
 */
public class Book {
    private String author;
    private String name;
    private int countPages;
    private double price;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getCountPages() {
        return countPages;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice (double price){
        if (price <= 0){
            throw new IllegalArgumentException("Невозможно устанавливать новую цену равной нулю или отрицательной");
        }
        this.price = price;
    }


    public Book(String author, String name, int countPages, double price) {
        this.author = author;
        this.name = name;
        if (countPages <= 0){
            throw new IllegalArgumentException("Страниц должно быть больше, чем 1");
        }
        this.countPages = countPages;//нам просто по условию не прописано нигде про страницы
        setPrice(price);//так мы запретим ошибку даже в конструкторе
    }

    @Override
    public String toString() {
        return "Книга - " + name + ", автор - " + author + ", количество страниц - " + countPages + ", цена - " + price;
    }
}
