package LessonSeventeen;

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

   int getTotalPrice(int price, int quantity){
       return price + quantity;
   }
   void sell(int amount){}
    void restock(int amount){}

}
