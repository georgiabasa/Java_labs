package φροντιστήριο.navigation;

public class Traveler {
    
    public void travel(MovementStrategy movementStrategy) {
	System.out.print("Μετακινούμαι: ");
	movementStrategy.move();
    }

}
