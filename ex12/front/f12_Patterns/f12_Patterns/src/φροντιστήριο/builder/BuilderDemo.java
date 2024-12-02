package φροντιστήριο.builder;

import java.awt.Color;

//Σκοπός είναι να κατασκευάσουμε ένα διαστημόπλοιο βήμα-βήμα

//Ο δημιουργός ενός διαστημοπλοίου, περίπου όπως στην εργασία
class SpaceShip {
    private int speed;
    private int health;
    private int laserFireRate;
    private int laserFirePower;
    private Color laserColor;

    public SpaceShip(SpaceShipBuilder spaceShipBuilder) {
	this.speed = spaceShipBuilder.speed;
	this.health = spaceShipBuilder.health;
	this.laserFirePower = spaceShipBuilder.laserFirePower;
	this.laserFireRate = spaceShipBuilder.laserFireRate;
	this.laserColor = spaceShipBuilder.laserColor;
    }

    @Override
    public String toString() {
	return "SpaceShip [speed=" + speed + ", health=" + health + ", laserFireRate=" + laserFireRate
		+ ", laserFirePower=" + laserFirePower + ", laserColor=" + laserColor + "]";
    }
}

//Η SpaceShipBuilder ξεκινά από ένα default διαστημόπλοιο και μπορεί να το διαμορφώσει βήμα-βήμα.
//Έτσι δε χρειάζεται να έχουμε πολλές διαφορετικές υποκλάσεις που να καλύπτουν κάθε δυνατό συνδυασμό
class SpaceShipBuilder {
    int speed = 10;
    int health = 100;
    int laserFireRate = 10;
    int laserFirePower = 1;
    Color laserColor = Color.GREEN;

    //κάθε μία από τις μεθόδους επιστρέφει το στιγμιότυπο του διαστημοπλοίου
    public SpaceShipBuilder speed(int speed) {
	this.speed = speed;
	return this;
    };

    public SpaceShipBuilder health(int health) {
	this.health = health;
	return this;
    };

    public SpaceShipBuilder laserFireRate(int laserFireRate) {
	this.laserFireRate = laserFireRate;
	return this;
    };

    public SpaceShipBuilder laserFirePower(int laserFirePower) {
	this.laserFirePower = laserFirePower;
	return this;
    };

    public SpaceShipBuilder laserColor(Color laserColor) {
	this.laserColor = laserColor;
	return this;
    };

    public SpaceShip build() {
	return new SpaceShip(this);
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
	SpaceShipBuilder builder = new SpaceShipBuilder();
	
	SpaceShip ship1 = builder.build();
	SpaceShip ship2=builder.speed(12).build();
	SpaceShip ship3=builder.speed(20).health(200).laserFireRate(20).laserFirePower(2).laserColor(Color.RED).build();
	System.out.println(ship1.toString());
	System.out.println(ship2.toString());
	System.out.println(ship3.toString());
    }
}
