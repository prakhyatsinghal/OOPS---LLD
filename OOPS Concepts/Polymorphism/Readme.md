Polymorphism is the ability of an object to take on many forms. In Java, polymorphism is implemented through method overloading and method overriding.

Method overloading is when two or more methods in the same class have the same name but different parameters. This allows us to call the same method with different arguments, and the correct version of the method will be called based on the arguments passed in.

Method overriding is when a subclass provides its own implementation of a method that is already provided by its parent class. This allows us to use the same method name in different classes, and the correct version of the method will be called based on the object that is calling it.



In this example, we have an Animal class with a makeSound method that prints out a generic sound. We also have a Dog class that extends the Animal class and overrides the makeSound method to print out a bark instead. The Dog class also has a method called makeSound that takes an integer parameter, and this method prints out a bark a certain number of times based on the parameter.

In the Main class, we create an instance of the Animal class and call its makeSound method. Then, we create an instance of the Dog class and call its makeSound method, which overrides the makeSound method in the Animal class. Finally, we call the makeSound method with an integer parameter on the Dog class, which demonstrates method overloading.