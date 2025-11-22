import java.util.Random;
import java.util.Scanner;

public class LessenThirteen {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String name;

//2 Компютер-Человек
//Введите имя : Фарид
//Фарид компютер загадал число : x . Постарайтесь найти его!  (x = 33)

//Фарид введи число : 10
//Больше

//Фарид введи число : 40
//Меньше

//Фарид введи число : 33


//Урра Фарид угадал число с 3 попыток


/// ///////////////////////////////////////////////////////////////////////////////////////////

//***

// 1 - Start
// 2 - Подсказки (off)
// 3 - Попытки (off)
// 4 - Диапазон (0-100)


//if , switch , loop , peremennie , metod , array


    static void helloMenu(String name) {

        System.out.println(name + ", выберите режим игры: 1 - компьютер загадывает число, 2 - вы загадываете число");
        int choice = scanner.nextInt();
        if (choice < 1 || choice > 2) {
            helloMenu(name);
        } else if (choice == 1) {
            humanChoice();
        } else {
            System.out.println("Вы хотите получать подсказки? 1 - играть с подсказками, 2 - без подсказок");
            int choice2 = scanner.nextInt();
            if (choice2 == 1) {
                computerChoice();
            } else if (choice2 == 2) {
                computerChoiceWithoutHelp();
            } else helloMenu(name);

        }
    }

    static int randomNum() {
        return random.nextInt(1, 101);
    }

    static void computerChoice() {
        char yesOrNo;
        do {
            int count = 1;
            System.out.println("Компьютер загадывает число от 1  до 100");
            int computer = randomNum();
            System.out.println("Введите предполагаемое число, у вас 5 попыток:\n" + count + " попытка");
            int answer = scanner.nextInt();
            while (count < 5) {
                if (answer > computer) {
                    ++count;
                    System.out.println("Загаданное число меньше " + count + " попытка");
                    answer = scanner.nextInt();
                } else if (answer < computer) {
                    ++count;
                    System.out.println("Загаданное число больше " + count + " попытка");
                    answer = scanner.nextInt();
                } else {
                    System.out.println(name + "Вы угадали! " + answer + " = " + computer);
                    break;
                }
                if (count == 5) System.out.println(name + " Вы проиграли");
            }
            System.out.println("Сыграем еще раз? \n - y/д = да");
            yesOrNo = scanner.next().charAt(0);
        } while (yesOrNo == 'y' || yesOrNo == 'д');

    }

    static void computerChoiceWithoutHelp() {
        char yesOrNo;
        do {
            int count = 1;
            System.out.println("Компьютер загадывает число от 1  до 100");
            int computer = randomNum();
            System.out.println("Введите предполагаемое число, у вас 5 попыток:\n" + count + " попытка");
            int answer = scanner.nextInt();
            while (count < 5) {
                if (answer > computer) {
                    ++count;
                    System.out.println("Нет, не угадали " + count + " попытка");
                    answer = scanner.nextInt();
                } else if (answer < computer) {
                    ++count;
                    System.out.println("Нет, не угадали " + count + " попытка");
                    answer = scanner.nextInt();
                } else {
                    System.out.println("Вы угадали! " + answer + " = " + computer);
                    break;
                }
                if (count == 5) System.out.println("Вы проиграли");
            }
            System.out.println("Сыграем еще раз? \n - y/д = да");
            yesOrNo = scanner.next().charAt(0);
        } while (yesOrNo == 'y' || yesOrNo == 'д');

    }

    public static void gameMenu() {
        System.out.println("Хотите изменить режим игры? 1 - да, 2 - нет");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 2) {
            System.out.println("Хотите изменить режим игры? 1 - да, 2 - нет");
            choice = scanner.nextInt();
            if (choice == 1) {
                helloMenu(name);
            }
        }
    }

    public static void humanChoice() {
        System.out.println("Загадайте число от 1 до 100");
        int userNum = scanner.nextInt();
        if (userNum < 1 || userNum > 100) {
            System.out.println("Вы вышли за указанный диапазон. Число от 1 до 100");
            humanChoice();
        }
        System.out.println("Компьютер даёт ответ:");

    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в \"Угадайку\"");
        System.out.println("Введите ваше имя:");
        name = scanner.next().trim();
        helloMenu(name);
    }
}
