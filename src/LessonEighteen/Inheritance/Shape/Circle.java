package LessonEighteen.Inheritance.Shape;

public class Circle extends Shape{
    private double radius;
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
   public double calculatePerimeter() {
return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)  this.radius = radius;
    }
}
