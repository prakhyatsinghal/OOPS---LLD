package OOPS Concepts.Basics;

// Static methods and variables in Java belong to the class itself rather than to
//  instances of the class. This means that you can access them without creating an 
//  object of the class, and they are shared by all instances of the class.

// Here's an example that demonstrates static methods and variables:

public class Person {
    private static int count = 0;
    private String name;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Charlie");

        System.out.println(Person.getCount()); 
        
        // Output: 3
    }
}

//In this example, we have a Person class with a private static variable called count that 
// keeps track of the number of Person objects that have been created. We also have a constructor 
// that takes a name parameter and increments the count variable by 1.

// We also have a static method called getCount that returns the current value of the count variable.

// In the Main class, we create three Person objects with different names. We then call the 
// getCount method on the Person class itself, without creating an object of the class. This 
// returns the current value of the count variable, which is the number of Person objects that have 
// been created.

// Output:
// 3

// As you can see, we were able to access the static count variable and the getCount method 
// without creating an object of the Person class. This is because 
// static variables and methods belong to the class itself rather than to instances of the class.