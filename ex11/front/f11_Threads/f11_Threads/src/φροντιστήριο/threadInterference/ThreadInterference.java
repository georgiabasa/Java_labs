package φροντιστήριο.threadInterference;

public class ThreadInterference {

	public static void main(String[] args) {
		Counter c = new Counter();
//		c.increment();
		Incrementor incrementor = new Incrementor(c);
		Decrementor decrementor = new Decrementor(c);
//		incrementor.setPriority(Thread.MIN_PRIORITY);
//		decrementor.setPriority(Thread.MAX_PRIORITY);
		incrementor.start();
		decrementor.start();
	}
}