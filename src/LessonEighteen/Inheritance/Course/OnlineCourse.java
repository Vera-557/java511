package LessonEighteen.Inheritance.Course;

public class OnlineCourse extends Course {
    private String platform;
    public OnlineCourse(String name, int length, String platform) {
        super(name, length);
        this.platform = platform;
    }
    @Override
    public String getCourseInfo() {
        return "Онлайн-курс: " + name + ", Продолжительность: " + length + " часов, Платформа: " + platform;
    }

    public String getPlatform() {
        return platform;
    }
}
