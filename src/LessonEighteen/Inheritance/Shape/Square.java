package LessonEighteen.Inheritance.Shape;

public class Square extends Shape {
    private double length;

    @Override
    public double calculateArea() {
        return Math.pow(length,2);
    }

    @Override
    public double calculatePerimeter() {
        return length * 4;
    }

    public void setLength(double length) {
        if (length > 0) this.length = length;
    }
}
