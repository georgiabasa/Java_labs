package tankFuel;

public class TankFuel {
	private final double gasolineTankCapacity;
	private double tankFuel=0.0;
	
	public TankFuel(double gasolineTankCapacity){
		this.gasolineTankCapacity=gasolineTankCapacity;
	}
	
	public double getTankFuel() {
		return tankFuel;
	}
	
	public double getTankCapacity() {
		return gasolineTankCapacity;
	}
	
	public void fuelTank(double fuelTempo) 
			throws InvalidFuelTempoException,TankFullException {
		if ((fuelTempo!=0.1)&& (fuelTempo!=0.2))
			throw new InvalidFuelTempoException("Sorry. Fuel tempo is not supported."); 
		
		if(gasolineTankCapacity==tankFuel)throw new InvalidFuelTempoException("Thank you :-) The tank is now full. Have a good journey.");
		else {
			System.out.println(tankFuel);
			tankFuel=tankFuel+fuelTempo;
			tankFuel = (double)Math.round(tankFuel * 10) / 10;
		
		}
	}

}

/*
class  TankFullException  extends Exception  
{  
    private static final long serialVersionUID = -7659885812662317799L;
	public TankFullException (String str)  
    {  
         super(str);  
    }  
}

class  InvalidFuelTempoException  extends Exception  
{  
	private static final long serialVersionUID = 8040453865442360006L;
	public InvalidFuelTempoException (String str)  
    {  
         super(str);  
    }  
}
*/
/*
public void fuelTank(double fuelTempo){
	if ((fuelTempo!=0.1)&& (fuelTempo!=0.2))System.out.println("Fuel Speed not Supported");
	if(gasolineTankCapacity==tankFuel)System.out.println("Tanks is full");
	else tankFuel=tankFuel+0.1;
}*/