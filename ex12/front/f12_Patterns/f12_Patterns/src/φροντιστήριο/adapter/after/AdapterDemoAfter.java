package φροντιστήριο.adapter.after;

import java.awt.Color;

//Τα χρόνια πέρασαν και έχουμε κανούριο διαστημόπλοιο με νέες δυνατότητες
//Κάθε όπλο του διαστημοπλοίου μας θα πρέπει να υλοποιεί το Weapon interface
interface Weapon {
    void useWeapon();
}

//Το Lasergun όμως είναι παλιό και δεν υλοποιεί το Weapon interface
//πυροβολάει με fire(), όχι με useWeapon()
class Lasergun {
    public Color lasercolor;

    public Lasergun(Color lasercolor) {
	this.lasercolor = lasercolor;
    }

    public void fire() {
	System.out.println("Laser fired");
    }
}

//Το ίδιο και η βόμβα φωτονίων, δουλεύει με dropBomp()
class PhotonBomb {
    public void dropBomb() {
	System.out.println("Photon bomb dropped");
    }
}

//Για να χρησιμοποιήσουμε τα παλιά όπλα στο κανούριο διαστημόπλοιο
//φτιάχνουμε adapters
class LasergunAdapter implements Weapon {
    Lasergun lasergun;

    public LasergunAdapter(Lasergun lasergun) {
	this.lasergun = lasergun;
    }

    @Override
    public void useWeapon() {
	this.lasergun.fire();
    }
}

class PhotonBombAdapter implements Weapon {
    PhotonBomb photonBomb;

    public PhotonBombAdapter(PhotonBomb photonBomb) {
	this.photonBomb = photonBomb;
    }

    @Override
    public void useWeapon() {
	this.photonBomb.dropBomb();
    }
}

class SpaceShip {
    private Color laserColor = Color.GREEN;

    public Weapon[] weapons = { new LasergunAdapter(new Lasergun(laserColor)),
	    new LasergunAdapter(new Lasergun(Color.RED)), new PhotonBombAdapter(new PhotonBomb()) };

}

public class AdapterDemoAfter {

    public static void main(String[] args) {
	SpaceShip ship = new SpaceShip();

	for (Weapon weapon : ship.weapons) {
	    weapon.useWeapon();
	}
    }
}
