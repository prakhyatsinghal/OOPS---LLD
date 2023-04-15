

public class Car extends Vehicle implements Drivable {
    private int currentSpeed;

    public Car(String make, String model, int year) {
        super(make, model, year);
        this.currentSpeed = 0;
    }

    public void start() {
        System.out.println("The car is starting.");
    }

    public void accelerate() {
        currentSpeed += 10;
        System.out.println("The car is accelerating to " + currentSpeed + " mph.");
    }

    public void brake() {
        currentSpeed -= 5;
        System.out.println("The car is braking to " + currentSpeed + " mph.");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}