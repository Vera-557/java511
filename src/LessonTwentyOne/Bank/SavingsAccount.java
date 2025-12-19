package LessonTwentyOne.Bank;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    @Override
   public double withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount >= 1000)){
            return dopolnitelnijMetod(amount);
        }
        return 0;
    }

    @Override
    public double deposit(double amount) {
        return super.deposit(amount);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
