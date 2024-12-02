import tankFuel.*;
public class MainClass {

	public static void main(String[] args) {
		TankFuel myTank=new TankFuel(50);
        boolean fillTank=true;
        double fuelTempo=0.1;
        //fuelTempo=0.2;
        //fuelTempo=0.3;
        while(fillTank){
        	
        	try {
        		myTank.fuelTank(fuelTempo);
        		}
        	catch (InvalidFuelTempoException ex){
        		fillTank=false;
        		System.out.println(ex.getMessage());
        	}
            catch (TankFullException ex) { fillTank=false;}
        } 
        
        System.out.println(myTank.getTankFuel());
        myTank=null;
	}
}
