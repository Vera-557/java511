package LessonEighteen.Inheritance.Animal;

public class Dog extends Animal {
 public Dog (String name, int age){
   super(name,age);
  }
  public void makeSound(){
   System.out.println("Собака " + getName() + " гавкает");
  }
  public String post () {
   return getName() + " охраняет двор уже " + getAge() + " лет";
  }
}
