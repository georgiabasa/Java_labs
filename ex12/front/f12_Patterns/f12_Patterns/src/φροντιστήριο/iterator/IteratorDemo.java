package φροντιστήριο.iterator;

import java.util.LinkedList;

//Τα είδη των φορτίων που μπορεί να κουβαλήσει το διαστημόπλοιο
enum CargoType {
    FOOD, MINERAL
}

class CargoItem {
    private String name;
    private int weight;
    private int volume;
    public CargoType type;

    public CargoItem(String name, int weight, int volume, CargoType type) {
	this.name = name;
	this.weight = weight;
	this.volume = volume;
	this.type = type;
    }

    @Override
    public String toString() {
	return "CargoItem [name=" + name + ", weight=" + weight + ", volume=" + volume + ", type=" + type + "]";
    }
}

//Το interface ενός iterator που μπορεί να διατρέξει (απαριθμήσει) συλλογές από CargoItem
interface CargoIterator {
    boolean hasNext();

    CargoItem getNext();

    void reset();
}

//Παράδειγμα ενός iterator. Ο συγκεκριμένος απαριθμεί CargoItems ενός συγκεκριμένου είδους κάθε φορά
class IteratorByType implements CargoIterator {
    private CargoArea cargoArea;
    private CargoType type;
    private int currentPosition = 0;

    public IteratorByType(CargoArea cargoArea, CargoType type) {
	this.cargoArea = cargoArea;
	this.type = type;
    }

    @Override
    public boolean hasNext() {
	CargoItem item;
	while (currentPosition < cargoArea.size()) {
	    item = cargoArea.get(currentPosition);
	    
	    if (item.type==type)
		return true;
	    else
		currentPosition++;
	}
	return false;
    }

    @Override
    public CargoItem getNext() {
	if (hasNext()) {
	    CargoItem nextItem = cargoArea.get(currentPosition);
	    currentPosition++;
	    return nextItem;
	} else
	    return null;
    }

    @Override
    public void reset() {
	currentPosition = 0;
    }

}

class CargoArea {
    private LinkedList<CargoItem> cargoItems = new LinkedList<CargoItem>();
    
    public int size() {
	return cargoItems.size();
    }
    
    public CargoItem get(int index) {
	return cargoItems.get(index);
    }
    
    public void load(CargoItem item) {
	cargoItems.push(item);
    }
}

class SpaceShip {
    //Κάθε διαστημόπολοιο έχει και ένα αμπάρι
    public CargoArea cargoArea = new CargoArea();
}

public class IteratorDemo {
    public static void main(String[] args) {
	SpaceShip ship = new SpaceShip();

	ship.cargoArea.load(new CargoItem("gold", 200, 200, CargoType.MINERAL));
	ship.cargoArea.load(new CargoItem("souvlakis", 10, 100, CargoType.FOOD));
	ship.cargoArea.load(new CargoItem("copper", 20, 2000, CargoType.MINERAL));
	ship.cargoArea.load(new CargoItem("salads", 10, 1000, CargoType.FOOD));
	ship.cargoArea.load(new CargoItem("uranium", 20, 1, CargoType.MINERAL));
	ship.cargoArea.load(new CargoItem("apples", 1000, 1000, CargoType.FOOD));

	System.out.println("Food items loaded:");
	IteratorByType foodIterator = new IteratorByType(ship.cargoArea, CargoType.FOOD);
	while (foodIterator.hasNext()) {
	    System.out.println(foodIterator.getNext());
	}
	
	System.out.println("Mineral items loaded:");
	IteratorByType mineralIterator = new IteratorByType(ship.cargoArea, CargoType.MINERAL);
	while (mineralIterator.hasNext()) {
	    System.out.println(mineralIterator.getNext());
	}
	
	

    }
}
