

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    public void makeSound(int numTimes) {
        for (int i = 0; i < numTimes; i++) {
            System.out.println("The dog barks.");
        }
    }
}


