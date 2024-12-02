package φροντιστήριο.thread.runvsstart;

public class HelloThread5 extends Thread {

	public void run() {
		System.out.println("running...");
		for (int i = 1; i <= 30000; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Διακοπή: " + e.toString());
			}
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}

	public static void main(String args[]) {
		HelloThread5 t1 = new HelloThread5();
		HelloThread5 t2 = new HelloThread5();
		HelloThread5 t3 = new HelloThread5();
		t1.run();// τρέχει, αλλά δεν ξεκινάει νέο thread. Τρέχει στο υπάρχον thread (main
		           // thread). Θα πρέπει να καλ
		t2.run();
		t3.run();
	}
}