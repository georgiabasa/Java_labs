package inheritance.casting;

class Animal {
    void eat() {
	System.out.println("τρώω...");
    }
}

class Dog extends Animal {
    void bark() {
	System.out.println("γαυγίζω...");
    }
}

class BabyDog extends Dog {
    @Override
    void bark() {
	System.out.println("κλαψουρίζω...");
    }
    
    @Override
    void eat() {
	System.out.println("βυζαίνω...");
    }
}

class Cat extends Animal {
    void miaou() {
	System.out.println("νιαουρίζω...");
    }
}

class Animals {
    public static void main(String args[]) {
	BabyDog babyDog = new BabyDog();
	
	babyDog.bark(); //κλαψουρίζω
	babyDog.eat(); //βυζαίνω
	
	System.out.println(babyDog instanceof Animal); //true
	System.out.println(babyDog instanceof Dog); //true
	System.out.println(babyDog instanceof Object); //true
	
	// upcasting
	Animal babyDogUpcasted = new BabyDog(); // το upcasting γίνεται σιωπηρά
	Animal babyDogUpcasted2 = babyDog; // το upcasting γίνεται σιωπηρά
	Animal babyDogUpcasted3 = (Animal) babyDog; // είναι το ίδιο με την από πάνω γραμμή

	// Με το upcasting περιορίσαμε τις μεθόδους που μπορούμε να καλέσουμε
//	 babyDogUpcasted.bark(); //σφάλμα μεταγλώττισης
//	 babyDogUpcasted2.bark(); //σφάλμα μεταγλώττισης
//	 babyDogUpcasted3.bark(); //σφάλμα μεταγλώττισης
	System.out.print("ας φάει το babyDogUpcasted: ");
	babyDogUpcasted.eat(); //βυζαίνω
	// Το ίδιο το upcasted στιγμιότυπο όμως δεν άλλαξε, συνεχίζει να έχει τη
	// συμπεριφορά
	System.out.print("ας γαυγίσει το babyDogUpcasted: ");
	((BabyDog) babyDogUpcasted).bark(); //κλαψουρίζω
	
	// downcasting
//	BabyDog babyDogDowncasted = new Animal(); //σφάλμα μεταγλώττισης
//	BabyDog babyDogDowncasted2 = (BabyDog) new Animal(); //σφάλμα χρόνου εκτέλεσης: ClassCastException επειδή η babyDogDowncasted2 αναφέρεται σε BabyDog
	
	Animal babyDogDowncasted3 = new BabyDog();
//	BabyDog babyDogDowncasted4 = babyDogDowncasted3; // σφάλμα μεταγλώτισσης
	BabyDog babyDogDowncasted5 = (BabyDog) babyDogDowncasted3; // το downcasting επιτρέπεται
		
	System.out.println(babyDogDowncasted5 instanceof Animal);
	System.out.println(babyDogDowncasted5 instanceof Dog);
	System.out.println(babyDogDowncasted5 instanceof Object);
	
	babyDog.bark();
	babyDog.eat();

    }
}