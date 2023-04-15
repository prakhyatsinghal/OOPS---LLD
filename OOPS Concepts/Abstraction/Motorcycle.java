

public class Motorcycle extends Vehicle implements Drivable {
    private int currentSpeed;

    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
        this.currentSpeed = 0;
    }

    public void start() {
        System.out.println("The motorcycle is starting.");
    }

    public void accelerate() {
        currentSpeed += 20;
        System.out.println("The motorcycle is accelerating to " + currentSpeed + " mph.");
    }

    public void brake() {
        currentSpeed -= 10;
        System.out.println("The motorcycle is braking to " + currentSpeed + " mph.");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
