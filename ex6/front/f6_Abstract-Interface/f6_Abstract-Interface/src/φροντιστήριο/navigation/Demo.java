package φροντιστήριο.navigation;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    private static List<Integer> travelDistances = new ArrayList<>();
    private static final int MIN_DISTANCE = 1;
    private static final int MAX_DISTANCE = 15;

    // static initialization block: Αρχικοποιείται πριν τον δημιουργό
    static {
	travelDistances.add(12);
	travelDistances.add(1);
	travelDistances.add(5);
	travelDistances.add(2);
	travelDistances.add(4);
	travelDistances.add(15);
	travelDistances.add(17);
	travelDistances.add(7);
    }

    public static void main(String[] args) {
	Traveler traveler = new Traveler();

	for (Integer distance : travelDistances) {
	    if (distance >= MIN_DISTANCE && distance <= 3)
		traveler.travel(new WalkingStrategy());
	    else if (distance > 3 && distance <= 10)
		traveler.travel(new BicyclingStrategy());
	    else if (distance > 10 && distance <= MAX_DISTANCE)
		traveler.travel(new TakingTheBusStrategy());
	    else
		System.out.println("Δεν ξέρω πως να μετακινηθώ αν η απόσταση δεν είναι από " + MIN_DISTANCE + " ως και "
			+ MAX_DISTANCE + " χλμ.");
	}
    }
}
