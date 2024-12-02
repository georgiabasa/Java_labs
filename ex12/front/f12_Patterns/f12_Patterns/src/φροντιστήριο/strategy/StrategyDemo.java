package φροντιστήριο.strategy;

import java.awt.Point;
import java.util.Random;

//Προσδιορίζουμε το interface που θα πρέπει να υλοποιεί κάποιος
//αλγόριθμος αποφυγής του αντιπάλου
interface EnemyAvoidanceStrategy {
    public Point getNextXYPosition();
}

//Υλοποιούμε μερικές συγκεκιμένες στρατηγικές (αλγορίθμους) που
//βγάζουν αποτέλεσμα με διαφορετική μέθοδο
class RandomAvoidanceStrategy implements EnemyAvoidanceStrategy {
    @Override
    public Point getNextXYPosition() {
	System.out.println("Jumping to a random point");
	Random random = new Random();
	return new Point(random.nextInt(), random.nextInt());
    }
}

class DefaultAvoidanceStrategy implements EnemyAvoidanceStrategy {
    @Override
    public Point getNextXYPosition() {
	System.out.println("Jumping to a default point");
	return new Point(0, 0);
    }
}

class IntelligentAvoidanceStrategy implements EnemyAvoidanceStrategy {

    @Override
    public Point getNextXYPosition() {
	System.out.println("Using AI to get to next point");
	// TODO: implement intelligent algorithm
	return new Point(1, 1);
    }
}

class AggressiveAvoidanceStrategy implements EnemyAvoidanceStrategy {

    @Override
    public Point getNextXYPosition() {
	System.out.println("Choosing next point in order to maximize damage to enemy");
	// TODO: implement aggressive algorithm
	return new Point(100, 100);
    }
}

class SpaceShip {
    // Καθε διαστημόπλοιο μπορεί να χρησιμοποιήσει μια γκάμα από στρατηγικές
    // αποφυγής του εχθορύ
    private EnemyAvoidanceStrategy avoidanceStrategy = new DefaultAvoidanceStrategy();

    public EnemyAvoidanceStrategy getAvoidanceStrategy() {
	return avoidanceStrategy;
    }

    public void setAvoidanceStrategy(EnemyAvoidanceStrategy avoidanceStrategy) {
	this.avoidanceStrategy = avoidanceStrategy;
    }

    public Point move() {
	Point nextPoint = avoidanceStrategy.getNextXYPosition();
	System.out.println("Moving to " + nextPoint);
	return nextPoint;
    }

    @Override
    public String toString() {
	return "SpaceShip [avoidanceStrategy=" + avoidanceStrategy + "]";
    }
}

public class StrategyDemo {
    public static void main(String[] args) {
	SpaceShip ship = new SpaceShip();
	System.out.println(ship.toString());
	ship.move();
	System.out.println();

	ship.setAvoidanceStrategy(new IntelligentAvoidanceStrategy());
	System.out.println(ship.toString());
	ship.move();
	System.out.println();

	ship.setAvoidanceStrategy(new AggressiveAvoidanceStrategy());
	System.out.println(ship.toString());
	ship.move();
	System.out.println();

	ship.setAvoidanceStrategy(new RandomAvoidanceStrategy());
	System.out.println(ship.toString());
	ship.move();
	System.out.println();
    }
}
