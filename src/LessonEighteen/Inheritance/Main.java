package LessonEighteen.Inheritance;

import LessonEighteen.Inheritance.Animal.Animal;
import LessonEighteen.Inheritance.Animal.Bird;
import LessonEighteen.Inheritance.Animal.Cat;
import LessonEighteen.Inheritance.Animal.Dog;
import LessonEighteen.Inheritance.Course.Course;
import LessonEighteen.Inheritance.Course.HybridCourse;
import LessonEighteen.Inheritance.Course.OfflineCourse;
import LessonEighteen.Inheritance.Course.OnlineCourse;
import LessonEighteen.Inheritance.Employee.Developer;
import LessonEighteen.Inheritance.Employee.Intern;
import LessonEighteen.Inheritance.Employee.Manager;
import LessonEighteen.Inheritance.Shape.Circle;
import LessonEighteen.Inheritance.Shape.Square;
import LessonEighteen.Inheritance.Shape.Triangle;
import LessonEighteen.Inheritance.Vehicle.Bicycle;
import LessonEighteen.Inheritance.Vehicle.Car;
import LessonEighteen.Inheritance.Vehicle.Motorcycle;


public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 6: Иерархия животных");
        Bird bird = new Bird("Бердо", 12);
        Cat cat = new Cat("Барсик", 5);
        Dog dog = new Dog("Дружок", 7);
        Animal[] animals = {bird,cat,dog};
        for (Animal animal : animals){
            animal.makeSound();
        }
        System.out.println(bird.fly());
        System.out.println(cat.catchMouth());
        System.out.println(dog.post());
        System.out.println("\nЗадание 7: Транспорт");
        Motorcycle motorcycle = new Motorcycle("Ямаха", 2020, 250);
        motorcycle.setType("спортивный");
        motorcycle.move();
        motorcycle.motoInfo();
        Bicycle bicycle = new Bicycle("Аист", 2015, 50);
        bicycle.setTransmission(5);
        bicycle.move();
        bicycle.putTransmission();
        Car car = new Car("Лада", 2022, 280);
        car.move();
        car.setDors(5);
        car.openDors();
        System.out.println("\nЗадание 8: Работники");
        Manager manager = new Manager("Матвей", 1000);
        manager.setBonus(500);
        manager.calculateSalary();
        Developer developer = new Developer("Марина", 1000);
        developer.setProjects(2);
        developer.calculateSalary();
        Intern intern = new Intern("Савелий", 10);
        intern.setHours(12);
        intern.calculateSalary();
        System.out.println("\nЗадание 9: Геометрические фигуры");
        Circle circle = new Circle();
        circle.setRadius(12);
        System.out.println("Площадь круга = "+circle.calculatePerimeter() + ", периметр круга = " + circle.calculateArea());
        Square square = new Square();
        square.setLength(15);
        System.out.println("Площадь квадрата = "+square.calculatePerimeter() + ", периметр квадрата = " + square.calculateArea());
        Triangle triangle = new Triangle();
        triangle.setA(10);
        triangle.setB(12);
        triangle.setC(8);
        System.out.println("Площадь треугольника = "+triangle.calculatePerimeter() + ", периметр треугольника = " + triangle.calculateArea());
        System.out.println("\nЗадание 10: Учебные курсы");
        Course onlineCourse = new OnlineCourse("Java Programming", 120, "Coursera");
        Course offlineCourse = new OfflineCourse("Data Science", 180, "ул. Ленина, 25, Москва");
        Course hybridCourse = new HybridCourse("Web Development", 150, "Udemy", "пр. Мира, 10, Санкт-Петербург");
        Course[] courses = {onlineCourse, offlineCourse, hybridCourse};
        for (Course course : courses) {
            System.out.println(course.getCourseInfo());
        }
        //ВОПРОС! Почему, если ПАБЛИК виден во всем проекте, но находится в другой папке, он все равно делает ИМПОРТ? Он же виден во всем проекте, зачем ему
        //делать импорт?
    }
}
