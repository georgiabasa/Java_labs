package frontistio.inheritance;

class A {
    public A(String a) {
	System.out.println("A init...");
    }
}

class B extends A {
    public B() {
	super("a");
	System.out.println("B init...");
    }
}

public class C {
    public static void main(String[] args) {
	B b = new B();
    }
}
