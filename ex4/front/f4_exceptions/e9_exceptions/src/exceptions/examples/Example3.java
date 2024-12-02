package exceptions.examples;

public class Example3 {
    
    private void myOtherFunction() {
	int a = 0; // θα προκληθεί εξαίρεση για τη διαίρεση με το 0
	int b = 3;
	int c = 0;
	int lista[] = new int[5]; // δημιουργείται πίνακας 5 ακαιρέων, 
	//παρακάτω θα προκληθεί εξαίρεση γιατί θα γίνει ανάθεση στο lista[5] 
	String s = null; // θα προκληθεί εξαίρεση γιατί τυπώνω το s.length()

	// Πόσες εξαιρέσεις θα προκαλέσει ο κώδικας κατά τη διάρκεια της εκτέλεσής του
	// (runtime);
	try {
	    c = b / a;
	    lista[5] = c;
	    System.out.println(c);
	    System.out.println(s.length());
	    System.out.println("Δε συνέβει καμία εξαίρεση μέσα στο try block");
	} catch (ArithmeticException e) {
	    System.out.println(e.toString());
	    System.out.println(e.getMessage());
	    System.out.println("Εξαίρεση ArithmeticException! printStackTrace(): ");
	    e.printStackTrace();
	} catch (IndexOutOfBoundsException e) {
	    System.out.println("Εξαίρεση IndexOutOfBoundsException! Η περιγραφή της είναι: " + e.toString());
	} finally {
	    System.out.println("Το finally μπλοκ θα εκτελεστεί ό,τι και να γίνει.");
	}	
    }

    private void myFunction() {
	myOtherFunction();
    }
    public static void main(String[] args) {
	Example3 example3 = new Example3();
	example3.myFunction();
    }
}