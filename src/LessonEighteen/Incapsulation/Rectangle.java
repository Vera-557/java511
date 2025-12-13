package LessonEighteen.Incapsulation;

/*
Создай класс Rectangle с приватными полями длина и ширина.
Добавь методы для установки размеров (с проверкой на положительные значения),
 методы для вычисления площади и периметра. Не давай прямого доступа к полям.
 */
public class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        if (width <= 0){
            throw new IllegalArgumentException("Ширина должна быть больше нуля");
        }
        this.width = width;
    }

    public void setHeight(int height) {
        if (height <= 0){
            throw new IllegalArgumentException("Высота должна быть больше нуля");
        }
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
