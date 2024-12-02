package φροντιστήριο.abstract1;

abstract class A {
    private int x;

    A(int z) {
	x = z;
	System.out.println("A constructor: " + x);
    }
}

class B extends A {
    public B() {
	super(1000);
	System.out.println("B constructor");
    }
}

public class TestAbstractConstructor {

    public static void main(String[] args) {
	B accobj = new B();
	A x = new B();
    }

}
