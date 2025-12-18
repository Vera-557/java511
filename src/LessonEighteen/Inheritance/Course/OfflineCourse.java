package LessonEighteen.Inheritance.Course;

public class OfflineCourse extends Course {
    private String address;

    public OfflineCourse(String name, int length, String address) {
        super(name, length);
        this.address = address;
    }


    @Override
    public String getCourseInfo() {
        return "Офлайн-курс: " + name + ", Продолжительность: " + length + " часов, адрес: " + address;
    }

    public String getAddress() {
        return address;
    }
}
