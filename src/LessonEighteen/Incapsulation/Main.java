package LessonEighteen.Incapsulation;

public class Main {
    public static void main(String [] args) {
        System.out.println("Задание 1: Банковский счет");
        try {
            BankAccount bankAccount1 = new BankAccount();
            bankAccount1.setAccountNumber(123456);
            bankAccount1.setOwnerName("Белка");
            bankAccount1.setBalance(1000);
            BankAccount bankAccount2 = new BankAccount(321456, "Лодочкин", 1000);
            bankAccount1.displayAccountInfo();
            bankAccount2.displayAccountInfo();
        } catch (IllegalArgumentException  e){
            System.out.println(e.getMessage());//Так правильно ловить исключения?
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        //Я не понимаю как правильно оформлять блоки трай кэтч - что надо в них писать, что не надо.
        //Как это должно быть грамотно?
        System.out.println("Задание 2: Студент");
        try{
            Student student1 = new Student();
            Student student2 = new Student();
            student1.setName("Алексей");
            student1.setAge(18);
            student1.setMiddleMark(50);
            student2.setName("Юлия");
            student2.setAge(17);
            student2.setMiddleMark(-5);
            System.out.println(student1);
            System.out.println(student2);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Задание 3: Книга");
        try{
            Book book1 = new Book("Гоголь Н.В.", "Вечера на хуторе близ Диканьки", 720, 542.50);
            Book book2 = new Book("Булгаков М.А.", "Собачье сердце", 138, 324.20);
            System.out.println(book1 +"\n" + book2);
            book2.setPrice(-5);
            System.out.println(book1 +"\n" + book2);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Задание 4: Прямоугольник");
        try {
            Rectangle rectangle = new Rectangle(100,150);
            System.out.println(rectangle);
            System.out.println("Площадь прямоугольника = "+rectangle.getArea() + ", периметр = " + rectangle.getPerimeter());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Задание 5: Пароль");
        Password d = new Password();
        d.setPassword("12345678");
        d.setPassword("12345678");
        System.out.println("Пароли совпадают? " + d.passwordChecker("12345678"));
    }

}
