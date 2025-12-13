package LessonEighteen.Incapsulation;
/*
Создай класс BankAccount с приватными полями: номер счета, владелец, баланс.
Добавь методы для пополнения счета, снятия денег (с проверкой достаточности средств) и получения баланса.
Все поля должны быть защищены от прямого доступа.
 */
public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount() {}

    public BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше нуля");
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Вы пытаетесь снять сумму больше, чем есть на счету" + balance);
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Вы ввели отрицательное значение или ноль");
        }
        balance -= amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Номер счёта не может быть отрицательным и не может быть равен нулю");
        } else if (accountNumber < 100_000 || accountNumber > 999_999) {
            throw new IllegalArgumentException("Номер счета должен состоять из 6 цифр");
        }
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty() || ownerName.isBlank()){
            throw new IllegalArgumentException("Вы оставили строку пустой, введите имя");
        } else if (ownerName.matches(".*\\d.*")){
            throw new IllegalArgumentException("В имени не должно быть цифр");
        } else if (ownerName.startsWith(" ") || ownerName.endsWith(" ")){
            throw new IllegalArgumentException("Имя не может начинаться или заканчиваться пробелом");
        }
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void displayAccountInfo() {
        System.out.println("Владелец карты: " + ownerName + ", номер счёта: " + accountNumber + ", баланс: " + balance);
    }
}
