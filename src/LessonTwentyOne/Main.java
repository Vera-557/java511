package LessonTwentyOne;

import LessonTwentyOne.Bank.CurrentAccount;
import LessonTwentyOne.Bank.SavingsAccount;
import LessonTwentyOne.Employee.Developer;
import LessonTwentyOne.Employee.Employee;
import LessonTwentyOne.Employee.Intern;
import LessonTwentyOne.Employee.Manager;
import LessonTwentyOne.Transport.Boat;
import LessonTwentyOne.Transport.Car;
import LessonTwentyOne.Transport.Transport;

public class Main {
    public static void main(String[] args) {
        System.out.println("＼(٥⁀▽⁀ )／*:･ﾟ✧*:･ﾟ✧\t\t\t\tЗадание 1: Банковские счета\n");
        CurrentAccount currentAccount = new CurrentAccount("45GYL4851IIOON",1000,"Ирина");
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
        Transport [] transports = {car,boat};
        for (Transport transport : transports){
            System.out.println( transport.displayInfo());
        }
        System.out.println("\n\n＼(٥⁀▽⁀ )／*:･ﾟ✧*:･ﾟ✧\t\t\t\tЗадание 3: Сотрудники компании\n");
        Employee manager = new Manager("Екатерина", 3504, 11000.00);
        Employee developer = new Developer("Елизавета", 1456, 12000.00, 5);
        Employee intern = new Intern("Константин", 573,10000.0);
        Employee [] employees = {manager,developer, intern};
        for (Employee employee : employees){
            employee.calculateSalary();
            System.out.println(employee.getInfo());
        }

    }
}
