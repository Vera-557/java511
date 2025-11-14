import java.util.Random;
import java.util.Scanner;

public class LessenThirteen {
   static Scanner scanner = new Scanner(System.in);
   static Random random = new Random();
/*
//Uqaday

//1 Человек-Компютер
//2 Компютер-Человек

//1 Человек-Компютер
//Введите имя : Фарид
//Фарид загадай число : 66

//Компютер угадывает число : 10

//1 - Больше
//2 - Меньше

//Ответ : 1

//Компютер угадывает число : 70

//1 - Больше
//2 - Меньше

//Ответ : 2

//Компютер угадывает число : 66

//Урра компютер угадал число с 5 попыток


/// ///////////////////////////////////////////////////////////////////////////////////////////////


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
 */
static String userName(String name) {
    return name;
}
static void helloMenu (String name) {
    System.out.println(name + ", выберите режим игры: 1 - компьютер загадывает число, 2 - вы загадываете число");
    int choice = scanner.nextInt();
    if (choice < 1 || choice > 2){
        helloMenu(name);
    } else if (choice == 1) {
        System.out.println();
    } else {
        computerChoice();
    }
}
static int randomNum (){
    return random.nextInt(1,101);
}
static void computerChoice (){
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
                System.out.println("Вы угадали! " + answer + " = " + computer);
                break;
            }
            if (count == 5) System.out.println("Вы проиграли");
        }
        System.out.println("Сыграем еще раз? \n - y/д = да");
        yesOrNo = scanner.next().charAt(0);
    } while (yesOrNo == 'y' || yesOrNo == 'д');

}

    public static void main(String[] args) {
    System.out.println("Добро пожаловать в \"Угадайку\"");
    System.out.println("Введите ваше имя:");
    String name = scanner.next();
    helloMenu(userName(name));
    }
}
