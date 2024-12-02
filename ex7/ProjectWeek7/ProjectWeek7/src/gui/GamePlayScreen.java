package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import spaceships.*;

public class GamePlayScreen extends JPanel implements KeyListener{
	private static final long serialVersionUID = 1L;
	
	private SpaceShip userSpaceShip;
	GamePlayScreen(){   	
     	addKeyListener(this);
    	this.setVisible(true); 
    	this.setBackground( Color.BLACK );
    }
	 @Override
	 public void paintComponent (Graphics g) {   	
	        super.paintComponent(g);
	        userSpaceShip.getIcon().paintIcon(this, g, userSpaceShip.getX(), userSpaceShip.getY());
	 }
	@Override
	public void keyPressed (KeyEvent e) {  
		if (e.getKeyCode() == KeyEvent.VK_UP) userSpaceShip.moveUP();
		if (e.getKeyCode() == KeyEvent.VK_DOWN) userSpaceShip.moveDOWN();
		if (e.getKeyCode() == KeyEvent.VK_LEFT) userSpaceShip.moveLEFT();
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) userSpaceShip.moveRIGHT();
	    this.repaint();
    }    
	
	@Override
	public void keyReleased (KeyEvent e) {}    
	
	@Override
	public void keyTyped (KeyEvent e){}
	void setUserSpaceShip(SpaceShip usel) {
		userSpaceShip=usel;
	}
}


