package LessonSeventeen;

public class BankCard {
    //Задание 3: Класс "Банковская карта" (BankCard)
//Что нужно сделать:
//
//Создайте класс BankCard с полями: cardNumber (номер карты), ownerName (имя владельца), balance (баланс), expiryDate (срок действия)
//Создайте конструкторы с разным количеством параметров
//Создайте метод deposit(double amount) для пополнения
//Создайте метод withdraw(double amount) для снятия (проверяйте достаточно ли денег)
//Создайте метод transfer(BankCard recipient, double amount) для перевода денег на другую карту
//В main создайте 3 карты и проведите операции между ними
    private final String cardNumber;
    private final String ownerName;
    private double balance;
    private final String expiryDate;

    public BankCard(String cardNumber, String ownerName, double balance, String expiryDate) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.expiryDate = expiryDate;
    }

    public BankCard(String cardNumber, String ownerName, String expiryDate) {
        this(cardNumber, ownerName, 0.0, expiryDate);
    }

    public BankCard(String cardNumber, String ownerName) {
        this(cardNumber, ownerName, 0.0, "12/28");
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма для пополнения должна быть больше 0");
            return;
        }
        balance += amount;
        System.out.println("На карту " + cardNumber + " успешно зачислено " + amount + " руб.");
        System.out.println("Новый баланс: " + balance + " руб.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма для снятия должна быть больше 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Недостаточно средств на карте " + cardNumber);
            System.out.println("Запрошено: " + amount + " руб., доступно: " + balance + " руб.");
            return;
        }

        balance -= amount;
        System.out.println("С карты " + cardNumber + " успешно снято " + amount + " руб.");
        System.out.println("Новый баланс: " + balance + " руб.");
    }

    public void transfer(BankCard recipient, double amount) {
        if (amount <= 0) {
            System.out.println("Сумма перевода должна быть больше 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Недостаточно средств для перевода");
            System.out.println("Запрошено: " + amount + " руб., доступно: " + balance + " руб.");
            return;
        }

        if (recipient == null) {
            System.out.println("Получатель не указан");
            return;
        }

        if (this.cardNumber.equals(recipient.cardNumber)) {
            System.out.println("Нельзя перевести деньги на ту же карту");
            return;
        }
        this.balance -= amount;
        recipient.balance += amount;

        System.out.println("Успешный перевод!");
        System.out.println("С карты " + this.cardNumber + " переведено " + amount + " руб. на карту " + recipient.cardNumber);
        System.out.println("Ваш новый баланс: " + this.balance + " руб.");
        System.out.println("Баланс получателя: " + recipient.balance + " руб.");
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Номер карты :" + cardNumber + " держатель карты : " + ownerName + " баланс на карте " + balance + " срок действия: " + expiryDate;
    }

    public static void main(String[] args) {
        BankCard card1 = new BankCard("1234-5678-9012-3456", "Иван Петров", 50000.0, "08/25");
        BankCard card2 = new BankCard("9876-5432-1098-7654", "Мария Сидорова", "12/26");
        BankCard card3 = new BankCard("1111-2222-3333-4444", "Алексей Иванов");
        BankCard[]  array = {card1, card2, card3};
        for (BankCard bankCard : array) {
            System.out.println(bankCard.toString());
        }
        System.out.println("\n=== ОПЕРАЦИИ ПОПОЛНЕНИЯ ===\n");
        card2.deposit(25000);
        card3.deposit(15000);

        System.out.println("\n=== ОПЕРАЦИИ СНЯТИЯ ===\n");
        card1.withdraw(10000);
        card2.withdraw(5000);

        System.out.println();

        BankCard[] array2 = {card1, card2, card3};
        for (BankCard bankCard : array2) {
            System.out.println(bankCard.toString());
        }
        System.out.println("\n=== ОПЕРАЦИИ ПЕРЕВОДОВ ===\n");
        card1.transfer(card2, 15000);
        card2.transfer(card3, 8000);

        System.out.println();
        BankCard[] array3 = {card1, card2, card3};
        for (BankCard bankCard : array3) {
            System.out.println(bankCard.toString());
        }
    }
}
