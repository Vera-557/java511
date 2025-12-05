package Java511YostEncapsulation.First;

class ChildBankAccount {
    private double balance;
    private final double maxBalance;

    public double getBalance() {
        return balance;
    }

    public double getMaxBalance() {
        return maxBalance;
    }

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        if (value < 0) {
            return false;
        } else if (balance + value > maxBalance) {
            return false;
        } else {
            balance += value;
            return true;
        }
    }

    public boolean debitMoney(double value) {
        if (value < 0 || value > maxBalance || value > balance) {
            return false;
        } else {
            balance -= value;
            return true;
        }
    }
}
