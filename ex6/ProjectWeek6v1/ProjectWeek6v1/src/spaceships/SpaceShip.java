package spaceships;
import main.MainClass;
abstract public class SpaceShip implements Navigation{
	protected String SpaceShipName;
	protected int horPace;
	protected int verPace;	
	protected int xCoord;
	protected int yCoord;
	
	public int moveUP() {
		yCoord -= verPace;  
		if(yCoord<=MainClass.yOffSet)yCoord=MainClass.yOffSet;
		return yCoord;
	}
	
	public int moveDOWN() {
		int limit=MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		yCoord += verPace; 
		if(yCoord>=limit)yCoord=limit;
		return yCoord;
	}
	
	public int moveLEFT() {
		xCoord -= horPace;    
 	    if(xCoord<0)xCoord = xCoord+horPace;
		return xCoord;
	}

	public int moveRIGHT() {
		int limit=(MainClass.cosmosWidth-MainClass.spaceShipWidth);   
		xCoord += horPace;
		if(xCoord>=limit)xCoord=limit;
 		return xCoord;
	}
	
	public void printCoords() {
		 System.out.println("Spaceship"+SpaceShipName+" "+ "Xcoords:"+xCoord+" Ycoords:"+yCoord);
	}
}
