/* 
Implements and Extends - both the keywords alogn with the concept of inheritance. 
Implements keyword is associated with abstracton and used to define a contract.  It means we are
using the elements of a Java interface in your class.
Extends is used to extends a class's existing functionality. It means that we are creating a 
subclass of the base class we are extending.

** We can only extend one class in our child class but we can implement as many interfaces as we 
would like. ANd we need to declare extends before implements.
*/
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
