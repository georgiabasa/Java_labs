package φροντιστήριο.threadInterference;

class Counter {

	private int c = 0;
	// Δοκιμάστε με και χωρίς το synchronized μπροστά από το public
	/* synchronized */ public void increment() {
		System.out.println(
		      Thread.currentThread().getName() + ": c is " + this.value() + ", increasing to : " + (this.value() + 2));
		c += 2;
	}

	// Δοκιμάστε με και χωρίς το synchronized μπροστά από το public
	/* synchronized */  public void decrement() {
		System.out.println(
		      Thread.currentThread().getName() + ": c is " + this.value() + ", decreasing to : " + (this.value() - 2));
		c -= 2;
	}

	public int value() {
		return c;
	}
}