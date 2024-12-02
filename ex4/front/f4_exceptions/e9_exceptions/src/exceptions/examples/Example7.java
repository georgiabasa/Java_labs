package exceptions.examples;

public class Example7 {

    void third() throws MyException {
	int result = 1 / 0;
    }

    void second() {
	third();
    }

    void first() {
	    second();
	    System.out.println("Συνέβει σφάλμα");
    }

    public static void main(String args[]) {
	Example7 example7 = new Example7();
	example7.first();
	System.out.println("όλα εκτελέστηκαν σωστά");
    }
}


class MyException extends RuntimeException {

}