package φροντιστήριο.thread.states;

public class DummyThread2 implements Runnable {

    public void run() {
	System.out.println("DT2: Εκτελείται το thread2...");

	try {
	    System.out.println("DT2: Το thread1 είναι σε κατάσταση: " + ThreadStateDemo.thread1.getState());
	    System.out.println("DT2: Το thread2 είναι σε κατάσταση: " + ThreadStateDemo.thread2.getState());
	    System.out.println("DT2: Το thread2 θα γίνει SLEEP...");
	    // το νήμα αυτό (thread2) μπαίνει σε κατάσταση TIMED_WAITING
	    Thread.sleep(5000);
	} catch (InterruptedException ie) {
	    ie.printStackTrace();
	}

	// thread1 έχει καλέσει τη join() στο thread2
	System.out.println("DT2: Το thread1 είναι σε κατάσταση: " + ThreadStateDemo.thread1.getState());
	System.out.println("DT2: Το thread2 είναι σε κατάσταση: " + ThreadStateDemo.thread2.getState());
    }
}
