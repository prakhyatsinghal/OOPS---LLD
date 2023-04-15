// Overloading is a mechanism in Java where two or more methods in the same class have the same 
// name but different parameters. This allows us to call the same method with different arguments,
//  and the correct version of the method will be called based on the arguments passed in.

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.5, 2.5));
        System.out.println(calculator.add(1, 2, 3));
    }
}
