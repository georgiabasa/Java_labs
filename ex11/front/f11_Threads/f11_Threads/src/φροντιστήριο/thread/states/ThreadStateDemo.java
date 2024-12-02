package φροντιστήριο.thread.states;

public class ThreadStateDemo {
    // Θα χρησιμοποιήσουμε δύο νήματα για επίδειξη και θα
    // χρησιμοποιήσουμε στατικές αναφορές για ευκολία
    // Το thread1 θα ξεκινήσει το thread2 και θα κοιμηθεί για 5sec
    // Το thread2 θα κοιμηθεί για 5sec και θα συνεχίσει να εκτελείται
    // το thread1. Το thread1 με τη σειρά του θα κάνει join 
    // στο thread2, δηλ. το thread1 θα περιμένει μέχρι να τερματίσει
    // το thread2.
    public static Thread thread1;
    public static Thread thread2;

    public static ThreadStateDemo threadStateDemo;

    public static void main(String argvs[]) {
	threadStateDemo = new ThreadStateDemo();

	// κατασκευάζουμε ένα νέο νήμα χρησιμοποιώντας τον δημιουργό:
	// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.html#%3Cinit%3E(java.lang.Runnable)
	thread1 = new Thread(new DummyThread1(), "Νήμα ένα");
	// Το thread1 είναι στην κατάσταση NEW.
	System.out.println("MT: Μόλις δημιουργήθηκε το thread1:, κατάσταση: " + thread1.getState());

	// Ξεκινάμε το thread1
	thread1.start();
	// Η κατάσταση τώρα είναι RUNNABLE
	System.out.println("MT: Ξεκίνησε το thread1, κατάσταση: " + thread1.getState());
    }
}