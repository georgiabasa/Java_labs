package inheritance.casting;

import java.util.ArrayList;
import java.util.List;

public class AnimalDoctor {

    public void examine(List<Animal> animals) {
	System.out.println("Ο κτηνίατρος εξετάζει τα ζώα:");
	animals.forEach(animal -> {
	    System.out.println(animal.getClass().toString());
	    // έλεγχος αν τρώνε
	    animal.eat();
	    // έλεγχος αν γαυγίζουν
	    if (animal instanceof Dog)
		// downcasting
		((Dog) animal).bark();
	});
    }

    public static void main(String[] args) {

	List<Animal> animals = new ArrayList<>();
	animals.add(new Cat());
	animals.add(new Dog());
	animals.add(new BabyDog());
	new AnimalDoctor().examine(animals);
    }
}
