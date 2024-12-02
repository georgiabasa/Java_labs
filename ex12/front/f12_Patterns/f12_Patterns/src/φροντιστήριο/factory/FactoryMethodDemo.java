package φροντιστήριο.factory;

interface SpaceShip {
    void move();
}

class SpaceShipALPHA implements SpaceShip {
    @Override
    public void move() {
	// moving...
    }
}

class SpaceShipBETA implements SpaceShip {
    @Override
    public void move() {
	// moving...
    }
}

class SpaceShipFactory {

    public static SpaceShip getSpaceShip(int type) {
	if (type == 1)
	    return new SpaceShipALPHA();
	else if (type == 2)
	    return new SpaceShipBETA();
	else
	    return null;
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
	SpaceShip ship1 = SpaceShipFactory.getSpaceShip(1);
	SpaceShip ship2 = SpaceShipFactory.getSpaceShip(2);
    }
}
