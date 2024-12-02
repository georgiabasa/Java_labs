package tankFuel;

public class InvalidFuelTempoException  extends Exception  
{  
	private static final long serialVersionUID = 8040453865442360006L;
	public InvalidFuelTempoException (String str)  
    {  
         super(str);  
    }  
}