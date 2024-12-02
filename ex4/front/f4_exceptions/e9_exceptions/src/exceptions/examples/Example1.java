package exceptions.examples;

public class Example1 {
    public static void main(String[] args) {
	// Θα προκύψει RunTimeException λόγω διαίρεσης με το 0
	// (https://docs.oracle.com/javase/8/docs/api/?java/lang/ArithmeticException.html)

	System.out.println("Ας κάνω μια διαίρεση...");

	int a = 0;
	int b = 3;
	try {
	    int c = b / a;

	    System.out.println("Αποτέλεσμα: " + c);
	} catch (Exception e) {
	    System.out.println("ok!");
	}
	// Null pointer exception
	String s = null;
	System.out.println(s.length());
    }
}