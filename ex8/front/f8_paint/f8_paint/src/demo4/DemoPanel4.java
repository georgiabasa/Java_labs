package demo4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.sun.source.tree.ParenthesizedTree;

public class DemoPanel4 extends JPanel {
    private int positionX = 0, positionY = 0;
    private int step = 50; // πόσα πίξελ θα κουνιέται σε κάθε βήμα

    // αν πάει αριστερά θα πολλπλασιάσω το βήμα με -1
    // αν πάει δεξιά θα πολλαπλασιάσω το βήμα με 1
    enum DIRECTION {
	LEFT(-1), RIGHT(1);

	private int direction = 1;

	private DIRECTION(int direction) {
	    this.direction = direction;
	}

	public int getDirection() {
	    return this.direction;
	}
    }

    private DIRECTION directionToMove = DIRECTION.RIGHT;

    public DemoPanel4() {
	// Στην αρχή το διαστημόπλοιο θα μπει στη μέση της οθόνης
	this.positionX = (MainClass4.cosmosWidth - MainClass4.spaceShipWidth) / 2;
	this.positionY = (MainClass4.cosmosHeight - MainClass4.spaceShipHeight) / 2;
	// Για να μπορέσει να "ακούσει" τα KeyEvent πρέπει να πάρει το focus
	this.setFocusable(true);
	this.requestFocus();
	// δηλώνουμε τον Listener (δηλ. τον event handler) που θα εκτελεστεί
	// έτσι και προκληθεί KeyEvent
	createAndRunRepeatedTask();
    }

    // Ο ενδεικνυόμενος τρόπος είναι κάνοντας override την paintComponent
    @Override
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setFont(new Font("Arial", Font.PLAIN, 22));
	// Ζωγράφισε ένα κείμενο
	g.drawString("Το δικό μου Panel (4)!", 10, 20);

	paintMyMovingOval(g);
    }

    private void paintMyMovingOval(Graphics g) {
	if ((this.positionX + step + 20) > MainClass4.cosmosWidth) // +20 γιατί το σχήμα έχει πλάτος 20 πίξελ
	    this.directionToMove = DIRECTION.LEFT;
	else if ((this.positionX + step) < 0)
	    this.directionToMove = DIRECTION.RIGHT;

	this.positionX = this.positionX + step * this.directionToMove.getDirection();
	g.setColor(Color.black);

	g.fillOval(this.positionX, this.positionY, MainClass4.spaceShipWidth, MainClass4.spaceShipHeight);
	g.setColor(Color.red);
	g.drawOval(this.positionX, this.positionY, MainClass4.spaceShipWidth, MainClass4.spaceShipHeight);
    }

    private void createAndRunRepeatedTask() {
	TimerTask task = new RepeatedTask(this);
	Timer timer = new Timer();
	timer.schedule(task, 1000, 50);
    }

    // η εργασία που θέλουμε να επαναλαμβάνεται
    class RepeatedTask extends TimerTask {
	DemoPanel4 outerClass;

	public RepeatedTask(DemoPanel4 demoPanel4) {
	    outerClass = demoPanel4;
	}

	public void run() {
	    repaint();
	    // Μπορείτε να κάνετε repaint μόνο την περιοχή που αλλάζει;
	    // System.out.println(outerClass.positionX + ", " + outerClass.positionY);
	}
    }

    private void moveShape(int xOffSet, int yOffSet) {
	this.positionX = this.positionX + xOffSet;
	this.positionY = this.positionY + yOffSet;
    }
}
