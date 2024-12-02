package φροντιστήριο.adapter.before;

import java.awt.Color;


//Το παράδειγμα είναι σε δύο μέρη: χωρίς και με την εφαρμογή του Adapter 

//Εδώ έχουμε την απλή περίπτωση ενός διαστημοπλοίου που έχει ένα όπλο, το Laser
//Ο adapter μας επιτρέπει να χρησιμποιήσουμε και άλλα όπλα, με τον ίδιο τρόπο

class Lasergun {
    public Color lasercolor;

    public Lasergun(Color lasercolor) {
	this.lasercolor = lasercolor;
    }

    public void fire() {
	System.out.println("Laser fired");
    }
}

class SpaceShip {
    private Color laserColor = Color.GREEN;
    public Lasergun lasergun = new Lasergun(laserColor);

    @Override
    public String toString() {
	return "SpaceShip [laserColor=" + laserColor + ", laserGun=" + lasergun + "]";
    }
}

public class AdapterDemoBefore {

    public static void main(String[] args) {
	SpaceShip ship = new SpaceShip();
	ship.lasergun.fire();
    }
}
