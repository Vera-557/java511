import java.util.Random;
import java.util.Scanner;

public class LessonThirteen {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String name;

    static void helloMenu(String name) {
        System.out.println(name + ", выберите режим игры: 1 - компьютер загадывает число, 2 - вы загадываете число, 3 - выход из игры");
        int choice = scanner.nextInt();
        while (choice != 1 && choice != 2 && choice != 3) {
            choice = scanner.nextInt();
        }
        if (choice == 1) {
            System.out.println("Компьютер загадывает число, вы отгадываете");
            System.out.println("Вы хотите получать подсказки? 1 - играть с подсказками, 2 - без подсказок");
            int choice2 = scanner.nextInt();
            while (choice2 != 1 && choice2 != 2) {
                choice2 = scanner.nextInt();
            }
            if (choice2 == 1) {
                computerChoice();
            } else computerChoiceWithoutHelp();
        }else if (choice == 2) {
            humanChoice();
        }else {
            System.out.println("До свидания!");
            return;
        }
    }
    static char askPlayAgain() {
        System.out.println("Сыграем еще раз? (y/д = да, любой другой символ = нет)");
        return scanner.next().toLowerCase().charAt(0);
    }
    static void computerChoice() {
        char ifPlay;
        do {
            int count = 1;
            System.out.println("Компьютер загадывает число от 1  до 100");
            int computer = random.nextInt(1,101);

            System.out.println("Введите предполагаемое число, у вас 5 попыток: " + count + " попытка");
            int answer;
            while (count < 5) {
                answer = scanner.nextInt();
                if (answer < 1 || answer > 100) {
                    System.out.println("Число должно быть от 1 до 100!");
                    continue;
                }
                count ++;
                if (answer > computer) {
                    System.out.println("Загаданное число меньше " + count + " попытка");

                } else if (answer < computer) {
                    System.out.println("Загаданное число больше " + count + " попытка");

                } else {
                    System.out.println(name + " Вы угадали! " + answer + " = " + computer);
                    break;
                }
                if (count == 5) System.out.println(name + " Вы проиграли");
            }
            ifPlay = askPlayAgain();
        } while (ifPlay == 'y' || ifPlay == 'д');

    }

    static void computerChoiceWithoutHelp() {
        char ifPlay;
        do {
            int count = 1;
            System.out.println("Компьютер загадывает число от 1  до 100");
            int computer = random.nextInt(1,101);

            System.out.println("Введите предполагаемое число, у вас 5 попыток: " + count + " попытка");
            int answer;
            while (count < 5) {
                answer = scanner.nextInt();
                if (answer < 1 || answer > 100) {
                    System.out.println("Число должно быть от 1 до 100!");
                    continue;
                }
                count ++;
                if (answer > computer) {
                    System.out.println("Не угадали! " + count + " попытка");

                } else if (answer < computer) {
                    System.out.println("Не угадали! " + count + " попытка");

                } else {
                    System.out.println(name + ", Вы угадали! " + answer + " = " + computer);
                    break;
                }
                if (count == 5) System.out.println(name + " Вы проиграли");
            }
            ifPlay = askPlayAgain();
        } while (ifPlay == 'y' || ifPlay == 'д');

    }

    public static void humanChoice() {
        char ifPlay;
        do {
            int min = 1;
            int max = 100;
            System.out.println(name + ", Загадайте число от 1 до 100");
            int userNum = scanner.nextInt();
            int count = 0;
            while (count < 5) {
                ++count;
                int computerNum = random.nextInt(max - min + 1) + min;
                System.out.println("Компьютер предлагает число " + computerNum);
                if (computerNum == userNum) {
                    System.out.println("Компьютер угадал!" + computerNum + " = " + userNum);
                    System.out.println("Использовано " + count + " попыток");
                    return;
                } else {
                    int help;
                    do {
                        System.out.println("Ваше число больше? - 1 или меньше? - 2?");
                        help = scanner.nextInt();
                    } while (help != 1 && help != 2);
                    if (help == 1) {
                        System.out.println("Вы говорите, что нужно больше");
                        min = computerNum + 1;
                    } else{
                        System.out.println("Вы говорите, что нужно меньше");
                        max = computerNum - 1;
                    }
                }
            }
            System.out.println("Компьютер проиграл");
            ifPlay = askPlayAgain();
        } while (ifPlay == 'y' || ifPlay == 'д');
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в \"Угадайку\"");
        System.out.println("Введите ваше имя:");
        name = scanner.next().trim();
        helloMenu(name);
    }
}