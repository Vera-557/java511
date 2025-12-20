package LessonTwentyOne.PaySystems;

public class CreditCard implements Payable {
    private double balance;

    @Override
    public double processPayment(double amount) {
//Обработка платежа, значит баланс должен быть минимум на сумму платежа.
        //нельзя писать отрицательное число, иначе будет арифметическая ошибка
        if (amount <= balance && amount >= 0){
            return balance -= amount;
        }
        System.out.println("Недостаточно средств");
        return 0;
    }

    @Override
    public double refundPayment(double amount) {
        //возврат средств. Не совсем понятно это возврат от платежа или просто условный возврат от энной покупки?
        if (amount > 0){
            return balance += amount;
        }
        return 0;
        //если это возврат с предыдущего метода, то мне нужно отдельно хранить эту переменную, чтоб ее значение использовать в качестве amount
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
