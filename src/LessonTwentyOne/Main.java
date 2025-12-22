package LessonTwentyOne;

import LessonTwentyOne.Bank.CurrentAccount;
import LessonTwentyOne.Bank.SavingsAccount;
import LessonTwentyOne.Controllable.Fan;
import LessonTwentyOne.Controllable.Light;
import LessonTwentyOne.Controllable.SmartTV;
import LessonTwentyOne.DataStorage.CloudStorage;
import LessonTwentyOne.DataStorage.DataStorage;
import LessonTwentyOne.DataStorage.DatabaseStorage;
import LessonTwentyOne.DataStorage.FileStorage;
import LessonTwentyOne.Employee.Developer;
import LessonTwentyOne.Employee.Employee;
import LessonTwentyOne.Employee.Intern;
import LessonTwentyOne.Employee.Manager;
import LessonTwentyOne.PaySystems.Cash;
import LessonTwentyOne.PaySystems.CreditCard;
import LessonTwentyOne.PaySystems.PayPal;
import LessonTwentyOne.PaySystems.Payable;
import LessonTwentyOne.Transport.Boat;
import LessonTwentyOne.Transport.Car;
import LessonTwentyOne.Transport.Transport;

public class Main {
    public static void main(String[] args) {
        System.out.println("＼(٥⁀▽⁀ )／*:･ﾟ✧*:･ﾟ✧\t\t\t\tЗадание 1: Банковские счета\n");
        CurrentAccount currentAccount = new CurrentAccount("45GYL4851IIOON", 1000, "Ирина");
        System.out.println(currentAccount);
        currentAccount.deposit(5000);
        currentAccount.withdraw(500);
        System.out.println(currentAccount);
        SavingsAccount savingsAccount = new SavingsAccount("5634KKYYRR", 500, "Олег");
        System.out.println(savingsAccount);
        savingsAccount.deposit(10000);
        savingsAccount.withdraw(50);
        System.out.println(savingsAccount);//всё работает, ура
        System.out.println("\n\n＼(٥⁀▽⁀ )／*:･ﾟ✧*:･ﾟ✧\t\t\t\tЗадание 2: Транспорт\n");
        Transport car = new Car("VolksWagen", 2025, 350);
        Transport boat = new Boat("Хендай", 2020, 200);
        Transport[] transports = {car, boat};
        for (Transport transport : transports) {
            System.out.println(transport.displayInfo());
        }
        System.out.println("\n\n＼(٥⁀▽⁀ )／*:･ﾟ✧*:･ﾟ✧\t\t\t\tЗадание 3: Сотрудники компании\n");
        Employee manager = new Manager("Екатерина", 3504, 11000.00);
        Employee developer = new Developer("Елизавета", 1456, 12000.00, 5);
        Employee intern = new Intern("Константин", 573, 10000.0);
        Employee[] employees = {manager, developer, intern};
        for (Employee employee : employees) {
            employee.calculateSalary();
            System.out.println(employee.getInfo());
        }
        System.out.println("\n\n＼(٥⁀▽⁀ )／*:･ﾟ✧*:･ﾟ✧\t\t\t\tЗадание Задание 4: Платежные системы\n");
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();
        creditCard.setBalance(10000);
        payPal.setBalance(100);
        System.out.println("Кредитная карта. Баланс: " + creditCard.getBalance() + ", \nснять сумму: " + creditCard.processPayment(500) + ", \nвернуть средства: " + creditCard.refundPayment(100.0));
        try {
            System.out.println("Пэйпол. Баланс: " + payPal.getBalance() + ", \nплатёж: " + payPal.processPayment(50) + ": снять сумму: " + payPal.getAmount() + ", \nвернуть средства: " + payPal.refundPayment(50.0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Cash cash = new Cash();
        cash.setBalance(1000);
        System.out.println("Наличные в кошельке. Баланс: " + cash.getBalance() + ", \nкупить товар: " + cash.processPayment(1100) + ", \nвернуть деньги: " + cash.refundPayment(100.0));
        Payable [] payable ={creditCard, payPal, cash};
        for (Payable payable1 : payable){
            payable1.printReceipt();
        }
        System.out.println("\n\n＼(٥⁀▽⁀ )／*:･ﾟ✧*:･ﾟ✧\t\t\t\tЗадание Задание 5: Умный дом\n");
        Fan fan = new Fan();
        fan.turnOn();
        fan.getStatus();
        fan.turnOff();
        fan.getStatus();
        Light light = new Light();
        light.turnOn();
        light.setBrightness(3);
        light.getStatus();
        System.out.println(light.getBrightness());
        light.turnOff();
        light.getStatus();
        SmartTV smartTV = new SmartTV();
        smartTV.turnOn();
        smartTV.setBrightness(45);
        smartTV.getStatus();
        System.out.println(smartTV.getBrightness());
        smartTV.turnOff();
        smartTV.getStatus();
        System.out.println("\n\n＼(٥⁀▽⁀ )／*:･ﾟ✧*:･ﾟ✧\t\t\t\tЗадание Задание 6: Хранилища данных\n");
        FileStorage fileStorage = new FileStorage();
        fileStorage.save("Информационна строка");
        System.out.println(fileStorage.load());
        System.out.println(fileStorage.delete() + fileStorage.load());
        CloudStorage cloudStorage = new CloudStorage();
        cloudStorage.save("Фотографии и видео в облаке");
        System.out.println(cloudStorage.load());
        System.out.println(cloudStorage.delete() + cloudStorage.load());
        DatabaseStorage databaseStorage = new DatabaseStorage();
        databaseStorage.save("Здесь адрес базы данных");
        System.out.println(databaseStorage.load());
        System.out.println(databaseStorage.delete() + databaseStorage.load());
        DataStorage.getStorageType();
    }
}
