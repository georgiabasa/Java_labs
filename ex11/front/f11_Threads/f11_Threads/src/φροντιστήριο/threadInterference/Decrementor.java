package φροντιστήριο.threadInterference;

class Decrementor extends Thread {
	final Counter counter;

	public Decrementor(Counter counter) {
		this.counter = counter;
		this.setName("Dec-Thread");
	}

	public void run() {
		while (counter.value() > -400) {
			counter.decrement();
//			try {
//				sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}