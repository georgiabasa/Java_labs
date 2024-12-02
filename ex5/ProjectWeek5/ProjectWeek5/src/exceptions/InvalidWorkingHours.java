package exceptions;

public class InvalidWorkingHours extends Exception  
{  
	
	
	private static final long serialVersionUID = 1L;

	public InvalidWorkingHours (String str)  
    {  
         super(str);  
    }  
}