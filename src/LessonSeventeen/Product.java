package LessonSeventeen;
//Задание 2: Класс "Товар" (Product)
//Что нужно сделать:
//Создайте класс Product с полями: name (название), price (цена), quantity (количество на складе), category (категория)
//Создайте конструкторы с делегированием (минимум 3 конструктора)
//Создайте метод getTotalPrice() который возвращает общую стоимость (цена * количество)
//Создайте метод sell(int amount) который уменьшает количество товара
//Создайте метод restock(int amount) который увеличивает количество товара
//В main создайте магазин с 5 товарами и проведите несколько операций продажи
public class Product {
    String name;
    int price;
    int quantity;
    String category;

    public Product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    Product(String name, String category){
        this(name,0,0, category);
    }

    Product(String name){
        this(name,0,0, "Default");
    }

   int getTotalPrice(){
       return price * quantity;
   }
    void sell(int amount) {
        if (amount <= 0) {
            System.out.println("Количество для продажи должно быть больше 0");
            return;
        }
        if (quantity >= amount) {
            quantity = quantity - amount;
            System.out.println("Продано " + amount + " единиц товара: " + name);
        } else {
            System.out.println("Недостаточно товара на складе. Доступно: " + quantity);
        }
    }

    void restock(int amount) {
        if (amount <= 0) {
            System.out.println("Количество для пополнения должно быть больше 0");
            return;
        }
        quantity = quantity + amount;
        System.out.println("Пополнено " + amount + " единиц товара: " + name);
    }
    void displayInfo() {
        System.out.println("Товар: " + name +
                " | Цена: " + price +
                " | Количество: " + quantity +
                " | Категория: " + category +
                " | Общая стоимость: " + getTotalPrice());
    }
    public static void main(String[] args) {
        Product[] store = new Product[5];
        store[0] = new Product("Молоко", 80, 100, "Молочные продукты");
        store[1] = new Product("Хлеб", 50, 150, "Хлебобулочные изделия");
        store[2] = new Product("Яблоки", 120, 75, "Фрукты");
        store[3] = new Product("Кофе", 500, 40, "Напитки");
        store[4] = new Product("Шоколад", 90, 200, "Сладости");
        System.out.println("=== Исходное состояние товаров ===");
        for (Product product : store) {
            product.displayInfo();
        }
        System.out.println();
        System.out.println("=== Операции продажи ===");
        store[0].sell(10);
        store[1].sell(20);
        store[2].sell(30);
        store[3].sell(50);
        store[4].sell(-5);

        System.out.println();

        System.out.println("=== Операции пополнения ===");
        store[0].restock(20);
        store[3].restock(30);
        store[4].restock(50);

        System.out.println();

        System.out.println("=== Состояние после операций ===");
        for (Product product : store) {
            product.displayInfo();
        }
        System.out.println();
    }
}
