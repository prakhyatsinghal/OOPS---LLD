Inheritance is a fundamental concept of object-oriented programming that allows a class to inherit properties and methods from another class. In Java, we use the extends keyword to indicate that one class is inheriting from another class.

In this example, we have a base class called Animal that has a name and an age, and a method called speak. We also have a subclass called Dog that extends the Animal class and adds a breed property and overrides the speak method.

By extending the Animal class, the Dog class inherits all of its properties and methods, including the name and age properties and the speak method. The Dog class can also add its own properties and methods, such as the breed property and the getBreed and setBreed methods.

Main Class - In this example, we create an Animal object and a Dog object. We then call the speak method on each object, which produces different output because of the speak method override in the Dog class. We also call the getName, getAge, and getBreed methods to retrieve the values of the name, age, and breed properties.