package φροντιστήριο.διαρροή1;

import java.util.ArrayList;
import java.util.Random;

// Χρησιμοποιήστε το TestLeak1 και το TestLeak2 για να πειραματιστείτε
// με τα εργαλεία Java Visual VM και Eclipse MAT.
// Για το Visual VM τρέξτε το TestLeak1 ή το 2 και κάντε παύση σε κάποιο
// σημείο στην αρχή πριν την κλήση της fillArrayWithRandomDoubles();
// Ανοίξτε το Visual VM και συνδθείτε στη διεργασία. Από την εφαμογή, επιλέξτε
// "monitor" και δείτε πως δεσμεύεται δυναμικά η μνήμη κατά τη διάρκεια της
// εκτέλεσης

public class TestLeak1 {
    private Random random = new Random();
    //η λίστα είναι στατικό πεδίο
    public static final ArrayList<Double> listOfDoubles = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
	// βάλτε ένα breakpoint στην επόμενη γραμμή και πάρτε ένα heap dump
	TestLeak1 leak1 = new TestLeak1();
	leak1.fillArrayWithRandomDoubles();

	// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/System.html#gc()
	System.gc();
	// πάρτε άλλο ένα heap dump εδώ και συγκρίνετέ τα με το MAT
	// θα δείτε πως ο GC δεν μπορεί να ελευθερώσει το χώρο που πιάνουν τα doubles
	// γιατί υπάρχει ακόμη η αναφορά προς τη listOfDoubles
	// χρειάζεται λίγο χρόνο για να δουλέψει ο gc
	Thread.sleep(10000);
    }

    public void fillArrayWithRandomDoubles() throws InterruptedException {
	for (int i = 0; i < 10000000; i++) {
	    listOfDoubles.add(random.nextDouble());
	}
    }
}
