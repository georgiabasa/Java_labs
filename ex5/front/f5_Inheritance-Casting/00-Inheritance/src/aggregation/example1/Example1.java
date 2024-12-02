package aggregation.example1;

class Operation {
    int square(int n) {
	return n * n;
    }
}

class Circle {
    Operation operation;// aggregation - συνάθροιση
    double pi = 3.14;

    double area(int radius) {
	operation = new Operation();
	int rsquare = operation.square(radius);// code reusability (i.e. delegates the method call).
	return pi * rsquare;
    }
}

public class Example1 {

    public static void main(String args[]) {
	Circle c = new Circle();
	double result = c.area(5);
	System.out.println(result);
    }
}