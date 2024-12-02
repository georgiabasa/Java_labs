package φροντιστήριο.thread.join;

public class SimpleJoinExample extends Thread {

	public void run() {
		//Περιμένει 1 δευτερόλεπτο και εκτυπώνει τον επόμενο αριθμό
		//από 1 ως 5
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Είμαι το νήμα " + Thread.currentThread().getName() + ": " + i);
		}
	}

	public static void main(String args[]) {
		SimpleJoinExample t1 = new SimpleJoinExample();
		t1.setName("t1");
		SimpleJoinExample t2 = new SimpleJoinExample();
		t2.setName("t2");
		SimpleJoinExample t3 = new SimpleJoinExample();
		t3.setName("t3");
		t1.start();
		try {
			t1.join(); //Το thread που εκτελεί τη γραμμή (εδώ το main thread) γίνεται
			// waiting και περιμένει να τελειώσει το t1:
			//System.out.println("περιμένω το t1...");
			//t1.join(5000); // Το main thread περιμένει το πολύ 5000 ms
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}