package OOPS Concepts.Abstraction;

public class Main {
    
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020);
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
    
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street Bob", 2021);
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.stop();
    }
}
