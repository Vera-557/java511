package S1po11;

public class LessonSeven {
    public static void main(String[] args) {
        System.out.println("Задание номер 1 - прямоугольник");
        int width = 5;
        int height = 7;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Задание номер 4 - треугольник вверх");
        int size = 10;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Задание номер 5 - треугольник вниз");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (i == 0 || j == 0 || j == size - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Задание номер 6 - треугольник равнобедренный: ");
        int num = 1;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num -1 || i == size) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            num=num+2;
            System.out.println();
        }
        System.out.println("Задание номер 7 - ромб");

// Верхняя часть ромба
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

// Нижняя часть ромба
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
