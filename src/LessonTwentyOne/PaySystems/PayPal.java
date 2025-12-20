package LessonTwentyOne.PaySystems;

public class PayPal implements Payable{
    private double balance;
    private double amount;
    @Override
    public double processPayment(double amount) {
        setAmount(amount);
        if (amount > balance ){
            throw new IllegalArgumentException("Сумма превышает доступный лимит средств на счету");
        }else if (amount <= 0){
            throw new IllegalArgumentException("Указанная сумма платежа должна быть положительной");
        }
        return balance -= amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double refundPayment(double amount) {
        if (amount > 0 && this.amount == amount){//как бы ту же сумму вернуть, что заплатили, иначе, что за деньги? Не будет возврата
            return balance += amount;
        }
        return 0;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }
}
