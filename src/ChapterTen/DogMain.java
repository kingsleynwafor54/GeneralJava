package ChapterTen;

public class DogMain {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog =new Dog();
        try {
            System.out.println(dog.moveAnimal());
            System.out.println( animal.moveAnimal());
        }
        catch (Exception e){
            System.out.println("You don't enter a dog "+e);
        }
    }
}