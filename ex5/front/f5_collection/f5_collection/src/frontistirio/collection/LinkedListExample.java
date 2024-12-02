package frontistirio.collection;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
	LinkedList<String> linkedList = new LinkedList<>();

	//η add() είναι υπερφορτωμένη
	linkedList.add("Python");
	linkedList.add("C");
	
	System.out.println("---------1----------- toString():");
	//Η μέθοδος toString() επιστρέφει το αντικείμενο σε μορφή αλφαριθμητικού (για να διαβάζεταια από τον άνθρωπο)
	System.out.println(linkedList.toString());
	//Η println() θα καλέσει την toString() από μόνη της
	System.out.println(linkedList);
	
	System.out.println();
	System.out.println("---------2----------- add(1, \"C--\"):");

	//Εισαγωγή στη θέση 1
	//Αν υπάρχει αντικείμενο εκεί, μετατοπίζει αυτό και τα επόμενα προς τα δεξιά
	linkedList.add(1, "C--");
	System.out.println(linkedList.toString());

	System.out.println();
	System.out.println("---------3----------- set(1, \"C++\"):");
	
	//Ενημέρωση
	linkedList.set(1, "C++");
	System.out.println(linkedList.toString());
	
	
	System.out.println();
	System.out.println("---------4----------- remove(1): ");
	
	//Διαγραφή
	linkedList.remove(1);
	System.out.println(linkedList.toString());

	
	System.out.println();
	System.out.println("---------5----------- add(\"Java\"):");
	
	linkedList.add("Java");
	System.out.println(linkedList.toString());

	System.out.println();
	System.out.println("---------6----------- απαρίθμηση");
	
	System.out.println("Απαρίθμηση με τη μέθοδο get() και for:");
	for (int i = 0; i < linkedList.size(); i++) {

	    System.out.print(linkedList.get(i) + " ");
	}

	System.out.println();
	System.out.println("Απαρίθμηση με foreach:");
	for (String str : linkedList)
	    System.out.print(str + " ");
	
	System.out.println();
	System.out.println("---------7----------- poll():");
	System.out.println(linkedList.poll());
	System.out.println(linkedList);

	
	System.out.println();
	System.out.println("---------8----------- pop():");
	System.out.println(linkedList.pop());
	System.out.println(linkedList);

	System.out.println("Διαφορά μεταξύ poll() και pop():");
	System.out.println("https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/LinkedList.html#method-summary");
    }
}