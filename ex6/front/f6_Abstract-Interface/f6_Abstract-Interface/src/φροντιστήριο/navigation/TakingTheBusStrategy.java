package φροντιστήριο.navigation;

public class TakingTheBusStrategy implements MovementStrategy {
    @Override
    public void move() {
	System.out.println("Παίρνω το λεωφορείο");
    }
}