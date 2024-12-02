package spaceships;
import main.MainClass;

public class SpaceShipZERO extends SpaceShip{
	
	public SpaceShipZERO(){
		SpaceShipName="ZERO";
		horPace=5;
		verPace=5;
		xCoord=0;
		yCoord=(MainClass.cosmosHeight-MainClass.spaceShipHeight)-MainClass.yOffSet;;
	}
	
}
