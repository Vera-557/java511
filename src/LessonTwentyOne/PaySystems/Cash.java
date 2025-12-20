package LessonTwentyOne.PaySystems;

public class Cash implements Payable{
    private double balance;
    @Override
    public double processPayment(double amount) {
        //так как это наличные деньги, можно уйти в минус, заняв деньги у соседа
        if (amount >= 0){
            return balance -= amount;
        }
        System.out.println("Цена товара должна быть положительной");
        return 0;
    }

    @Override
    public double refundPayment(double amount) {
        if (amount > 0){
            return balance += amount;
        }
        return 0;
    }
    public void setBalance(double balance) {
        if (balance >= -10_000) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
}
