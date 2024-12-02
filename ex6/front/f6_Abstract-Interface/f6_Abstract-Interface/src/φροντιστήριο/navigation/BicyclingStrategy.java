package φροντιστήριο.navigation;

public class BicyclingStrategy implements MovementStrategy {
    @Override
    public void move() {
	System.out.println("Πάω με το ποδήλατο");
    }
}