package spaceships;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.MainClass;

public class SpaceShipENEMY extends SpaceShip{
	static Random random  = new Random();
	public static Image img;
	static
    {
		try{
			SpaceShipENEMY.img=ImageIO.read(MainClass.class.getResource("../images/ENEMY.png"));
			SpaceShipENEMY.img =SpaceShipENEMY.img.getScaledInstance(MainClass.spaceShipWidth, 
					MainClass.spaceShipHeight, 0);
		    
		}
		catch (Exception ex) {System.out.println(ex);}
    }
	public SpaceShipENEMY(){
		super(Color.MAGENTA);
		SpaceShipName="ENEMY";
		horPace=40;
		verPace=40;
		xCoord=MainClass.cosmosWidth-MainClass.spaceShipWidth;
		yCoord=MainClass.yOffSet;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipENEMY.img);
	}
	
	
	
    public void huntUserSpaceShip(SpaceShip userSpaceShip) {
    	int mv = random.nextInt(10);
    	if(mv == 0)this.gun.fire(this.getX(),this.getY()+100);
    	if(userSpaceShip.xCoord>this.xCoord)this.xCoord=this.moveRIGHT();
    	else this.xCoord=this.moveLEFT();
    	
    	int res = random.nextInt(4);	
    	if (res == 2) this.moveLEFT();
    	if (res == 3) this.moveRIGHT();
	} 	
}
//if (res == 0) this.moveUP();
	//if (res == 1)this.moveDOWN();