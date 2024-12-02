package φροντιστήριο.thread.sleep;

class DummyThread implements Runnable {
    public void run() {
	for (int i = 1; i < 5; i++) {
	    try {
		Thread.sleep(500);
	    } catch (InterruptedException e) {
		System.out.println(e);
	    }
	    System.out.println(i + ", " + Thread.currentThread().getName());
	}
    }
}

public class SleepDemo extends Thread {

    public static void main(String args[]) {
	Thread t1 = new Thread(new DummyThread(), "Νήμα t1");
	Thread t2 = new Thread(new DummyThread(), "Νήμα t2");

	t1.start();
	t2.start();
//	 t1.run(); // Μπορούμε, αλλά θα εκτελεστεί στο main thread
    }
}