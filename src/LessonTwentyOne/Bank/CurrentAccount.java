package LessonTwentyOne.Bank;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    @Override
   public double withdraw(double amount) {
        if (getBalance() > -5001 && amount > 0){
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
