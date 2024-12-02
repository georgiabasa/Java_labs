package φροντιστήριο.thread.sync2;
//Το ίδιο με το φροντιστήριο.thread.sync.Synchronization,
//απλά το synchonized ορίζει ένα μπλοκ, όχι τη μέθοδο
class Counter {
    void count(int n) {
	synchronized (this) {	    
	    for (int i = 1; i <= 3; i++) {
		System.out.println(n * i);
		try {
		    Thread.sleep(1000);
		} catch (Exception e) {
		    System.out.println(e);
		}
	    }
	}
    }
}

class MyThread1 implements Runnable {
    Counter counter;

    MyThread1(Counter counter) {
	this.counter = counter;
    }

    public void run() {
	counter.count(1);
    }

}

class MyThread2 implements Runnable {
    Counter counter;

    MyThread2(Counter counter) {
	this.counter = counter;
    }

    public void run() {
	counter.count(10);
    }
}

class Synchronization {
    public static void main(String args[]) {
	Counter counter = new Counter();
	Thread t1 = new Thread(new MyThread1(counter));
	Thread t2 = new Thread(new MyThread2(counter));
	t1.start();
	t2.start();
    }
}