package LessonEighteen.Incapsulation;
/*
Создай класс Student с приватными полями: имя, возраст, средний балл.
Добавь геттеры и сеттеры, но в сеттере для возраста проверяй,
чтобы возраст был от 16 до 100 лет, а для среднего балла - от 0 до 100.
 */
public class Student {
private String name;
private int age;
private double middleMark;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMiddleMark() {
        return middleMark;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.trim().isEmpty()){
            throw new IllegalArgumentException("Вы не ввели имя студенту");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 16 || age > 100){
            throw new IllegalArgumentException("Вы ввели не правильный возраст. Возраст студента возможен от 16 до 100 лет");
        }
        this.age = age;
    }

    public void setMiddleMark(double middleMark) {
        if (middleMark < 0 || middleMark > 100){
            System.out.println("Не правильный диапазон среднего балла. Введите от 0 до 100");
            return;
        }
        this.middleMark = middleMark;
    }

    @Override
    public String toString() {
        return "Студент: имя - " + name + ", возраст - " + age + ", средний балл = " + middleMark;
    }
}
