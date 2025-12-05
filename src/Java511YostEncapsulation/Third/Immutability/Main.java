package Java511YostEncapsulation.Third.Immutability;

public class Main {
    public static void main(String[] args) {
        Product shampoo = new Product("Шампунь", "||||||");
        shampoo.setPrice(150);
        System.out.println(shampoo.getName() + " " + shampoo.getBarCode() + " " + shampoo.getPrice());
        shampoo.setPrice(200);
        System.out.println(shampoo.getName() + " " + shampoo.getBarCode() + " " + shampoo.getPrice());
    }
}
