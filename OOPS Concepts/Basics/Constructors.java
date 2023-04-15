package OOPS Concepts.Basics;

// In Java, there are three types of constructors:

// Default constructor
// Parameterized constructor
// Copy constructor

public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "John Doe";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Default constructor
        Person person1 = new Person();
        System.out.println(person1.getName()); // Output: John Doe
        System.out.println(person1.getAge()); // Output: 0

        // Parameterized constructor
        Person person2 = new Person("Alice", 25);
        System.out.println(person2.getName()); // Output: Alice
        System.out.println(person2.getAge()); // Output: 25

        // Copy constructor
        Person person3 = new Person(person2);
        System.out.println(person3.getName()); // Output: Alice
        System.out.println(person3.getAge()); // Output: 25
    }
}

// In this example, we have a Person class with three constructors. The first constructor is a d
// efault constructor that sets the name to "John Doe" and the age to 0. The second constructor is 
// a parameterized constructor that takes a name and an age parameter and sets the corresponding 
// instance variables. The third constructor is a copy constructor that takes a Person object and 
// creates a new Person object with the same name and age values.

// In the Main class, we create three Person objects using each of the three constructors. We then 
// call the getName and getAge methods on each object to verify that the constructors worked as expected.

// Output:

John Doe
0
Alice
25
Alice
25
// As you can see, each constructor created a Person object with the correct name and age values. 
// This demonstrates the three types of constructors in Java.