package demo3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class DemoPanel3 extends JPanel implements KeyListener {
    private int positionX = 0, positionY = 0;

    public DemoPanel3() {
	// Στην αρχή το διαστημόπλοιο θα μπει στη μέση της οθόνης
	this.positionX = (MainClass3.cosmosWidth - MainClass3.spaceShipWidth) / 2;
	this.positionY = (MainClass3.cosmosHeight - MainClass3.spaceShipHeight) / 2;
	// Για να μπορέσει να "ακούσει" τα KeyEvent πρέπει να πάρει το focus
	this.setFocusable(true);
	this.requestFocus();
	// δηλώνουμε τον Listener (δηλ. τον event handler) που θα εκτελεστεί
	// έτσι και προκληθεί KeyEvent
	this.addKeyListener(this);
    }

    // Ο ενδεικνυόμενος τρόπος είναι κάνοντας override την paintComponent
    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setFont(new Font("Arial", Font.PLAIN, 22));
	// Ζωγράφισε ένα κείμενο
	g.drawString("Το δικό μου Panel (3)!", 10, 20);

	// Ζωγραφίζουμε έναν κύκλο (το αντικείμενο g:Graphics ξέρει πως να το κάνει αυτό
	// με τη μέθοδο fillOval())
	g.setColor(Color.black);
	g.fillOval(this.positionX, this.positionY, MainClass3.spaceShipWidth, MainClass3.spaceShipHeight);
	g.setColor(Color.red);
	g.drawOval(this.positionX, this.positionY, MainClass3.spaceShipWidth, MainClass3.spaceShipHeight);
    }

    private void moveShape(int xOffSet, int yOffSet) {
	this.positionX = this.positionX + xOffSet;
	this.positionY = this.positionY + yOffSet;
    }

    @Override
    public void keyPressed(KeyEvent e) {
	System.out.println(e.toString());
	if (e.getKeyCode() == KeyEvent.VK_UP)
	    moveShape(0, -10);
	if (e.getKeyCode() == KeyEvent.VK_DOWN)
	    moveShape(0, 10);
	if (e.getKeyCode() == KeyEvent.VK_LEFT)
	    moveShape(-10, 0);
	if (e.getKeyCode() == KeyEvent.VK_RIGHT)
	    moveShape(10, 0);
	repaint();
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub

    }
}
