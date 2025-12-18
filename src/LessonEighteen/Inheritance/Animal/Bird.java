package LessonEighteen.Inheritance.Animal;

public class Bird extends Animal {

    public Bird(String name, int age) {
         super(name, age);
     }

     public void makeSound(){
         System.out.println("Птица " + getName() + " поёт");
     }

    public String fly(){
         return getName() + " летает уже " + getAge() + " лет";
     }
}
