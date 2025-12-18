package LessonEighteen.Inheritance.Animal;

public class Animal {
    private String name;
   private int age;
   public void makeSound(){
       System.out.println("Тут нет логики");
   }
     Animal (String name, int age){
       this.name = name;
       this.age = age;
     }
     public String getName (){
       return name;
     }
     public int getAge (){
       return age;
     }
}
