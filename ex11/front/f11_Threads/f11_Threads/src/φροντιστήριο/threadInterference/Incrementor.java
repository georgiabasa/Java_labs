package φροντιστήριο.threadInterference;

class Incrementor extends Thread {
	Counter counter;

	public Incrementor(Counter counter) {
		this.counter = counter;
		this.setName("Inc-Thread");
	}

	public void run() {
		while (counter.value() < 400) {
			counter.increment();
//			try {
//				sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}