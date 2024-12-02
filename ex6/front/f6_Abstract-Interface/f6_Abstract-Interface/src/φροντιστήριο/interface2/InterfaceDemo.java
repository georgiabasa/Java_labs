package φροντιστήριο.interface2;

interface Interface1 {
    int a = 1; // είναι public static final

    void anotherMethod();

    default void aMethod() {
	System.out.println("Interface1");
    }

    static String aStaticMethod() {
	return "Στατικό γεια!";
    }
}

interface Interface2 {
    default void aMethod() {
	System.out.println("Interface2");
    }

    static String getStaticHello() {
	return "Στατικό γεια!";
    }
}

class A implements Interface1 {
    public A(String a) {
	System.out.println("A init...");
    }

    @Override
    public void anotherMethod() {
    }
}

//Πρέπει να γίνει override κάποια από τις δύο μεθόδους:
//είτε η Interface1.aMethod(), είτε η Interface2.aMethod()
class B implements Interface1, Interface2 {
    public B() {
	System.out.println("B init...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
	A a = new A("t");
	a.aMethod();

	System.out.println(A.a);
	Interface1.aStaticMethod();
    }
}
