package exceptions.examples;

import java.io.IOException;

public class StackTrace2 {
    public static void main(String[] args) throws IOException {
	try {
	    a();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	    // Εκτυπώνονται οι γραμμές που χειρίστηκαν την εξαίρεση. Η εξαίρεση προέκυψε στη
	    // γραμμή 24, που την είχε καλέσει η γραμμή 20 (που δεν την χειρίστηκε), που την
	    // κάλεσε η γραμμή 8
	    // Αντικατάσταση του stacktrace με καινούριο:
	    // throw (IOException) ioe.fillInStackTrace();
	}
    }

    static void a() throws IOException {
	b();
    }

    static void b() throws IOException {
	throw new IOException();
    }
}
