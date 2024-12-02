package exceptions.steamengine;

public class SteamEngine {
    public static void main(String[] args) {
	try {
	    monitorEngineStatus();

	} catch (PressureException pe) {
	    System.out.println("Αποσυμπιέζω... 1");
	} catch (TemperatureException te) {
	    System.out.println("Ψύχω... 1");
	} catch (Exception e) {
	    System.out.println("Αποσυμπιέζω και ψύχω... ");
	}
    }

    static void monitorEngineStatus() throws Exception /* PressureException, TemperatureException */ {
	double enginePressure = Math.random();
	double engineTemperature = Math.random();

	try {
	    if ((enginePressure > 0.5) && (engineTemperature <= 0.5)) {
		throw new PressureException("Πολύ μεγάλη πίεση");
	    } else if ((enginePressure <= 0.5) && (engineTemperature > 0.5)) {
		throw new TemperatureException("Πολύ μεγάλη θερμοκρασία");
	    } else if ((enginePressure > 0.5) && (engineTemperature > 0.5)) {
		throw new Exception("Μεγάλη πίεση ΚΑΙ μεγάλη θερμοκρασία");
	    } else {
		System.out.println("Όλα καλά");
	    }
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    throw e;
	}
    }
}
