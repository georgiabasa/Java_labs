package φροντιστήριο.thread.states;

public class DummyThread1 implements Runnable {

    public void run() {
	System.out.println("DT1: Εκτελείται το thread1...");
	ThreadStateDemo.thread2 = new Thread(new DummyThread2(), "Νήμα δύο");

	// Το thread2 είναι στην κατάσταση NEW.
	System.out.println("DT1: Μόλις δημιούργησα το thread2, έχει κατάσταση: " + ThreadStateDemo.thread2.getState());

	ThreadStateDemo.thread2.start();
	// Η κατάσταση τώρα είναι RUNNABLE
	System.out.println("DT1: Ξεκίνησα το thread2, έχει κατάσταση: " + ThreadStateDemo.thread2.getState());

	try {
	    // Ετούτο το νήμα (thread1) μπαίνει στην κατάσταση SLEEP
	    System.out.println("DT1: Το thread1 θα γίνει SLEEP 1sec...");
	    Thread.sleep(1000);
	} catch (InterruptedException ie) {
	    ie.printStackTrace();
	}
	System.out.println("DT1: Το thread1 βγήκε από το sleep και είναι σε " + ThreadStateDemo.thread1.getState()
		+ ", τώρα το thread2 έχει κατάσταση: " + ThreadStateDemo.thread2.getState());

	try {
	    // Το thread1 θα περιμένει να τελειώσει το thread2 για να συνεχίσει
	    System.out.println("DT1: κάνω join() στο thread2...");
	    ThreadStateDemo.thread2.join(); // μπορούμε να κάνουμε join(1000), τότε θα περιμένω είτε 1000ms είτε μέχρι
					    // να τελειώσει
	    System.out.println("DT1: Το thread2 έχει τελειώσει: " + ThreadStateDemo.thread2.getState());
	    System.out.println("DT1: το thread2 τελείωσε, συνεχίζω...");

	} catch (InterruptedException ie) {
	    ie.printStackTrace();
	}
	// Αφού κάναμε join() στο thread2, το thread2 έχει σταματήσει
    }
}