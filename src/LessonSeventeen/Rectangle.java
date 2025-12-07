package LessonSeventeen;

public class Rectangle {
//Создайте класс Rectangle с полями: width (ширина), height (высота), color (цвет)
//Создайте конструктор для квадрата (один параметр - сторона)
//Создайте конструктор для прямоугольника без цвета
//Создайте конструктор со всеми параметрами
//Создайте методы: getArea(), getPerimeter(), isSquare()
//В main создайте массив из 5 фигур (квадраты и прямоугольники) и найдите фигуру с максимальной площадью
private double width;
    private double height;
    private String color;

    public Rectangle(double side) {
        this(side, side, "Black");
    }

    public Rectangle(double width, double height) {
        this(width, height, "Black");
    }

    public Rectangle(double width, double height, String color) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Ширина и высота должны быть положительными числами");
        }
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        if (height != width){
            return false;
        }
        return true;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Ширина должна быть положительным числом");
            return;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Высота должна быть положительным числом");
            return;
        }
        this.height = height;
    }

    public void setColor(String color) {
        this.color = (color == null || color.trim().isEmpty()) ? "Black" : color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[5];
        shapes[0] = new Rectangle(5.0);
        shapes[1] = new Rectangle(8.0, 12.0, "Red");
        shapes[2] = new Rectangle(10.0, 10.0, "Blue");
        shapes[3] = new Rectangle(6.0, 9.0);
        shapes[4] = new Rectangle(15.0, 15);
        for (Rectangle rectangle : shapes){
            System.out.println(rectangle.toString());
        }
        System.out.println();
        int maxIndex = 0;

        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].getArea() > shapes[maxIndex].getArea()) {
                maxIndex = i;
            }
        }

        System.out.println("=== ФИГУРА С МАКСИМАЛЬНОЙ ПЛОЩАДЬЮ ===\n");
        System.out.println("Максимальная площадь: " + shapes[maxIndex].getArea() + " см²");
        System.out.println(shapes[maxIndex].toString());
    }
}
