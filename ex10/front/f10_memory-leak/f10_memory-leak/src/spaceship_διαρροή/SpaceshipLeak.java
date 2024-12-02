package spaceship_διαρροή;

import java.awt.Color;
import java.util.Random;

import spaceship_laserguns.Lasergun;

public class SpaceshipLeak {
    private Random random = new Random();
    Lasergun laserGun = new Lasergun(Color.YELLOW);

    public static void main(String[] args) throws InterruptedException {
	SpaceshipLeak testLeak1 = new SpaceshipLeak();
	testLeak1.fireLasers();
    }

    public void fireLasers() throws InterruptedException {
	for (int i = 0; i < 10000000; i++) {
	    laserGun.fire(random.nextInt(), random.nextInt());
	}

	System.gc();
	Thread.sleep(10000);
	System.out.println("Τέλος");
    }
}
