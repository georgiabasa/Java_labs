package exceptions.examples;

public class Example2 {
    public static void main(String[] args) {
	int a = 0; // Δοκιμάστε με a=1
	int b = 3;

	int c = 0;
	String d = null;

	try {
	    System.out.println("...1");
	    System.out.println(d.length());
	    c = b / a;
	    System.out.println("...2");
	} catch (NullPointerException e) {
	    System.out.println("Όπα! Σφάλμα null pointer με μήνυμα: " + e.getMessage());
	} catch (ArithmeticException e) {
	    System.out.println("Όπα! Αριθμητικό σφάλμα με μήνυμα: " + e.getMessage());
	} catch (Exception e) {
	    System.out.println("Όπα! Κ");
	} finally {
	    System.out.println(c);
	}
    }

}