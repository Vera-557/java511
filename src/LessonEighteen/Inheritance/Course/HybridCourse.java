package LessonEighteen.Inheritance.Course;

public class HybridCourse extends Course{
    private String platform;
    private String address;

    public HybridCourse(String name, int length, String platform, String address) {
        super(name, length);
        this.platform = platform;
        this.address = address;
    }

    @Override
    public String getCourseInfo() {
        return "Гибридный-курс: " + name + ", Продолжительность: " + length + " часов, Адрес оффлайн занятий:: " + address + "Онлайн-платформа: " + platform;
    }

    public String getPlatform() {
        return platform;
    }

    public String getAddress() {
        return address;
    }
}
