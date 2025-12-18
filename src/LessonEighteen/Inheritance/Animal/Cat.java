package LessonEighteen.Inheritance.Animal;

public class Cat extends Animal {
  public Cat(String name, int age) {
   super(name, age);
  }
  public void makeSound(){
   System.out.println("Кот " + getName() + " мяукает");
  }
 public String catchMouth (){
   return getName() + " должен был ловить мышей уже " + getAge() + " лет, но он просто спит";
  }
 }
