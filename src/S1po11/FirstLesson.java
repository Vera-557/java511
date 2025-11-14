package S1po11;

public class FirstLesson {
    public static void main(String[] args) {
        //Сделаю задание при помощи циклов и обычных выводов.
        drawSout(); // Тут просто картинки
        // Определим размеры наших фигур
        drawRectangle(8, 5);
        drawKosajaPalkaVpravo(8);
        drawKosajaPalkaVlevo(8);
        drawTriangleVniz(8);
        drawTriangleVverh(8);
        drawTriangle(8);
        drawRhomb(8);

    }

    //Чтоб не писать кучу методов на каждую фигуру, все "рукописные" фигуры помещу в 1 метод
    static void drawSout() {
        //Первое задание
        System.out.println();
        System.out.println(" *  *  *  *  *");
        System.out.println(" *  *  *  *  *");
        System.out.println(" *  *  *  *  *");
        System.out.println(" *  *  *  *  *");
        System.out.println(" *  *  *  *  *");
        System.out.println(" *  *  *  *  *");
        System.out.println(" *  *  *  *  *");
        System.out.println(" *  *  *  *  *");
        //Второе задание
        System.out.println();
        System.out.println("*");
        System.out.println(" *");
        System.out.println("  *");
        System.out.println("   *");
        System.out.println("    *");
        System.out.println("     *");
        System.out.println("      *");
        System.out.println("       *");
        //Третье задание
        System.out.println();
        System.out.println("       *");
        System.out.println("      *");
        System.out.println("     *");
        System.out.println("    *");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*");
        //Четвертое задание (разнообразим переходами)
        System.out.println();
        System.out.println(
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n" +
                        "******\n" +
                        "*******");
        //Пятое задание
        System.out.println();
        System.out.println(
                "*******\n" +
                        "******\n" +
                        "*****\n" +
                        "****\n" +
                        "***\n" +
                        "**\n" +
                        "*");
        //Шестое задание
        System.out.println();
        System.out.println(
                "       *\n" +
                        "      ***\n" +
                        "     *****\n" +
                        "    *******\n" +
                        "   *********\n" +
                        "  ***********\n" +
                        " *************\n" +
                        "***************");
        //Седьмое задание
        System.out.println();
        System.out.println(
                "       *\n" +
                        "      ***\n" +
                        "     *****\n" +
                        "    *******\n" +
                        "   *********\n" +
                        "  ***********\n" +
                        " *************\n" +
                        "***************\n" +
                        " *************\n" +
                        "  ***********\n" +
                        "   *********\n" +
                        "    *******\n" +
                        "     *****\n" +
                        "      ***\n" +
                        "       *");
    }

    static void drawRectangle(int height, int width) {
        System.out.println(); //Эта строка отступ просто для красоты, чтоб верхняя строчка не мешала
        System.out.println("\nЭтот прямоугольник нарисован циклом for");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
                if (j == width - 1) {
                    System.out.println();
                }
            }
        }

    }

    static void drawKosajaPalkaVpravo(int height) {
        System.out.println();
        System.out.println("\nКосая черта, которая выведена при помощи цикла");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }

    static void drawKosajaPalkaVlevo(int height) {
        System.out.println();
        System.out.println("\nКосая черта, которая выведена при помощи цикла");
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }

    static void drawTriangleVniz(int height) {
        System.out.println();
        System.out.println("\nТреугольник, нарисован при помощи цикла");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void drawTriangleVverh(int height) {
        System.out.println();
        System.out.println("\nТреугольник, нарисован при помощи цикла");
        for (int i = 0; i < height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void drawTriangle(int height) {
        System.out.println();
        System.out.println("\nТреугольник, нарисован при помощи цикла");
        for (int i = 0; i < height; i++) {//внешний цикл высота, номера строки итератор
            for (int j = 0; j < height - i - 1; j++) {
                //Рисуем побелы слева. Высота - номер_строки - 1, так высота 8 - 0 строка - 1 = 7
                //7 пробелов слева и 1 звёздочка посередине
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                //Количество звёзд = 2 * номер_строки + 1
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void drawRhomb(int height) {
        System.out.println();
        System.out.println("\nРомб, нарисован при помощи цикла");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}