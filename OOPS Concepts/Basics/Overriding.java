// Overriding is a mechanism in Java where a subclass provides its own implementation of a method 
// that is already provided by its parent class. This allows us to use the same method name in different 
// classes, and the 
// correct version of the method will be called based on the object that is calling it.

public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }
}

