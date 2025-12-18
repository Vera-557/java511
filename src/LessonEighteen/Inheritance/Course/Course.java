package LessonEighteen.Inheritance.Course;

public class Course {
    String name;
    int length;

    public Course(String name, int length) {
        this.name = name;
        this.length = length;
    }
    public String getCourseInfo() {
        return String.format("Курс: %s, Продолжительность: %d часов", name, length);
    }
    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }
}
