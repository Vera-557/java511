package LessonTwentyOne.Bank;

import java.util.Scanner;
/*
Задание 1: Банковские счета
Создайте абстрактный класс BankAccount с полями:

accountNumber (String) - номер счета
balance (double) - баланс
ownerName (String) - имя владельца

Добавьте:

Конструктор для инициализации всех полей
Конкретный метод deposit(double amount) - пополнение счета
Конкретный метод getBalance() - получение баланса
Абстрактный метод withdraw(double amount) - снятие денег

Создайте два класса-наследника:

SavingsAccount (сберегательный счет) - можно снять деньги только если баланс после снятия останется >= 1000
CurrentAccount (текущий счет) - можно снять любую сумму, даже уйти в минус до -5000



 */

abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    BankAccount(String accountNumber, double balance, String ownerName) {
        setAccountNumber(accountNumber);
        this.balance = balance;
        setOwnerName(ownerName);
    }

    public void setAccountNumber(String accountNumber) {
        Scanner scanner = new Scanner(System.in);
        while (accountNumber.length() < 8) {
            System.out.println("Номер должен содержать 8 цифр или символов. Введите снова");
            accountNumber = scanner.next();

        }
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        Scanner scanner = new Scanner(System.in);
        while (ownerName.isEmpty()){
            System.out.println("Поле имени не может быть пустым");
            ownerName = scanner.next();
        }
        this.ownerName = ownerName;
    }

    double deposit(double amount) {
        if (amount > 0) {
            return balance += amount;
        }
        return 0;
    }

    public double getBalance() {
        return balance;
    }

    abstract double withdraw(double amount);
    double dopolnitelnijMetod(double amount){
        ///Это дополнительный метод для вычета денег со счета, так как мои поля приватные и я не могу их изменить вне класса
        return balance -= amount;
    }

    @Override
    public String toString() {
        return "Имя владельца: " + ownerName + ", номер счёта: " + accountNumber + ", баланс: " + balance;
    }
}
