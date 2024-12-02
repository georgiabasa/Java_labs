package tankFuel;

public class  TankFullException  extends Exception  
{  
    private static final long serialVersionUID = -7659885812662317799L;
	public TankFullException (String str)  
    {  
         super(str);  
    }  
}