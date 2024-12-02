package φροντιστήριο.thread.interrupt;

public class HelloThread4 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		mt.interrupt();
	}
}

class MyThread extends Thread {

	public void run() {
		try {
			while (true) {
				System.out.println("Τρέχω στο δικό μου thread!");
				Thread.sleep(2000);
			}
		} catch (InterruptedException iex) {
			System.err.println("Με διέκοψαν");
		}
	}
}
