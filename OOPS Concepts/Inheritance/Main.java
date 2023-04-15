
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5);
        animal.speak();
        System.out.println(animal.getName() + " is " + animal.getAge() + " years old.");

        Dog dog = new Dog("Dog", 3, "Labrador");
        dog.speak();
        System.out.println(dog.getName() + " is a " + dog.getBreed() + " and is " + dog.getAge() + " years old.");
    }
}

