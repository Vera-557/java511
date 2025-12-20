package LessonTwentyOne.PaySystems;

public interface Payable {
    double processPayment(double amount);// - обработка платежа
    double refundPayment(double amount);// - возврат средств
    default void printReceipt(){
        System.out.println("Чек распечатан");
    }// - выводит "Чек распечатан"
}
