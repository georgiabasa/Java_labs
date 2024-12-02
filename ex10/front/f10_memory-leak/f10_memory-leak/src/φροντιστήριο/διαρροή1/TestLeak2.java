package φροντιστήριο.διαρροή1;

import java.util.ArrayList;
import java.util.Random;

//Χρησιμοποιήστε το TestLeak1 και το TestLeak2 για να πειραματιστείτε
//με τα εργαλεία Java Visual VM και Eclipse MAT.
//Για το Visual VM τρέξτε το TestLeak1 ή το 2 και κάντε παύση σε κάποιο
//σημείο στην αρχή πριν την κλήση της fillArrayWithRandomDoubles();
//Ανοίξτε το Visual VM και συνδθείτε στη διεργασία. Από την εφαμογή, επιλέξτε
//"monitor" και δείτε πως δεσμεύεται δυναμικά η μνήμη κατά τη διάρκεια της
//εκτέλεσης

public class TestLeak2 {
    private Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
	TestLeak2 leak2 = new TestLeak2();
	leak2.fillArrayWithRandomDoubles();
    }

    public void fillArrayWithRandomDoubles() throws InterruptedException {
	doTheActualWork();
	// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html#gc()
	System.gc();
	// χρειάζεται λίγο χρόνο για να δουλέψει ο gc
	Thread.sleep(10000); 
    }

    private void doTheActualWork() {
	// η λίστα είναι τοπική μεταβλητή
	// σε αυτή την εκδοχή, οι αναφορά προς τη listOfDoubles βρίσκεται στο stack frame
	// που δημιουργήθηκε όταν κλήθηκε η doTheActualWork(). Συνεπώς, μόλις τελειώσει
	// η εκτέλεση της μεθόδου, χάνεται η αναφορά και ο GC μπορεί να ελευθερώσει χώρο.
	ArrayList<Double> listOfDoubles = new ArrayList<>();
	for (int i = 0; i < 10000000; i++) {
	    listOfDoubles.add(random.nextDouble());
	}
    }
}
