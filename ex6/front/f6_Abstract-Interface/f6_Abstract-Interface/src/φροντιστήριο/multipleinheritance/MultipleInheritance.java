package φροντιστήριο.multipleinheritance;

class A {
    void aMethod() {
	System.out.println("A");
    }
}

class B extends A {
    @Override
    void aMethod() {
	System.out.println("B");
    }
}

class C extends A {
    @Override
    void aMethod() {
	System.out.println("C");
    }
}

//Δεν μπορώ να γράψω class D extends B, C {
//γιατί δεν υπάρχει τρόπος να ξέρω ποια aMethod() 
//θα εκτελεστεί
class D extends B { 
    
}

public class MultipleInheritance {
    public static void main(String[] args) {
	D d = new D();
	d.aMethod();
    }
}
