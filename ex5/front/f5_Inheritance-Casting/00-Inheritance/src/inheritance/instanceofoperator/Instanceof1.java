package inheritance.instanceofoperator;

class Shape {
}

class Round extends Shape {
}

class Square extends Shape {
}

class Ellipsis extends Round {
}

class Circle extends Ellipsis {
}

public class Instanceof1 {

    public static void main(String[] args) {
	Round round1 = new Round();

	// Μεταγλωττίζεται, αλλά επιστρέφει false
	System.out.println(round1 instanceof Ellipsis);

	// Δεν μεταγλωττίζεται, γιατί δεν υπάρχει καμία περίπτωση να ισχύει αυτό.
	// System.out.println(round1 instanceof Square);

	// Upcasting
	Shape circle2 = new Circle();

	System.out.println("Shape circle = new Circle();");
	System.out.println("circle instanceof Shape: " + (circle2 instanceof Shape));
	System.out.println("circle instanceof Ellipsis: " + (circle2 instanceof Ellipsis));
	System.out.println("circle instanceof Circle: " + (circle2 instanceof Circle));

	// Downcasting
	Circle circle3 = (Circle) new Shape(); // σφάλμα χρόνου εκτέλεσης

	System.out.println("Shape circle = new Circle();");
	System.out.println("circle instanceof Shape: " + (circle2 instanceof Shape));
	System.out.println("circle instanceof Ellipsis: " + (circle2 instanceof Ellipsis));
	System.out.println("circle instanceof Circle: " + (circle2 instanceof Circle));

    }
}