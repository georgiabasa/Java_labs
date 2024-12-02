package φροντιστήριο.thread.creation;
//public class HelloThread extends Thread {

//
//	public void run() {
//		System.out.println("Hello from a thread!");
//		while (true) {
//		}
//	}
//
//	public static void main(String args[]) {
//		(new HelloThread()).start(); // τι θα γίνει αν καλέσουμε τη run() αντί για τη start();
//	}
//}
public class HelloThread implements Runnable {

	public void run() {
		System.out.println("Hello from a thread!");
		while (true) {
		}
	}

	public static void main(String args[]) {
		HelloThread helloThread = new HelloThread();
		Thread myThread = new Thread(helloThread);
		myThread.start();
		// ή
		// (new Thread(new HelloThread())).start(); // τι θα γίνει αν καλέσουμε τη run()
		// αντί για τη start();
	}
}
